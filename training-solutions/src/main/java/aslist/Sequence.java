package aslist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Sequence {

    public static void main(String[] args) {
        List<Integer> elements = new ArrayList<>(Arrays.asList(1 ,2));
        Scanner sc = new Scanner(System.in);
        int numberOfAddElements = 5;

        System.out.println("Kérem a listához adandó számokat: ");
        numberOfAddElements+=elements.size();
        for (int i = elements.size(); i < numberOfAddElements; i++) {
            elements.add(sc.nextInt());
        }
        System.out.println("A listában szereplő " + elements.size() + " szám: ");
        System.out.println(elements);
    }
}
