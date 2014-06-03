package instructions;

import main.RegMemOps;
import main.Utils;

/**
 * Created by ZDKING on 14-6-3.
 */
public class Bal implements Instruction{
    short offset;
    public Bal(short offset)
    {
        this.offset = offset;
    }
    public void run(RegMemOps rmo)
    {
        int target = (int)offset;
        rmo.reg[31] = rmo.getPC() + 2;
        rmo.setPC(rmo.getPC() + target);
    }
    public String generateIR()
    {
        return Utils.generateBinary(0x1, 6) +
                Utils.generateBinary(0, 5) +
                Utils.generateBinary(0x11, 6) +
                Utils.generateBinary(offset, 16);
    }
}
