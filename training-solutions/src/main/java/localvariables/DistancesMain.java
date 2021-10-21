package localvariables;

import java.util.Scanner;

public class DistancesMain {

    public static void main(String[] args) {

        Distance distance;

        double distanceKm;

        boolean exact;

        Scanner sc = new Scanner(System.in);
        System.out.print("Distance: ");
        distanceKm = sc.nextDouble();
        sc.nextLine();
        System.out.print("Is the distance exact (true/false)? ");
        exact = sc.nextBoolean();
        distance = new Distance(distanceKm, exact);

        System.out.println("The distance is " + (distance.isExact() ? "" : "not")
                + " exact " + distance.getDistanceInKm() + "Km");
        int i = (int) distance.getDistanceInKm();
        System.out.println("The distance as Integer: " + i);
    }

}
