package introcontrol;

public class IntroControl {

    public int subtractTenIfGreaterThanTen(int number) {
        return number <= 10 ? number : number - 10;
    }

    public String describeNumber(int number) {
        if (number == 0) {
            return "zero";
        } else {
            return "not zero";
        }
    }

    public String greetingToJoe(String name) {
        if ("Joe".equals(name)) {
            return "Hello Joe";
        } else {
            return "";
        }
    }

    public int calculateBonus(int sale) {
        if (sale > 1_000_000) {
            return (int) (sale * 0.1);
        } else {
            return 0;
        }
    }

    public int calculateConsumption(int prev, int next) {
        if (prev > next) {
            next += 9999;
        }
        return next - prev;
    }

    public void printNumbers(int max) {
        for (int i = 0; i <= max; i++) {
            System.out.println(i);
        }
    }

    public void printNumbersBetween(int min, int max) {
        for (int i = min; i <= max; i++) {
            System.out.println(i);
        }
    }

    public void printNumbersBetweenAnyDirection(int a, int b) {
        int step;
        if (a < b) {
            step = 1;
        } else {
            step = -1;
        }
        for (int i = a; i != b + step; i += step) {
            System.out.println(i);
        }
    }

    public void printOddNumbers(int max) {
        for (int i = 1; i <=max; i++) {
            if ((i % 2) != 0) {
                System.out.println(i);
            }
        }
    }
}
