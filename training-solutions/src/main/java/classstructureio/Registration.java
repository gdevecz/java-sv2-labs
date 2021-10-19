package classstructureio;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Your name: ");
        String name = sc.nextLine();
        System.out.print("Your e-mail address: ");
        String email = sc.nextLine();
        System.out.println("You are registered with " + name +" name and " + email + "email address");

        sc.close();
    }
}
