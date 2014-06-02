package instructions;

import main.RegMemOps;
import main.Utils;

/**
 * Created by ZDKING on 14-6-2.
 */
public class Sra implements Instruction {
    int rt, rd;
    int shamt;
    public Sra(int rd, int rt, int shamt)
    {
        this.rd = rd;
        this.rt = rt;
        this.shamt = shamt;
    }
    public void run(RegMemOps rmo)
    {
        rmo.reg[rd] = rmo.reg[rt] >> shamt;
        rmo.setPC(rmo.getPC()+1);
    }
    public String generateIR()
    {
        return Utils.generateBinary(0, 11) +
                Utils.generateBinary(rt, 5) +
                Utils.generateBinary(rd, 5) +
                Utils.generateBinary(shamt, 5)+
                Utils.generateBinary(0x3, 6);
    }
}
