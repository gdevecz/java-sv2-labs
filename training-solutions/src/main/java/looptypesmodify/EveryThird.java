package looptypesmodify;

import java.util.Arrays;

public class EveryThird {

    public int[] changeToZero(int[] numbers) {
        for (int i = numbers.length - 1; i >= 0; i -= 3) {
            numbers[i] = 0;
        }
        return numbers;
    }
}
