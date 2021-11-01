package stringscanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringScanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem a több tagmondatból álló mondatot:");

        List<String> subSentences = new ArrayList<>();
        String s = sc.nextLine();
        sc = new Scanner(s).useDelimiter(", ");
        while (sc.hasNext()) {
            System.out.print(sc.next() + ", ");
        }
        System.out.println();

        System.out.println("Kérem a több tagmondatból álló mondatot:");
        Scanner sc2 = new Scanner(System.in);
        s = sc2.nextLine();
        sc2 = new Scanner(s).useDelimiter(", ");
        while (sc2.hasNext()) {
            System.out.println(sc2.next());
        }
    }
}
