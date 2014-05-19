/**
 * Created by ZDKING on 14-5-15.
 */

import org.apache.commons.cli.*;

import java.io.*;
import java.util.ArrayList;

public class MIPSSimulator {

    boolean isHelp;
    boolean isStep;
    OutputStream otsm;
    String fileIn;

    MIPSParser parser;
    RegMemOps rmo;

    public static void main(String args[])
    {
        MIPSSimulator simulator = new MIPSSimulator();
        if(simulator.parseArgs(args) == false)
            return;
        try{
        simulator.initialize();
        simulator.parseInstrs();
        simulator.executeInstrs();
        }catch(ParseException pe)
        {
            simulator.parser.printParseException(pe);
        }
    }

    public MIPSSimulator()
    {
        isHelp = false;
        isStep = false;
        fileIn = null;
    }

    public boolean parseArgs(String args[])
    {
        HelpFormatter formatter = new HelpFormatter();
        CommandLineParser cmdParser = new PosixParser();
        CommandLine cl = null;

        Options opts = new Options();
        opts.addOption("h", "help",  false, "print help for the command.");
        opts.addOption("s", "step", false, "show info of each step");
        opts.addOption(OptionBuilder.withArgName("file")
                .withLongOpt("dumpfile")
                .hasArg()
                .withDescription("output of execute information")
                .create("df"));
        String formatStr = "MIPSEmulator [-c/--check][-e/--execute][-h/--help] -df FileName";
        try {
            cl = cmdParser.parse(opts, args);
        } catch (org.apache.commons.cli.ParseException pe) {
            pe.printStackTrace();
            formatter.printHelp(formatStr, opts); // 如果发生异常，则打印出帮助信息
            return false;
        }

        if(cl.hasOption("s")) {
            isStep = true;
        }

        if(cl.hasOption("h")) {
            isHelp = true;
            HelpFormatter hf = new HelpFormatter();
            hf.printHelp(formatStr, "", opts, "");
            return false;
        }

        if(cl.hasOption("dumpfile"))
        {
            try{
            otsm = new FileOutputStream(cl.getOptionValue("dumpfile"));
            }catch (FileNotFoundException fne)
            {
                System.err.println(fne.getMessage());
                return false;
            }
        }
        else
        {
            otsm = System.out;
        }
        String[] res = cl.getArgs();
        fileIn = res[0];
        return true;
    }

    public void initialize()
    {
        try{
           FileInputStream fin;
           fin = new FileInputStream(fileIn);
           parser = new MIPSParser(fin);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public void parseInstrs() throws ParseException
    {
        parser.parse();
    }

    public void executeInstrs()
    {
        ArrayList<Instruction> instrs = parser.getInstrs();
        rmo = new RegMemOps();
        int i = 0,pc;
        int l = instrs.size();
        System.out.println(instrs.size() + " instructions in program");
        System.out.println("Start executing");
        rmo.setPC(0);
        while(true)
        {
            pc = rmo.getPC();
            if((pc < 0) || (pc>=instrs.size()))
                break;
            Instruction instr = instrs.get(pc);
            instr.run(rmo);
            rmo.setIR(instr.generateIR());
            if(isStep == true)
                rmo.printRegMemOpInfo(otsm);
        }
        if(isStep == false)
            rmo.printRegMemOpInfo(otsm);
        rmo.clean();
    }
}
