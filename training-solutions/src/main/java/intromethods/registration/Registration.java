package intromethods.registration;

import javax.xml.transform.Source;
import java.time.LocalDate;
import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {

        // A feladat kifejezetten ebbe az osztályba kéri a main-t, és a metódust is
        Registration registration = new Registration();
        Scanner sc = new Scanner(System.in);

        String firstName;
        String lastName;
        String name;
        int yearOfBirth;
        int monthOfBirth;
        int dayOfBirth;
        String email;
        LocalDate birthday;

        System.out.print("Kérem a vezetéknevet: ");
        firstName = sc.nextLine();
        System.out.print("Kérem a keresztnevet: ");
        lastName = sc.nextLine();
        name = registration.concatenatingFirstNamAndLastName(firstName, lastName);
        System.out.println("A megadott név: " + name);

        System.out.println("Kérem a születési adatoka!");
        System.out.print("Év: ");
        yearOfBirth = sc.nextInt();
        System.out.print("Hónap: ");
        monthOfBirth = sc.nextInt();
        System.out.print("Nap: ");
        dayOfBirth = sc.nextInt();
        birthday = registration.getLocalDateFormatFromIntegers(yearOfBirth, monthOfBirth, dayOfBirth);
        System.out.println("A születési adatok: " + yearOfBirth + "." + monthOfBirth + "." + dayOfBirth);
        sc.nextLine();
        System.out.print("Kérem az e-mail címet: ");
        email = sc.nextLine();

        System.out.println("A személy adatai:");
        Person person = new Person(name, birthday, email);
        System.out.println(person);
    }

    public String concatenatingFirstNamAndLastName(String firstName, String lastName) {
        return firstName + " " +lastName;
    }

    public LocalDate getLocalDateFormatFromIntegers(int year, int month, int day) {
        return LocalDate.of(year, month, day);
    }
}
