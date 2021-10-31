package conversions;

import java.util.Arrays;

public class DigitsMain {

    public static void main(String[] args) {

        Digits digits = new Digits();

        String s = "r3sdf1 235 8wgl9";
        digits.addDigitsToList(s);
        System.out.println((Arrays.toString(digits.getDigits().toArray())));
    }
}
