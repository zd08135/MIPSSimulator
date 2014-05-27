package instructions;

import main.RegMemOps;
import main.Utils;

/**
 * instr: clz $rd $rs <br>
 * Created by ZDKING on 14-5-27.
 */
public class Clz implements Instruction{
    int rd,rs;
    /** Create an instance of instr Clz
     * @param rd dest reg
     * @param rs src reg <br>
     */
    public Clz(int rd, int rs)
    {
        this.rd = rd;
        this.rs = rs;
    }
    /** Running instruction with current reg and memo image.
     * @param rmo current reg and memo image <br>
     */
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
