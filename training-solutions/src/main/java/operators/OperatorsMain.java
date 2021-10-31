package operators;

public class OperatorsMain {

    public static void main(String[] args) {

        Operators operators = new Operators();
        int n = -123;
        int o = 123;
        int p = -124;
        int q = 124;

        System.out.println(Integer.toString(n,2));

        System.out.println(n + " is even: " + operators.isEven(n));
        System.out.println(o + " is even: " + operators.isEven(o));
        System.out.println(p + " is even: " + operators.isEven(p));
        System.out.println(q + " is even: " + operators.isEven(q));

        System.out.println();
        System.out.println(operators.getResultOfDivision(16, 3));

        System.out.println();
        String s = null;
        System.out.println("Not instanced string is null? " + operators.isNull(s));
        System.out.println("Not instanced string is empty? " + operators.isEmpty(s));
        s = "";
        System.out.println(("s = \"\" is null? " + operators.isNull(s)));
        System.out.println(("s = \"\" is empty? " + operators.isEmpty(s)));
        s = " ";
        System.out.println(("s = \" \" is null? " + operators.isNull(s)));
        System.out.println(("s = \" \" is empty? " + operators.isEmpty(s)));
    }
}
