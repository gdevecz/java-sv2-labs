package exceptions.sum;

public class NumbersSum {

    public int getSum(int[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Numbers is null.");
        }
        int sum = 0;
        for (int item : numbers) {
            sum+=item;
        }
        return sum;
    }

    public int getSum(String[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Numbers is null.");
        }
        int sum = 0;
        for (String item : numbers) {
            int number;
            try {
                number = Integer.parseInt(item);
            } catch (NumberFormatException nfe) {
                throw new IllegalArgumentException("Input is not number: " + item);
            }
            sum += number;
        }
        return sum;
    }
}
