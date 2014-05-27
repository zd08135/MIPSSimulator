package instructions;

import main.RegMemOps;
import main.Utils;

/**
 * Created by ZDKING on 14-5-27.
 */
public class Slti implements Instruction{
    int rs, rt;
    short imm;
    public Slti(int rs, int rt, short imm)
    {
        this.imm = imm;
        this.rs = rs;
        this.rt = rt;
    }
    public void run(RegMemOps rmo)
    {
        if(rmo.reg[rs] < (int)imm)
            rmo.reg[rt] = 1;
        else
            rmo.reg[rt] = 0;
        rmo.overflow = 0;
        rmo.setPC(rmo.getPC()+1);
    }
    public String generateIR()
    {
        return Utils.generateBinary(0xa, 6) +
                Utils.generateBinary(rs, 5) +
                Utils.generateBinary(rt, 5) +
                Utils.generateBinary(imm, 16);
    }
}
