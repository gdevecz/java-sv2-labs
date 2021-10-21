package stringtype.registration;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        UserValidator userValidator = new UserValidator();

        String userName;

        String password1;

        String password2;

        String email;

        System.out.print("      Username: ");
        userName=sc.nextLine();
        System.out.print("      Password: ");
        password1= sc.nextLine();
        System.out.print("Password again: ");
        password2=sc.nextLine();
        System.out.print("        e-mail: ");
        email=sc.nextLine();

        System.out.println("The " + userName + " is "
                + (userValidator.isValidUsername(userName) ? "" : "not")
                + " valid user name");
        System.out.println("The password is "
                + (userValidator.isValidPassword(password1, password2) ? "" : "not")
                + "valid");
        System.out.println("The " + email + " is "
                + (userValidator.isValidEmail(email) ? "" : "not ")
                + "valid e-mail address");
/*
        System.out.println("\nTest");
        userName = "Abcd E";
        System.out.println("The " + userName + " is "
                + (userValidator.isValidUsername(userName) ? "" : "not")
                + " valid user name");
        userName = "";
        System.out.println("The " + userName + " is "
                + (userValidator.isValidUsername(userName) ? "" : "not")
                + " valid user name");
        password1 = "1s1s1s1s11s1s1s1s1s1s";
        password2 = "1s1s1s1s11s1s1s1s1s1s";
        System.out.println("The password is "
                + (userValidator.isValidPassword(password1, password2) ? "" : "not")
                + " valid");
        password1 = "1s1s1s1s11s1s1s1s1s1s";
        password2 = "s1s1s1s11s1s1s1s1s1s";
        System.out.println("The password is "
                + (userValidator.isValidPassword(password1, password2) ? "" : "not")
                + " valid");
        password1 = "1s1s1s";
        password2 = "1s1s1s";
        System.out.println("The password is "
                + (userValidator.isValidPassword(password1, password2) ? "" : "not")
                + " valid");
        email = "John.Doe@nowhere.com";
        System.out.println("The " + email + " is "
                + (userValidator.isValidEmail(email) ? "" : "not ")
                + "valid e-mail address");
        email = "@akarmi.com";
        System.out.println("The " + email + " is "
                + (userValidator.isValidEmail(email) ? "" : "not ")
                + "valid e-mail address");
        email = "John.Doe@akarmi.com.";
        System.out.println("The " + email + " is "
                + (userValidator.isValidEmail(email) ? "" : "not ")
                + "valid e-mail address");
        email = "John.Doe@akarmicom";
        System.out.println("The " + email + " is "
                + (userValidator.isValidEmail(email) ? "" : "not ")
                + "valid e-mail address");
        email = "";
        System.out.println("The " + email + " is "
                + (userValidator.isValidEmail(email) ? "" : "not ")
                + "valid e-mail address");
*/
    }
}
