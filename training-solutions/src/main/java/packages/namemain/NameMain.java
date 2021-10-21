package packages.namemain;

import packages.prefix.Prefix;
import packages.firstname.FirstName;
import packages.lastname.LastName;

public class NameMain {

    public static void main(String[] args) {

        Prefix prefix = new Prefix("dr.");
        FirstName firstName = new FirstName("Troppauer");
        LastName lastName = new LastName("Hümér");

        System.out.println(prefix.getPre() + " " + firstName.getFirstName() + " " + lastName.getLastName());
    }
}
