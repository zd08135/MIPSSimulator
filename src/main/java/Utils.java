/**
 * Created by ZDKING on 14-5-16.
 */
public class Utils {

    public static String generateBinary(int num, int bits)
    {
        int i,t;
        String str = new String();
        for(i = 0; i<bits && num!=0; i++)
        {
            t = num%2;
            str = Integer.toString(t) + str;
        }
        for(; i<bits; i++)
            str = Integer.toString(0) + str;
        return str;
    }
}
