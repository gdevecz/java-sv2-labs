package aslist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Sequence {

    public static void main(String[] args) {
        List<Integer> elements = new ArrayList<>(Arrays.asList(1 ,2));
        Scanner sc = new Scanner(System.in);
        int newSizeOfElements = elements.size() + 5;

        for (int i = elements.size(); i <  newSizeOfElements; i++) {
            elements.add(elements.get(i - 2) * elements.get(i -1));
        }
        System.out.println("A listában szereplő " + elements.size() + " szám: ");
        System.out.println(elements);
    }
}
