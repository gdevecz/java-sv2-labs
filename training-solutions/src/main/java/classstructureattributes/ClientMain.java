package classstructureattributes;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();

        Scanner sc = new Scanner(System.in);
        System.out.print("The client name: ");
        client.name = sc.nextLine();
        System.out.print("The client year of birth: ");
        client.year = sc.nextInt();
        sc.nextLine();
        System.out.print("The client address: ");
        client.address=sc.nextLine();

        System.out.println("Name: " + client.name + "\nYear of birth: " + client.year + "\nAddress: " + client.address);
    }


}
