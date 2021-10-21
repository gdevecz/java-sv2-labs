package statements;

public class StatementMain {

    public static void main(String[] args) {

        int x;

        x = 5 + 6;

        int y = 11 - x;

        int z = 8;

//        A következő 2 feladat nem specifikálja az x <= y , illetve a b == false && z<=5 esetet
//        Csak akkor működik biztosan, ha b és c Attributum, de ez is kerülendő, akkor legalább flase értéken
//        inicializáljuk.
//        A feladat specifikált kód:
//        boolean b;
//        if (x > y){
//            b = true;
//        }
//        illetve:
//        boolean c;
//        if (b || z>5) {
//            c = true;
//        }
//        A gond:
//        mi van ha !(x > y) és b-t, vagy !(b || x > 5) és c-t felhasználjuk.
//        error
//        variable b might not have been initialized
//        variable c might not have been initialized

        boolean b = x > y;

        boolean c = b || z > 5;

        z++;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(b);
        System.out.println(c);
    }
}