package looptypes;

public class Sum {

    public void printSums(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            System.out.print(numbers[i] + numbers[i + 1] + " ");
        }
    }
}
