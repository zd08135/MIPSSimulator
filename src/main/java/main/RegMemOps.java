package main;

import java.io.OutputStream;

/**
 * An image of registers and memory. </br>
 * Including 32 registers and a memory of 1K size.
 * and 4 bit: overflow, zero, less, carry </br>
 * Created by ZDKING on 14-5-16.
 */
public class RegMemOps {

    public Integer pc;
    public String ir;
    public Integer[] reg;
    public Integer[] mem;
    public Integer overflow, zero, less, carry;

    public RegMemOps()
    {
        pc = new Integer(0);
        overflow = new Integer(0);
        zero = new Integer(0);
        less = new Integer(0);
        carry = new Integer(0);

        reg = new Integer[32];
        mem = new Integer[1024];
        int i;
        for(i = 0; i<32; i++) reg[i] = new Integer(0);
        for(i = 0; i<1024; i++) mem[i] =  new Integer(0);
    }

    public void clean()
    {
        int i;
        pc = overflow = zero = less = carry = null;
        for(i = 0; i<32; i++) reg[i] = null;
        reg = null;
        for(i = 0; i<1024; i++) mem[i] = null;
        mem = null;
    }

    public void setPC(int pc)
    {
        this.pc = null;
        this.pc = new Integer(pc);
    }
    public int getPC()
    {
        return pc.intValue();
    }
    public void setIR(String ir)
    {
        this.ir = ir;
    }
    public void printRegMemOpInfo(OutputStream otsm)
    {
        byte[] res;
        int i,j;
        String str;
        try{
        res = ("IR: " + ir + "\n").getBytes();
        otsm.write(res);
        res = ("After executing:\n").getBytes();
        otsm.write(res);
        res = ("PC: " + Integer.toString(pc) + " ").getBytes();
        otsm.write(res);
        res = ("Overflow|Zero|Less|Carry: " +
                overflow + "|" + zero + "|" + less + "|" + carry + "\n").getBytes();
        otsm.write(res);
        for(i = 0; i<4; i++)
        {
            str = "Reg(" + i*8 + "-" + (i*8+7) + "):\t";
            for(j = 0; j<8; j++)
                str += "0x" + Utils.generateHex(reg[i*8+j].intValue(), 8) + "  ";
            str += "\n";
            res = str.getBytes();
            otsm.write(res);
        }
        res = "\n".getBytes();
        otsm.write(res);
        }catch (Exception e)
        {
            System.err.println(e.getMessage());
        }
    }
}
