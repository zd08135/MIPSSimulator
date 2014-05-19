import javax.rmi.CORBA.Util;

/**
 * Created by ZDKING on 14-5-16.
 */
interface Instruction {

    public void run(RegMemOps rmo);
    public String generateIR();

}

class Nop implements Instruction{
    public void run(RegMemOps rmo)
    {
        rmo.setPC(rmo.getPC()+1);
    }
    public String generateIR()
    {
        return Utils.generateBinary(0, 32);
    }
}

class Add implements Instruction{
    int rd, rs, rt;
    public Add(int rd, int rs, int rt)
    {
        this.rd = rd;
        this.rs = rs;
        this.rt = rt;
    }
    public void run(RegMemOps rmo)
    {
        long tmp = (long)rmo.reg[rs] + (long)rmo.reg[rt];
        if((tmp > Integer.MAX_VALUE) || (tmp < Integer.MIN_VALUE))
            rmo.overflow = 1;
        else
        {
            rmo.reg[rd] = new Integer((int)tmp);
            rmo.overflow = 0;
        }
        rmo.setPC(rmo.getPC()+1);
    }
    public String generateIR()
    {
        return Utils.generateBinary(0, 6) +
                Utils.generateBinary(rs, 5) +
                Utils.generateBinary(rt, 5) +
                Utils.generateBinary(rd, 5) +
                Utils.generateBinary(0, 5) +
                Utils.generateBinary(32, 6);
    }
}

class Addi implements Instruction{
    int rs, rt;
    short imm;
    public Addi(int rs, int rt, short imm)
    {
        this.imm = imm;
        this.rs = rs;
        this.rt = rt;
    }
    public void run(RegMemOps rmo)
    {
        long tmp = (long)rmo.reg[rs] + (long)imm;
        if((tmp > Integer.MAX_VALUE) || (tmp < Integer.MIN_VALUE))
            rmo.overflow = 1;
        else
        {
            rmo.reg[rt] = new Integer((int)tmp);
            rmo.overflow = 0;
        }
        rmo.setPC(rmo.getPC()+1);
    }
    public String generateIR()
    {
        return Utils.generateBinary(8, 6) +
                Utils.generateBinary(rs, 5) +
                Utils.generateBinary(rt, 5) +
                Utils.generateBinary(imm, 16);
    }
}

class Sub implements Instruction{
    int rd, rs, rt;
    public Sub(int rd, int rs, int rt)
    {
        this.rd = rd;
        this.rs = rs;
        this.rt = rt;
    }
    public void run(RegMemOps rmo)
    {
        long tmp = (long)rmo.reg[rs] - (long)rmo.reg[rt];
        if((tmp > Integer.MAX_VALUE) || (tmp < Integer.MIN_VALUE))
            rmo.overflow = 1;
        else
        {
            rmo.reg[rd] = new Integer((int)tmp);
            rmo.overflow = 0;
        }
        rmo.setPC(rmo.getPC()+1);
    }
    public String generateIR()
    {
        return Utils.generateBinary(0, 6) +
                Utils.generateBinary(rs, 5) +
                Utils.generateBinary(rt, 5) +
                Utils.generateBinary(rd, 5) +
                Utils.generateBinary(0, 5) +
                Utils.generateBinary(34, 6);
    }
}

class Lui implements Instruction{
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
class Bgez implements Instruction{
    int rs;
    short offset;
    public Bgez(int rs, short offset)
    {
        this.rs = rs;
        this.offset = offset;
    }
    public void run(RegMemOps rmo)
    {
        int target = (int)offset;
        if(rmo.reg[rs] >= 0)
            rmo.setPC(rmo.getPC() + target);
        else
            rmo.setPC(rmo.getPC()+1);
    }
    public String generateIR()
    {
        return Utils.generateBinary(1,6) +
                Utils.generateBinary(rs,5) +
                Utils.generateBinary(1,5) +
                Utils.generateBinary(offset,16);
    }
}