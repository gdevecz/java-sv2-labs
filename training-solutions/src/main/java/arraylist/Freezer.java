package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Freezer {

    public static void main(String[] args) {

        List<String> listOfItems = new ArrayList<>();
        listOfItems.add("Sör");
        listOfItems.addAll(Arrays.asList("Tej", "Szalámi", "Üdítő"));
        listOfItems.add("Margarin");

        System.out.println(listOfItems.size());
        System.out.println(listOfItems);
        listOfItems.remove(1);
        listOfItems.remove("Üdítő");
        System.out.println(listOfItems.size());
        System.out.println(listOfItems);

    }
}
