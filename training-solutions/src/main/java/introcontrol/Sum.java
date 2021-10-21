package introcontrol;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {

        int sum = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.print("Kérem a " + i + ". számot: ");
            sum += sc.nextInt();
        }
        System.out.println("A számok összege: " + sum);
    }
}
