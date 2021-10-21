package statements;

import java.util.Scanner;

public class TimeMain {

    public static void main(String[] args) {

        Time time1;

        Time time2;

        int hours;

        int minutes;

        int seconds;

        Scanner sc = new Scanner(System.in);

        System.out.println("Kérem az első időpont adatait:");
        System.out.print("      óra: ");
        hours = sc.nextInt();
        System.out.print("     perc: ");
        minutes = sc.nextInt();
        System.out.print("másodperc: ");
        seconds = sc.nextInt();
        time1 = new Time(hours, minutes, seconds);
        //sc.nextInt();
        System.out.println("Kérem a második időpont adatait:");
        System.out.print("      óra: ");
        hours = sc.nextInt();
        System.out.print("     perc: ");
        minutes = sc.nextInt();
        System.out.print("másodperc: ");
        seconds = sc.nextInt();
        time2 = new Time(hours, minutes, seconds);

        System.out.println();
        System.out.println("Az első időpont " + time1 + " = " + time1.getInMinutes() + " perc");
        System.out.println("A második időpont " + time2 + " = " + time2.getSeconds() + " másodperc");
        System.out.println("Az első korábbi, mint a második: " + time1.earlierThan(time2));
    }
}
