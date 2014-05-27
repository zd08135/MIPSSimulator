package instructions;

/**
 * Created by ZDKING on 14-5-27.
 */
import main.*;

public class Nop implements Instruction{
    public void run(RegMemOps rmo)
    {
        rmo.setPC(rmo.getPC()+1);
    }
    public String generateIR()
    {
        return Utils.generateBinary(0, 32);
    }
}