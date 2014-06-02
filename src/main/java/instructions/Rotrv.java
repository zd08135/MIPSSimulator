package instructions;

import main.RegMemOps;
import main.Utils;

/**
 * Created by ZDKING on 14-6-2.
 */
public class Rotrv implements Instruction {
    int rt, rd, rs;
    public Rotrv(int rd, int rt, int rs)
    {
        this.rd = rd;
        this.rt = rt;
        this.rs = rs;
    }
    public void run(RegMemOps rmo)
    {
        int res = rmo.reg[rt];
        int tmp = rmo.reg[rs];
        res = (res << (32-tmp)) | ((res >> tmp) & ((1<<(32-tmp))-1));
        rmo.reg[rd] = res;
        rmo.setPC(rmo.getPC()+1);
    }
    public String generateIR()
    {
        return Utils.generateBinary(0, 6) +
                Utils.generateBinary(rs, 5) +
                Utils.generateBinary(rt, 5) +
                Utils.generateBinary(rd, 5)+
                Utils.generateBinary(0x1, 5) +
                Utils.generateBinary(0x6, 6);
    }
}

