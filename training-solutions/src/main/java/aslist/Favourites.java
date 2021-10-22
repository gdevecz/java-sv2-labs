package aslist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Favourites {

    public static void main(String[] args) {

        List<String> favouriteThings = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Kedvenc filmed: ");
        favouriteThings.add(sc.nextLine());
        System.out.print("Kedvenc színészed: ");
        favouriteThings.add(sc.nextLine());
        System.out.print("Kedvenc állatod: ");
        favouriteThings.add(sc.nextLine());

        System.out.println("A lista " + favouriteThings.size() + " elem méretű.");
        System.out.println(favouriteThings);
    }
}
