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
        if((str.charAt(0) != '0') || (str.length() == 1))
            return Integer.parseInt(str, 10);
        if((str.charAt(1) == 'x') || (str.charAt(1) == 'X'))
            return Integer.parseInt(str.substring(2), 16);
        return Integer.parseInt(str.substring(1), 8);
    }
}
