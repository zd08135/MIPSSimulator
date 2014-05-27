package instructions;

/**
 * Created by ZDKING on 14-5-27.
 */
import main.*;

public class B implements Instruction{
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
