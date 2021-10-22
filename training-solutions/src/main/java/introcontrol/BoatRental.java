package introcontrol;

import java.util.Scanner;

public class BoatRental {

    public static void main(String[] args) {

        int customers;

        boolean rentableFivePersonBoat = true;

        boolean rentableThreePersonBoat = true;

        boolean rentableTwoPersonBoat = true;

        Scanner sc = new Scanner(System.in);

        System.out.print("Kérem a csoport létszámát: ");
        customers = sc.nextInt();

        if (customers >= 5) {
            customers -= 5;
            System.out.println("Az ötszemélyes csónak ki van adva");
            rentableFivePersonBoat = false;
        }
        if (customers >= 3) {
            customers -= 3;
            System.out.println("A háromszemélyes csónak ki van adva");
            rentableThreePersonBoat = false;
        }
        if (customers > 0) {
            customers -= 2;
            System.out.println("A kétszemélyes csónak ki van adva.");
            rentableTwoPersonBoat = false;
        }
        if (customers > 0) {
            System.out.println("A parton még várakoznak.");
        }
        System.out.println();
        if (rentableFivePersonBoat) {
            System.out.println("Az ötszemélyes csónak még kibérelhető.");
        }if (rentableThreePersonBoat) {
            System.out.println("A háromszemélyes csónak még kibérelhető.");
        }if (rentableTwoPersonBoat) {
            System.out.println("A kétszemélyes csónak még kibérelhető.");
        }
    }
}
