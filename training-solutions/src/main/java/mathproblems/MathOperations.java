package mathproblems;

import java.util.Scanner;

public class MathOperations {

    public static void main(String[] args) {

        double result;
        Scanner sc = new Scanner(System.in);

        System.out.println("A feladat:");
        System.out.print("100 - (12 + 3) / 7 = ");
        result = sc.nextDouble();
        if ((Math.abs(result - (100 - (12.0 + 3) / 7))) < 0.0001) {
            System.out.println("Helyes válasz, az eredmény: " + (100 - (12.0 + 3) / 7));
        } else {
            System.out.println("Hibás válasz, az eredmény: " + (100 - (12.0 + 3) / 7));
        }
    }
}
