package localvariables;

public class LocalVariablesMain {

    public static void main(String[] args) {

        boolean b = false;
        System.out.println("b: " + b);

        int a = 2;
        System.out.println("a: " + a);

        int i;
        int j;
        i = 3;
        j = 4;

        int k = i;
        System.out.println("i, j, k: " + i + ", " + j + ", " + k);

        String s = "Hello World";
        System.out.println(s);

        {
            int x = 0;
            System.out.println("x: " + x);
            System.out.println("a: " + a);
        }

//        az itt hivatkozott x kívül esik a blokk érvényességi tartományán, azaz nem csak inintializálatlan,
//        hanem definiálatlan is.
//        System.out.println("x: " + x);
    }
}
