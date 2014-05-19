/**
 * Created by ZDKING on 14-5-16.
 */
public class Utils {

    public static String generateBinary(int num, int bits)
    {
        int i,l;
        String str = Integer.toBinaryString(num);
        l = str.length();
        if(l > bits)
        {
            str = str.substring(l-bits,str.length());
        }
        for(i = l; i<bits; i++)
            str = Integer.toString(0) + str;
        return str;
    }

    public static String generateHex(int num, int bits)
    {
        int i,l;
        String str = Integer.toHexString(num);
        l = str.length();
        if(l > bits)
        {
            str = str.substring(l-bits,str.length());
        }
        for(i = l; i<bits; i++)
            str = Integer.toString(0) + str;
        return str;
    }

    public static int parseInt(String str) throws NumberFormatException
    {
        long res;
        if((str.charAt(0) != '0') || (str.length() == 1))
            res = Long.parseLong(str, 10);
        else if((str.charAt(1) == 'x') || (str.charAt(1) == 'X'))
            res = Long.parseLong(str.substring(2), 16);
        else
            res = Long.parseLong(str.substring(1), 8);
        return (int)res;
    }

    public static short parseShort(String str) throws NumberFormatException
    {
        int res;
        if((str.charAt(0) != '0') || (str.length() == 1))
            res = Integer.parseInt(str, 10);
        else if((str.charAt(1) == 'x') || (str.charAt(1) == 'X'))
            res = Integer.parseInt(str.substring(2), 16);
        else
            res = Integer.parseInt(str.substring(1), 8);
        return (short)res;
    }
}
