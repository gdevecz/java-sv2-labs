package algorithmscount;

public class Digits {

    public int getCountOfNumbers() {
        int count = 0;
        for (int i = 10; i < 100; i++) {
            if (isSecondDigitBiggerWithFive(i)) {
                count++;
            }
        }
        return count;
    }

    private boolean isSecondDigitBiggerWithFive(int number) {
        if (number / 10 + 5 == number % 10
                || number % 10 + 5 == number / 10) {
            return true;
        }
        return false;
    }
}
