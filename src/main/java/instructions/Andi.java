package instructions;

import main.RegMemOps;
import main.Utils;

/**
 * Created by ZDKING on 14-5-28.
 */
public class Andi implements Instruction{
    int rs, rt;
    short imm;
    public Andi(int rs, int rt, short imm)
    {
        this.imm = imm;
        this.rs = rs;
        this.rt = rt;
    }
    public void run(RegMemOps rmo)
    {
        rmo.reg[rt] = rmo.reg[rs] & (int)imm;
        rmo.setPC(rmo.getPC()+1);
    }
    public String generateIR()
    {
        return Utils.generateBinary(0xc, 6) +
                Utils.generateBinary(rs, 5) +
                Utils.generateBinary(rt, 5) +
                Utils.generateBinary(imm, 16);
    }
}
