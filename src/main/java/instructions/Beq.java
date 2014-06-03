package instructions;

import main.RegMemOps;
import main.Utils;

/**
 * Created by ZDKING on 14-6-3.
 */
public class Beq implements Instruction{
    int rs, rt;
    short offset;
    public Beq(int rs, int rt, short offset)
    {
        this.rs = rs;
        this.rt = rt;
        this.offset = offset;
    }
    public void run(RegMemOps rmo)
    {
        int target = (int)offset;
        if(rmo.reg[rt].equals(rmo.reg[rs]) == true)
            rmo.setPC(rmo.getPC() + target);
        else
            rmo.setPC(rmo.getPC()+1);
    }
    public String generateIR()
    {
        return Utils.generateBinary(0x4, 6) +
                Utils.generateBinary(rs, 5) +
                Utils.generateBinary(rt, 5) +
                Utils.generateBinary(offset, 16);
    }
}
