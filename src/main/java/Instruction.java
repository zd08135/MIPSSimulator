


/**
 * Created by ZDKING on 14-5-16.
 */
interface Instruction {

    public void run(RegMemOps rmo);
    public String generateIR();

}

/* CPU Instruction Control Instructions */
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

/*CPU Arithmetic Instructions */
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
                Utils.generateBinary(0x20, 6);
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
                Utils.generateBinary(0x22, 6);
    }
}

class Clo implements Instruction{
    int rd,rs;
    public Clo(int rd, int rs)
    {
        this.rd = rd;
        this.rs = rs;
    }
    public void run(RegMemOps rmo)
    {
        int res = Integer.numberOfLeadingZeros(~(rmo.reg[rs].intValue()));
        rmo.reg[rd] = new Integer(res);
        rmo.setPC(rmo.getPC()+1);
    }
    public String generateIR()
    {
        return Utils.generateBinary(0x1c, 6) +
                Utils.generateBinary(rs, 5) +
                Utils.generateBinary(rd, 5) +
                Utils.generateBinary(rd, 5) +
                Utils.generateBinary(0x21, 11);
    }
}

class Clz implements Instruction{
    int rd,rs;
    public Clz(int rd, int rs)
    {
        this.rd = rd;
        this.rs = rs;
    }
    public void run(RegMemOps rmo)
    {
        int res = Integer.numberOfLeadingZeros(rmo.reg[rs].intValue());
        rmo.reg[rd] = new Integer(res);
        rmo.setPC(rmo.getPC()+1);
    }
    public String generateIR()
    {
        return Utils.generateBinary(0x1c, 6) +
                Utils.generateBinary(rs, 5) +
                Utils.generateBinary(rd, 5) +
                Utils.generateBinary(rd, 5) +
                Utils.generateBinary(0x20, 11);
    }
}

class Seb implements Instruction{
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

class Seh implements Instruction{
    int rd, rt;
    public Seh(int rd, int rt)
    {
        this.rd = rd;
        this.rt = rt;
    }
    public void run(RegMemOps rmo)
    {
        rmo.reg[rd] = (int)rmo.reg[rt].shortValue();
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
/* CPU Branch and Jump Instructions */
class B implements Instruction{
    short offset;
    public B(short offset)
    {
        this.offset = offset;
    }
    public void run(RegMemOps rmo)
    {
        int target = (int)offset;
        rmo.setPC(rmo.getPC() + target);
    }
    public String generateIR()
    {
        return Utils.generateBinary(0x4, 6) +
                Utils.generateBinary(0, 10) +
                Utils.generateBinary(offset, 16);
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

/* CPU Logical Instructions */
class And implements Instruction{
    int rd, rs, rt;
    public And(int rd, int rs, int rt)
    {
        this.rd = rd;
        this.rs = rs;
        this.rt = rt;
    }
    public void run(RegMemOps rmo)
    {
        rmo.reg[rd] = rmo.reg[rs] & rmo.reg[rt];
        rmo.setPC(rmo.getPC()+1);
    }
    public String generateIR()
    {
        return Utils.generateBinary(0, 6) +
                Utils.generateBinary(rs, 5) +
                Utils.generateBinary(rt, 5) +
                Utils.generateBinary(rd, 5) +
                Utils.generateBinary(0, 5) +
                Utils.generateBinary(0x24, 6);
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

class Xor implements Instruction{
    int rd, rs, rt;
    public Xor(int rd, int rs, int rt)
    {
        this.rd = rd;
        this.rs = rs;
        this.rt = rt;
    }
    public void run(RegMemOps rmo)
    {
        rmo.reg[rd] = rmo.reg[rs] ^ rmo.reg[rt];
        rmo.setPC(rmo.getPC()+1);
    }
    public String generateIR()
    {
        return Utils.generateBinary(0, 6) +
                Utils.generateBinary(rs, 5) +
                Utils.generateBinary(rt, 5) +
                Utils.generateBinary(rd, 5) +
                Utils.generateBinary(0, 5) +
                Utils.generateBinary(0x26, 6);
    }
}