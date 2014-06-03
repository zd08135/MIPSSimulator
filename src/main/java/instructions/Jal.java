package instructions;

import main.RegMemOps;
import main.Utils;

/**
 * Created by ZDKING on 14-6-3.
 */
public class Jal implements Instruction{
    int target;
    public Jal(int target)
    {
        this.target = target;
    }
    public void run(RegMemOps rmo)
    {
        int tmp = rmo.getPC();
        rmo.reg[31] = tmp+2;
        tmp = tmp << 28;
        tmp = tmp | ((target << 2) & 0xfffffff);
        rmo.setPC(tmp);
    }
    public String generateIR()
    {
        return Utils.generateBinary(0x3, 6) +
                Utils.generateBinary(target, 26);
    }
}
