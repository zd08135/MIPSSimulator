package instructions;

/**
 * Created by ZDKING on 14-5-27.
 */

import main.*;

public class Add implements Instruction{
    int rd, rs, rt;
    public Add(int rd, int rs, int rt)
    {
        this.rd = rd;
        this.rs = rs;
        this.rt = rt;
    }
    public void run(RegMemOps rmo)
    {
        long tmp = (long)rmo.reg[rs] + (long)rmo.reg[rt];
        if((tmp > Integer.MAX_VALUE) || (tmp < Integer.MIN_VALUE))
            rmo.overflow = 1;
        else
        {
            rmo.reg[rd] = new Integer((int)tmp);
            rmo.overflow = 0;
        }
        rmo.setPC(rmo.getPC()+1);
    }
    public String generateIR()
    {
        return Utils.generateBinary(0, 6) +
                Utils.generateBinary(rs, 5) +
                Utils.generateBinary(rt, 5) +
                Utils.generateBinary(rd, 5) +
                Utils.generateBinary(0, 5) +
                Utils.generateBinary(0x20, 6);
    }
}
