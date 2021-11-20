package introexceptionthrow;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {
        Validation validation = new Validation();
        Exception existException = null;

        Scanner sc = new Scanner(System.in);
        System.out.print("Név: ");
        String name = sc.nextLine();
        try {
            validation.validateName(name);
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
            iae.printStackTrace();
            existException = iae;
        }

        System.out.print("Életkor: ");
        String ageString = sc.nextLine();
        try {
            validation.validateAge(ageString);
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
            iae.printStackTrace();
            existException = iae;
        }

        System.out.println("A megadott adatok:");
        System.out.println("Név: " + name + ", életkor: " + ageString);
        if (existException != null) {
            System.out.println("A gerisztráció sikertelen volt!");
        } else {
            System.out.println("Sikeres regizstráció!");
        }
    }
}
