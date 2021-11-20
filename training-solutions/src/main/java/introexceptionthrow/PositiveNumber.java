package introexceptionthrow;

import java.util.Scanner;

public class PositiveNumber {

    public static void main(String[] args) {

        System.out.print("Kérek egy pozitív számot: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().strip();
        int number;
        int i = 0;
        if (input.charAt(0) == '-' || input.charAt(0) == '+') {
            i++;
        }
        while (i < input.length() && Character.isDigit(input.charAt(i++)))
            ;
        if (i != input.length()) {
            throw new IllegalArgumentException("The input data is not number!");
        } else if ((number = Integer.parseInt(input)) < 1) {
            throw new IllegalArgumentException("Not positive!");
        } else {
            System.out.println(number);
        }
    }
}
