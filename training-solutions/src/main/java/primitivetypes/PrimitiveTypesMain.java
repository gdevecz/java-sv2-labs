package primitivetypes;

import java.sql.SQLOutput;

public class PrimitiveTypesMain {

    public static void main(String[] args) {

        System.out.println("Integer/int:");
        int a = 2; // primitív egész változó (definiálás+)deklarálás és inicializálás
        System.out.println(a);
        Integer b = 2;  // Autoboxing (itt megegyezik a new Integer(2)-vel), a fordító autómatikusan beilleszti
        System.out.println(b);
        Integer c = a;  // Autoboxing
        System.out.println(c);
        Integer d = b;  // Autoboxing
        System.out.println(d);
        Integer e = new Integer(2);
        System.out.println(e);
        int f = new Integer(2); //unboxing
        System.out.println(f);
        int g = new Integer(a);      // unboxing()
        System.out.println(g);
        int h = new Integer(c);      // unboxing
        System.out.println(h);
        int i = Integer.parseInt("2");  //a parseInt int et ad vissza
        System.out.println(i);
        Integer j = Integer.parseInt("2"); //a visszaadott int dobozolva  Integerré
        System.out.println(j);

        System.out.println("Boolean/boolean");
        boolean k = true;
        System.out.println(k);
        Boolean l = true;       // indirekt bedobozolás
        System.out.println(l);
        boolean m = new Boolean("true");   //indirekt kidobozolás
        System.out.println(m);
        Boolean n = new Boolean("true");
        System.out.println(n);
        boolean o = Boolean.parseBoolean("TrUe");
        System.out.println(o);
        Boolean p = Boolean.parseBoolean("TrUe"); //boxing
        System.out.println(p);
        boolean q = Boolean.parseBoolean("TreU");   // Ez false és unboxing
        System.out.println(q);
        Boolean r = Boolean.parseBoolean("TreU");   // False
        System.out.println(r);
    }
}
