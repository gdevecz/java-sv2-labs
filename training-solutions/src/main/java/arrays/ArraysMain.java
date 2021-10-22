package arrays;

import java.util.Arrays;

public class ArraysMain {

    public String numberOfDaysAsString() {
        int[] daysOfMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        return Arrays.toString(daysOfMonth);
    }

    public String multiplicationTableAsString(int size) {
        int[][] tmp = new int [size][size];
        for (int i = 0 ; i < size; i++ ) {
            for (int j = 0; j <size; j++) {
                tmp[i][j] = (i +1) * (j + 1);
            }
        }
        return Arrays.deepToString(tmp);
    }

}
