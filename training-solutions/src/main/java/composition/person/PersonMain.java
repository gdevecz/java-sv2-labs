package composition.person;

import java.util.Scanner;

public class PersonMain {

    public static void main(String[] args) {
        Person person = new Person("John Doe", "AK47345");
        System.out.println("A személy adatai: " + person.personToString());
        person.moveTo(new Address("magyarország", "Budapest", "Váci út 8.", "1089"));
        System.out.println("A személy adatai: " + person.personToString());
        System.out.println("A lakhely külön: " + person.getAddress().addressToString());
    }
}
