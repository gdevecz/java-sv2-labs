package stringseparate;

import java.util.ArrayList;
import java.util.Arrays;

public class IceCreamMain {

    public static void main(String[] args) {
        IceCream iceCream = new IceCream();

        iceCream.getIceCreams().addAll(Arrays.asList(new String[]{"csoki", "vanília", "eper", "citrom", "puncs"}));
        System.out.println(iceCream.getIceCreams().size());
        System.out.println(iceCream.getSpecialPrice());
    }
}
