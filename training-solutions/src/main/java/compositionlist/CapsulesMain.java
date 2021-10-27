package compositionlist;

import java.util.List;

public class CapsulesMain {

    public static void main(String[] args) {
        Capsules capsules = new Capsules();

        System.out.println(capsules.getColors().size());
        capsules.addFirst("black");
        System.out.println(capsules.getColors().size());
        capsules.addLast("white");
        capsules.addFirst("green");
        System.out.println(capsules.getColors().size());
        for (String color : capsules.getColors()) {
            System.out.println(color);
        }
        capsules.removeFirst();
        System.out.println(capsules.getColors().size());
        for (String color : capsules.getColors()) {
            System.out.println(color);
        }
        capsules.removeLast();
        System.out.println(capsules.getColors().size());
        for (String color : capsules.getColors()) {
            System.out.println(color);
        }

    }
}
