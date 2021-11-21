package introexceptionfinally;

import java.util.Scanner;

public class Numbers {

    public static void main(String[] args) {
        int number = 1;

        while (number % 2 != 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Kérem a számot: ");
            try {
                int answer = Integer.parseInt(scanner.nextLine());
                number = answer;
            } catch (NumberFormatException nfe) {
                throw new IllegalArgumentException("Wrong input!", nfe);
            } finally {
                System.out.println("End of round.");
            }
        }
    }
}