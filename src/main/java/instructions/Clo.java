package instructions;

/**
 * Created by ZDKING on 14-5-27.
 */
import main.*;

public class Clo implements Instruction{
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
