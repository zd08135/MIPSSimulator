package instructions;

import main.RegMemOps;
import main.Utils;

import javax.rmi.CORBA.Util;

/**
 * Created by ZDKING on 14-5-28.
 */
public class Sll implements Instruction {
    int rt, rd;
    int shamt;
    public Sll(int rd, int rt, int shamt)
    {
        this.rd = rd;
        this.rt = rt;
        this.shamt = shamt;
    }
    public void run(RegMemOps rmo)
    {
        rmo.reg[rd] = rmo.reg[rt] << shamt;
        rmo.setPC(rmo.getPC()+1);
    }
    public String generateIR()
    {
        return Utils.generateBinary(0, 11) +
                Utils.generateBinary(rt, 5) +
                Utils.generateBinary(rd, 5) +
                Utils.generateBinary(shamt, 5)+
                Utils.generateBinary(0, 6);
    }
}
