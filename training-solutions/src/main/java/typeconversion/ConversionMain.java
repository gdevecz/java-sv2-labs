package typeconversion;

import java.util.Arrays;

public class ConversionMain {

    public static void main(String[] args) {
        Conversion conversion = new Conversion();

        System.out.println(conversion.convertDoubleToDouble(12.34));

        System.out.println(Arrays.toString(
                conversion.convertIntArrayToByteArray(new int[] {-1, 0 , 1 , 127, 128, 100})));

        System.out.println(conversion.getFirstDecimal(123.456));
        System.out.println(conversion.getFirstDecimal2(123.456));
        System.out.println(conversion.getFirstDecimal(-123.456));
        System.out.println(conversion.getFirstDecimal2(-123.456));
    }
}
