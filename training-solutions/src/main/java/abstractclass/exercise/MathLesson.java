package abstractclass.exercise;

public class MathLesson {

    public static void main(String[] args) {
        Adder adder = new Adder();
        Subtracter subtracter = new Subtracter();
        Multiplier multiplier = new Multiplier();
        Divisor divisor = new Divisor();

        int a = 10;
        int b = 3;
        System.out.println(adder.getSolution(a, b));
        System.out.println(subtracter.getSolution(a, b));
        System.out.println(multiplier.getSolution(a, b));
        System.out.println(divisor.getSolution(a, b));
    }
}
