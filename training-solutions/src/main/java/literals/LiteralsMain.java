package literals;

import java.util.Locale;

public class LiteralsMain {

    public static void main(String[] args) {

        String s = "" + 1 + 2;
        System.out.println(s);
        // Ez nem ajánlott, inkább az elsőt preferáljuk
        s = 1 + "" + 2;
        System.out.println(s);
        s = Integer.toString(1) + Integer.toString(2);
        System.out.println(s);
        s = Integer.toString(1) + 2;
        System.out.println(s);
        s = Character.toString((char)(1 + (int)'1' - 1)) + 2;
        System.out.println(s);

        double quotient = 3 / 4;
        System.out.println(quotient);
        quotient = 3.0 / 4.0;
        System.out.println(quotient);
        quotient = 3D / 4;
        System.out.println(quotient);
        quotient = 3 / 4F;
        System.out.println(quotient);


        long big = 3_244_444_444L;
        System.out.println(big);
        //System.out.println(Long.MAX_VALUE);

        String word = "title".toUpperCase();
        System.out.println(word);

        System.out.println(Integer.toBinaryString(1));
        System.out.println(Integer.toBinaryString(-2));
        System.out.println(Integer.toString(123,2));
        System.out.println(Integer.toString(123,8));
        System.out.println(Integer.toString(123,16));
        System.out.println(Integer.toString(-23,2));
        System.out.println(Integer.toString(-23,8));
        System.out.println(Integer.toString(-23,16));
    }
}
