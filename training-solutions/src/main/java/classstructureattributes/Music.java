package classstructureattributes;

import java.util.Scanner;

public class Music {

    public static void main(String[] args) {
        Song song = new Song();
        Scanner sc = new Scanner(System.in);
        System.out.print("Name of band: ");
        song.band=sc.nextLine();
        System.out.print("Title of song: ");
        song.title = sc.nextLine();
        System.out.print("Length of song: ");
        song.length = sc.nextInt();

        System.out.println("Your favorite song:");
        System.out.println(song.band + " - " + song.title + " (" +song.length + " perc)");
    }
}
