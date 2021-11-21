package introexceptioncause;

import java.util.List;

public class PaulStreetBoysMain {

    public static void main(String[] args) {
        PaulStreetBoys psb = new PaulStreetBoys();
        try {
            List<String> names = psb.readNames("src/main/resources/introexceptioncause/palutcaifiuk.txt");
            psb.printNames(names);
        } catch (IllegalStateException ise) {
            System.out.println(ise.getMessage());
            ise.printStackTrace();
            System.out.println("Cause:");
            System.out.println(ise.getCause());
            System.out.println(ise.getCause().getMessage());
            ise.getCause().printStackTrace();
        }
    }

}
