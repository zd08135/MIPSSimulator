package instructions;

/**
 * Created by ZDKING on 14-5-27.
 */

import main.*;

public class And implements Instruction{
    int rd, rs, rt;
    public And(int rd, int rs, int rt)
    {
        this.rd = rd;
        this.rs = rs;
        this.rt = rt;
    }
    public void run(RegMemOps rmo)
    {
        rmo.reg[rd] = rmo.reg[rs] & rmo.reg[rt];
        rmo.setPC(rmo.getPC()+1);
    }
    public String generateIR()
    {
        return Utils.generateBinary(0, 6) +
                Utils.generateBinary(rs, 5) +
                Utils.generateBinary(rt, 5) +
                Utils.generateBinary(rd, 5) +
                Utils.generateBinary(0, 5) +
                Utils.generateBinary(0x24, 6);
    }
}
