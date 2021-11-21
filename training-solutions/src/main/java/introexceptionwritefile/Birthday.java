package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Birthday {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hány születésnapot szeretne rögzíteni? ");
        int counter = 0;
        try {
            counter = sc.nextInt();
        } catch (NumberFormatException nfe) {
            throw new IllegalArgumentException("Woring data!", nfe);
        }
        List<String> birthdays = new ArrayList<>();
        for (; counter > 0; counter--) {
            System.out.print("Név: ");
            String name = sc.nextLine();
            System.out.println("Születésnap: ");
            String birthday = sc.nextLine();
            birthdays.add(name + ", " + birthday);
        }

        try {
            Files.write(Paths.get("src/main/resources/introexceptionwritefile/birthdays.txt"), birthdays);
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Can not write file!", ioe);
        }
    }
}
