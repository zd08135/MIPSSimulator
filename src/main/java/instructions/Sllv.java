package instructions;

import main.RegMemOps;
import main.Utils;

/**
 * Created by ZDKING on 14-5-28.
 */
public class Sllv implements Instruction {
    int rt, rd, rs;
    public Sllv(int rd, int rt, int rs)
    {
        this.rd = rd;
        this.rt = rt;
        this.rs = rs;
    }
    public void run(RegMemOps rmo)
    {
        rmo.reg[rd] = rmo.reg[rt] << rmo.reg[rs];
        rmo.setPC(rmo.getPC()+1);
    }
    public String generateIR()
    {
        return Utils.generateBinary(0, 11) +
                Utils.generateBinary(rs, 5) +
                Utils.generateBinary(rt, 5) +
                Utils.generateBinary(rd, 5)+
                Utils.generateBinary(0x4, 6);
    }
}
