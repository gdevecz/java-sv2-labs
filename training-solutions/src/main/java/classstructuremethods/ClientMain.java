package classstructuremethods;

import java.util.Scanner;

public class ClientMain {

    public static void main(String[] args) {

        Client client = new Client();

        Scanner sc = new Scanner(System.in);
        System.out.print("Name of the client: ");
        client.setName(sc.nextLine());
        System.out.print("Year of birth: ");
        client.setYear(sc.nextInt());
        sc.nextLine();
        System.out.print("Address: ");
        client.setAddress(sc.nextLine());

        System.out.println(client.getName());
        System.out.println(client.getYear());
        System.out.println(client.getAddress());

        System.out.print("New address: ");
        client.migrate(sc.nextLine());

        System.out.println(client.getName());
        System.out.println(client.getYear());
        System.out.println(client.getAddress());

    }
}
