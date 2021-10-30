package looptypesmodify;

import java.util.Arrays;

public class EveryThirdMain {

    public static void main(String[] args) {
        EveryThird everyThird = new EveryThird();
        int[] numbers = {2, 6, 3, 5, 7, 2, 6, 2, 3, 5, 7, 3, 2, 9};

        System.out.println("tömb:");
        System.out.println(Arrays.toString(numbers));
        System.out.println(("metódus visszaadott értéke:"));
        System.out.println(Arrays.toString(everyThird.changeToZero(numbers)));
        System.out.println("tömb:");
        System.out.println(Arrays.toString(numbers));

    }
}
