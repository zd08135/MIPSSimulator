package instructions;

/**
 * Created by ZDKING on 14-5-27.
 */

import main.*;

public class Addi implements Instruction{
    int rs, rt;
    short imm;
    public Addi(int rs, int rt, short imm)
    {
        this.imm = imm;
        this.rs = rs;
        this.rt = rt;
    }
    public void run(RegMemOps rmo)
    {
        long tmp = (long)rmo.reg[rs] + (long)imm;
        if((tmp > Integer.MAX_VALUE) || (tmp < Integer.MIN_VALUE))
            rmo.overflow = 1;
        else
        {
            rmo.reg[rt] = new Integer((int)tmp);
            rmo.overflow = 0;
        }
        rmo.setPC(rmo.getPC()+1);
    }
    public String generateIR()
    {
        return Utils.generateBinary(8, 6) +
                Utils.generateBinary(rs, 5) +
                Utils.generateBinary(rt, 5) +
                Utils.generateBinary(imm, 16);
    }
}
