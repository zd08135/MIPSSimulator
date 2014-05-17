/**
 * Created by ZDKING on 14-5-15.
 */

import org.apache.commons.cli.*;

import java.io.*;
import java.util.ArrayList;

public class MIPSSimulator {

    boolean isCheck;
    boolean isExecute;
    boolean isHelp;
    OutputStream ots;
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
        isCheck = false;
        isExecute = false;
        isHelp = false;
        fileIn = null;
    }

    public boolean parseArgs(String args[])
    {
        HelpFormatter formatter = new HelpFormatter();
        CommandLineParser cmdParser = new PosixParser();
        CommandLine cl = null;

        Options opts = new Options();
        opts.addOption("c", "check", false, "check syntax errors");
        opts.addOption("e", "execute", false, "execute the program");
        opts.addOption("h", "help",  false, "print help for the command.");
        opts.addOption(OptionBuilder.withArgName("file")
                .hasArg()
                .withDescription("output of execute information")
                .create("logfile"));
        String formatStr = "MIPSEmulator [-c/--check][-e/--execute][-h/--help] -O FileName";
        try {
            cl = cmdParser.parse(opts, args);
        } catch (org.apache.commons.cli.ParseException pe) {
            pe.printStackTrace();
            formatter.printHelp(formatStr, opts); // 如果发生异常，则打印出帮助信息
            return false;
        }

        if(cl.hasOption("c")) {
            isCheck = true;
        }

        if(cl.hasOption("e")) {
            isExecute = true;
        }

        if(cl.hasOption("h")) {
            isHelp = true;
            HelpFormatter hf = new HelpFormatter();
            hf.printHelp(formatStr, "", opts, "");
            return false;
        }

        if(cl.hasOption("logfile"))
        {
            try{
            ots = new FileOutputStream(cl.getOptionValue("logfile"));
            }catch (FileNotFoundException fne)
            {
                System.err.println(fne.getMessage());
                return false;
            }
        }
        else
        {
            ots = System.out;
        }
        String[] res = cl.getArgs();
        fileIn = res[0];
        System.out.println(res.length + "," + fileIn);
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
        System.out.println("inistialize()");

    }

    public void parseInstrs() throws ParseException
    {
        System.out.println("parseInstrs()");
        parser.parse();
    }

    public void executeInstrs()
    {
        ArrayList<Instruction> instrs = parser.getInstrs();
        rmo = new RegMemOps();
        int i = 0;
        int l = instrs.size();
        System.out.println(instrs.size() + " instructions in program");
        System.out.println("Start executing");
        for(i = 0; i<l; i++)
        {
            Instruction instr = instrs.get(i);
            instr.run(rmo);
        }
    }
}
