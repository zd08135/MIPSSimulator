package instructions;

import main.RegMemOps;
import main.Utils;

/**
 * Created by ZDKING on 14-6-3.
 */
public class Bgezal implements Instruction{
    int rs;
    short offset;
    public Bgezal(int rs, short offset)
    {
        this.rs = rs;
        this.offset = offset;
    }
    public void run(RegMemOps rmo)
    {
        int target = (int)offset;
        rmo.reg[31] = rmo.getPC() + 2;
        if(rmo.reg[rs] >= 0)
            rmo.setPC(rmo.getPC() + target);
        else
            rmo.setPC(rmo.getPC() + 1);
    }
    public String generateIR()
    {
        return Utils.generateBinary(0x1, 6) +
                Utils.generateBinary(rs, 5) +
                Utils.generateBinary(0x11, 6) +
                Utils.generateBinary(offset, 16);
    }
}

