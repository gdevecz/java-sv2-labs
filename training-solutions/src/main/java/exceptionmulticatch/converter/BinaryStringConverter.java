package exceptionmulticatch.converter;

import interfacedependencyinversion.Box;

import java.util.Arrays;

public class BinaryStringConverter {

    public boolean[] binaryStringToBooleanArray(String str) {
        if (str == null) {
            throw new NullPointerException("Binary string is null.");
        }
        boolean[] booleans = new boolean[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char actual = str.charAt(i);
            if (actual != '0' && actual != '1') {
                throw new IllegalArgumentException("Binary string is not valid.");
            }
            booleans[i] = (actual == '0' ? false : true);
        }
        return booleans;
    }

    public String booleanArrayToBinaryString(boolean[] booleans) {
        StringBuilder sb = new StringBuilder();
        if (booleans == null) {
            throw new NullPointerException("Boolean array is null.");
        }
        if (booleans.length == 0) {
            throw new IllegalArgumentException("Boolean array is empty.");
        }
        for (boolean actual : booleans) {
            sb.append(actual ? 1 : 0);
        }
        return sb.toString();
    }
}
