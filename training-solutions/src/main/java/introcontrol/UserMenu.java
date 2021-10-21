package introcontrol;

import java.util.Scanner;

public class UserMenu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int option;

        System.out.println("1. Felhasználók listázása");
        System.out.println("2. Felhasználó felvétele");
        System.out.println("Többi: Kilépés");

        option = sc.nextInt();
        if (option == 1) {
            System.out.println("Felhasználók listázása");
        }
        if (option == 2) {
            System.out.println("Felhasználó felvétele");
        }
    }
}
