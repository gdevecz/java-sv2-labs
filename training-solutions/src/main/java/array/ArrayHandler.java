package array;

import distjar.Main;

public class ArrayHandler {

    public void addIndexToNumber(int[] source) {
        for (int i = 0; i < source.length; i++) {
            source[i] += i;
        }

    }

    public void concatenateIndexToWord(String[] source) {
        for (int i = 0; i < source.length; i++) {
            source[i] = i + source[i];
        }
    }
}
