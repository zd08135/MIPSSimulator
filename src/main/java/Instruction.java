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
        rmo.reg[rd] = rmo.reg[rt] + rmo.reg[rs];
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

class AddI implements Instruction{
    int imm, rs, rt;
    public AddI(int rs, int rt, int imm)
    {
        this.imm = imm;
        this.rs = rs;
        this.rt = rt;
    }
    public void run(RegMemOps rmo)
    {
        rmo.reg[rt] = rmo.reg[rs] + imm;
    }
    public String generateIR()
    {
        return Utils.generateBinary(8, 6) +
                Utils.generateBinary(rs, 5) +
                Utils.generateBinary(rt, 5) +
                Utils.generateBinary(imm, 16);
    }
}