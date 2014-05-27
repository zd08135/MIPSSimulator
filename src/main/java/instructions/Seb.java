package instructions;

import main.RegMemOps;
import main.Utils;

/**
 * Created by ZDKING on 14-5-27.
 */
public class Seb implements Instruction{
    int rd, rt;
    public Seb(int rd, int rt)
    {
        this.rd = rd;
        this.rt = rt;
    }
    public void run(RegMemOps rmo)
    {
        rmo.reg[rd] = (int)rmo.reg[rt].byteValue();
        rmo.setPC(rmo.getPC()+1);
    }
    public String generateIR()
    {
        return Utils.generateBinary(0x1f, 6) +
                Utils.generateBinary(0, 5) +
                Utils.generateBinary(rt, 5) +
                Utils.generateBinary(rd, 5) +
                Utils.generateBinary(0x10, 5)+
                Utils.generateBinary(0x20, 6);
    }
}
