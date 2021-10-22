package looptypes;

public class Sum {

    public static void main(String[] args) {
        Sum sum = new Sum();

        sum.printSums(new int[]{2, 6, 3, 5, 7, 9});
    }

    public void printSums(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            System.out.print(numbers[i] + numbers[i + 1] + " ");
        }
    }
}
