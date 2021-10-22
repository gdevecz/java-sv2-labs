package aslist;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Island {

    public static void main(String[] args) {

        List<String> importantThings = Arrays.asList("Törülköző", "Takaró", "Öngyújó");
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        System.out.println("A kiválasztott dolgok: ");
        System.out.println(importantThings);
        System.out.println("Egy dolgot lecserélhetsz: ");
        for (int i = 0; i < importantThings.size();i ++){
            System.out.println(i + 1 + ". " +importantThings.get(i));
        }
        System.out.println("0. Nem cserélek.");
        choice = sc.nextInt()-1;
        sc.nextLine();

        if (choice != -1) {
            System.out.print("Mire cseréled le a " + importantThings.get(choice) + "t? ");
            importantThings.set(choice, sc.nextLine());
        }
        System.out.println("A véglegesített lista: ");
        System.out.println(importantThings);
    }
}
