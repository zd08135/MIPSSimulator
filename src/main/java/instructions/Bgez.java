package instructions;

/**
 * Created by ZDKING on 14-5-27.
 */
import main.*;

public class Bgez implements Instruction{
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
        return Utils.generateBinary(1, 6) +
                Utils.generateBinary(rs, 5) +
                Utils.generateBinary(1, 5) +
                Utils.generateBinary(offset, 16);
    }
}

