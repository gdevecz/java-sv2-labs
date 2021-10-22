package arrays;

import java.util.Arrays;

public class ArraysMain {

    public String numberOfDaysAsString() {
        int[] daysOfMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        return Arrays.toString(daysOfMonth);
    }

    public String multiplicationTableAsString(int size) {
        String tmp = "";
        for (int i = 1 ; i <= size; i++ ) {
            for (int j = 1; j <=size; j++) {
                tmp += i * j + " ";
            }
            tmp += "\n";
        }
        return tmp;
    }

}
