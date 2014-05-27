package instructions;

import main.RegMemOps;
import main.Utils;

/**
 * Created by ZDKING on 14-5-27.
 */
public class Sub implements Instruction{
    int rd, rs, rt;
    public Sub(int rd, int rs, int rt)
    {
        this.rd = rd;
        this.rs = rs;
        this.rt = rt;
    }
    public void run(RegMemOps rmo)
    {
        long tmp = (long)rmo.reg[rs] - (long)rmo.reg[rt];
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
                Utils.generateBinary(0x22, 6);
    }
}
