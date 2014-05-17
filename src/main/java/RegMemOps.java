
import java.io.OutputStream;

/**
 * Created by ZDKING on 14-5-16.
 */
public class RegMemOps {

    public int pc;
    public String ir;
    public int[] reg;
    public int[] mem;
    public int overflow, zero, less, carry;

    public RegMemOps()
    {
        overflow = zero = less = carry = 0;
        reg = new int[32];
        mem = new int[1024];
        int i;
        for(i = 0; i<32; i++) reg[i] = 0;
        for(i = 0; i<1024; i++) mem[i] = 0;
    }

    public void printRegMemOpInfo(OutputStream ots)
    {
        byte[] res;
        int i,j;
        try{
        res = ("PC: " + Integer.toString(pc)).getBytes();
        ots.write(res);
        res = ("IR" + ir + "\n").getBytes();
        ots.write(res);
        res = ("Overflow|Zero|Less|Carry: " +
                overflow + "|" + zero + "|" + less + "|" + carry + "\n").getBytes();
        ots.write(res);
        for(i = 0; i<4; i++)
        {
            String str = "Reg(" + i*8 + "-" + i*8+7 + "): ";
            for(j = 0; j<8; j++)
                str += Integer.toString(reg[i * 8 + j], 16) + " ";
            str += "\n";
            res = str.getBytes();
            ots.write(res);
        }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
