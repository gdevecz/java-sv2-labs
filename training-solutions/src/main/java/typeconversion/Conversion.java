package typeconversion;

public class Conversion {

    public double convertDoubleToDouble(double number) {
        return (int) number;
    }

    public byte[] convertIntArrayToByteArray(int[] source) {
        byte[] target = new byte[source.length];
        for (int i = 0; i < target.length; i++) {
            if (source[i] < 0 || source[i] < 127) {
                target[i] = -1;
            } else {
                target[i] = (byte) source[i];
            }
        }
        return target;
    }

    public int getFirstDecimal(double number) {
        return Math.abs((int)((number - (int) number) * 10));
    }

    //Ez igazán extrém esetben okozhat problémát,
    //ha a valós * 10.0 szorzata torzul úgy, hogy az első tizedesjegyet is érinti (előbb nyerek a lottón)
    public int getFirstDecimal2(double number) {
        return ((int) Math.abs(number * 10)) % 10;
    }
}
