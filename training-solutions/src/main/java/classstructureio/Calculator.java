package classstructureio;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.print("First number: ");
        Scanner sc = new Scanner(System.in);
        int leftNumber = sc.nextInt();
        System.out.print("Second number: ");
        int rightNumber = sc.nextInt();
        System.out.println(leftNumber + " + " + rightNumber);
        System.out.println(leftNumber + rightNumber);
    }
}
