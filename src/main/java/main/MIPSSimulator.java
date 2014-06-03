package main;
/**
 * Created by ZDKING on 14-5-15.
 */

import instructions.Instruction;
import org.apache.commons.cli.*;

import java.io.*;
import java.util.ArrayList;
import parser.*;

public class MIPSSimulator {

    boolean isHelp;
    boolean isStep;
    OutputStream otsm;
    String fileIn;
    FileInputStream fin;

    MIPSParser mipsParser;
    RegMemOps rmo;

    public static void main(String args[])
    {
        MIPSSimulator simulator = new MIPSSimulator();
        if(simulator.parseArgs(args) == false)
            return;
        try{
        if(simulator.initialize() == false)
            return;
        simulator.parseInstrs();
        simulator.executeInstrs();
        simulator.clean();
        }catch(TokenMgrError err)
        {
            System.err.println(err.getMessage());
        }
        catch(parser.ParseException pe)
        {
            simulator.mipsParser.printParseException(pe);
        }
        catch(IOException ioe)
        {
            System.err.println(ioe.getMessage());
        }
    }

    public MIPSSimulator()
    {
        isHelp = false;
        isStep = false;
        fileIn = null;
        fin = null;
    }

    public void clean() throws IOException
    {
        rmo.clean();
        fin.close();
        if(otsm instanceof FileOutputStream)
            otsm.close();
    }
    public boolean parseArgs(String args[])
    {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setWidth(100);
        CommandLineParser cmdParser = new PosixParser();
        CommandLine cl = null;

        Options opts = new Options();
        opts.addOption("h", "help",  false, "print help for the command");
        opts.addOption("v", "version", false, "print version information");
        opts.addOption("s", "step", false, "print info of each step(if not, only print when ends) ");
        opts.addOption(OptionBuilder.withArgName("dffile")
                .withLongOpt("dumpfile")
                .hasArg()
                .withDescription("file for printing execute information(if not, print in stdout)")
                .create("df"));
        String formatStr = "MIPSEmulator [-h/--help][-v/--version][-s/--step][-df <dffile>] <FileName>";
        try {
            cl = cmdParser.parse(opts, args);
        } catch (org.apache.commons.cli.ParseException pe) {
            System.err.println(pe.getMessage());
            formatter.printHelp(formatStr, opts); // 如果发生异常，则打印出帮助信息
            return false;
        }

        if(cl.hasOption("v")) {
            System.out.println("MIPSSimulator v1.0");
            return false;
        }
        if(cl.hasOption("s")) {
            isStep = true;
        }

        if(cl.hasOption("h")) {
            isHelp = true;
            formatter.printHelp(formatStr, "", opts, "");
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
        if(res.length == 0)
        {
            System.err.println("No input file found, exit");
            return false;
        }
        fileIn = res[0];
        return true;
    }

    public boolean initialize()
    {
        try{
           fin = new FileInputStream(fileIn);
           mipsParser = new MIPSParser(fin);
        }
        catch(Exception e)
        {
            System.err.println(e.getMessage());
            return false;
        }
        return true;
    }

    public void parseInstrs() throws parser.ParseException
    {
        mipsParser.parse();
    }

    public void executeInstrs()
    {
        ArrayList<Instruction> instrs = mipsParser.getInstrs();
        rmo = new RegMemOps();
        int i = 0,pc;
        int l = instrs.size();
        int count = 0;
        System.out.println("Start executing");
        rmo.setPC(0);
        while(true)
        {
            pc = rmo.getPC();
            if((pc < 0) || (pc>=instrs.size()))
                break;
            Instruction instr = instrs.get(pc);
            instr.run(rmo);
            count++;
            rmo.setIR(instr.generateIR());
            if(isStep == true)
                rmo.printRegMemOpInfo(otsm);
        }
        if(isStep == false)
            rmo.printRegMemOpInfo(otsm);
        System.out.println("Execute " + instrs.size() + " instrs.");
        System.out.println("Totally execute by " + count + " times.");
        System.out.println("End executing");
    }
}
