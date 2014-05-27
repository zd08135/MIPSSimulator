package instructions;

import main.RegMemOps;
import main.Utils;

/**
 * Created by ZDKING on 14-5-27.
 */
public class Lui implements Instruction{
    int rt;
    short imm;
    public Lui(int rt, short imm)
    {
        this.rt = rt;
        this.imm = imm;
    }
    public void run(RegMemOps rmo)
    {
        long tmp = (long)imm << 16;
        rmo.reg[rt] = new Integer((int)tmp);
        rmo.setPC(rmo.getPC()+1);
    }
    public String generateIR()
    {
        return Utils.generateBinary(0xf, 6) +
                Utils.generateBinary(0, 5) +
                Utils.generateBinary(rt, 5) +
                Utils.generateBinary(imm, 16);
    }
}
