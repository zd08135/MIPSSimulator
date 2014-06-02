package instructions;

import main.RegMemOps;
import main.Utils;

/**
 * Created by ZDKING on 14-6-2.
 */
public class Srl implements Instruction {
    int rt, rd;
    int shamt;
    public Srl(int rd, int rt, int shamt)
    {
        this.rd = rd;
        this.rt = rt;
        this.shamt = shamt;
    }
    public void run(RegMemOps rmo)
    {
        int res = rmo.reg[rt] >> shamt;
        res = res & ((1<<shamt)-1);
        rmo.reg[rd] = res;
        rmo.setPC(rmo.getPC()+1);
    }
    public String generateIR()
    {
        return Utils.generateBinary(0, 11) +
                Utils.generateBinary(rt, 5) +
                Utils.generateBinary(rd, 5) +
                Utils.generateBinary(shamt, 5)+
                Utils.generateBinary(0x2, 6);
    }
}
