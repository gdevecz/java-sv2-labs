package statements;

import  java.util.Scanner;

public class DivByThree {

    public static void main(String[] args) {

        int number;

        Scanner sc = new Scanner(System.in);

        System.out.print("Kérek egy számot: ");
        number = sc.nextInt();
        System.out.println("A megadott szám (" + number + ")" + (number % 3 == 0 ? " " : " nem ") + "osztható 3-mal.");
    }
}
