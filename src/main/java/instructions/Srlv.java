package instructions;

import main.RegMemOps;
import main.Utils;

/**
 * Created by ZDKING on 14-6-2.
 */
public class Srlv implements Instruction {
    int rt, rd, rs;
    public Srlv(int rd, int rt, int rs)
    {
        this.rd = rd;
        this.rt = rt;
        this.rs = rs;
    }
    public void run(RegMemOps rmo)
    {
        int tmp = rmo.reg[rs];
        int res = rmo.reg[rt] >> tmp;
        res = res & ((1<<tmp)-1);
        rmo.reg[rd] = res;
        rmo.setPC(rmo.getPC()+1);
    }
    public String generateIR()
    {
        return Utils.generateBinary(0, 11) +
                Utils.generateBinary(rs, 5) +
                Utils.generateBinary(rt, 5) +
                Utils.generateBinary(rd, 5)+
                Utils.generateBinary(0x6, 6);
    }
}
