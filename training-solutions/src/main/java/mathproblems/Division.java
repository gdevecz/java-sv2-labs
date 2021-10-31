package mathproblems;

public class Division {

    public void getDivisors(int number) {
        for (int i = 1; i <= (number / 2); i++) {
            if (number % i == 0) {
                System.out.println(number + " osztója: " + i);
            }
        }
        System.out.println(number + " osztója: " + number);
    }

    public void getRightNumbers(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] % i == 0) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
