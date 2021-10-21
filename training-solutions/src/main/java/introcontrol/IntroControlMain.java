package introcontrol;

public class IntroControlMain {

    public static void main(String[] args) {

        IntroControl test = new IntroControl();

        System.out.println("\nsubtractTenIfGreaterThanTen:");
        System.out.println(test.subtractTenIfGreaterThanTen(11));
        System.out.println(test.subtractTenIfGreaterThanTen(10));
        System.out.println(test.subtractTenIfGreaterThanTen(9));
        System.out.println("\ndescribeNumber:");
        System.out.println(test.describeNumber(0));
        System.out.println(test.describeNumber(-2));
        System.out.println(test.describeNumber(2));
        System.out.println("\ngreetingToJoe:");
        System.out.println(test.greetingToJoe("Joe"));
        System.out.println(test.greetingToJoe("Not Joe"));
        System.out.println("\ncalculateBonus");
        System.out.println(test.calculateBonus(999_999));
        System.out.println(test.calculateBonus(1_000_000));
        System.out.println(test.calculateBonus(1_000_001));
        System.out.println("\ncalculateConsumption");
        System.out.println(test.calculateConsumption(1, 12));
        System.out.println();
        System.out.println(test.calculateConsumption(9999, 10));
        System.out.println("\nprintNumbers:");
        test.printNumbers(13);
        System.out.println();
        test.printNumbers(14);
        System.out.println("\nprintNumbersBetween");
        test.printNumbersBetween(10, 15);
        System.out.println("\nprintNumbersBetweenAnyDirection");
        test.printNumbersBetweenAnyDirection(10, 15);
        System.out.println();
        test.printNumbersBetweenAnyDirection(15, 10);
        System.out.println("printOddNumbers");
        test.printOddNumbers(12);
        System.out.println();
        test.printOddNumbers(13);
    }
}
