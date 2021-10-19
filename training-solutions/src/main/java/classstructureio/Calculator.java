package classstructureio;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        int leftNumber;
        int rightNumber;
        Scanner sc = new Scanner(System.in);

        System.out.print("First number: ");
        leftNumber = sc.nextInt();
        System.out.print("Second number: ");
        rightNumber = sc.nextInt();
        System.out.println(leftNumber + " + " + rightNumber);
        System.out.println(leftNumber + rightNumber);
    }
}
