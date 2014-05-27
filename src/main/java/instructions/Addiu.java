package instructions;

/**
 * Created by ZDKING on 14-5-27.
 */
import main.*;

public class Addiu implements Instruction{
    int rs, rt;
    short imm;
    public Addiu(int rs, int rt, short imm)
    {
        this.imm = imm;
        this.rs = rs;
        this.rt = rt;
    }
    public void run(RegMemOps rmo)
    {
        long tmp = (long)rmo.reg[rs] + (long)imm;
        tmp = tmp & (long)0xffffffff;
        rmo.reg[rt] = new Integer((int)tmp);
        rmo.overflow = 0;
        rmo.setPC(rmo.getPC()+1);
    }
    public String generateIR()
    {
        return Utils.generateBinary(0x9, 6) +
                Utils.generateBinary(rs, 5) +
                Utils.generateBinary(rt, 5) +
                Utils.generateBinary(imm, 16);
    }
}

