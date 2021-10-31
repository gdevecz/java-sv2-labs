package numbers;

public class PercentMain {

    public static void main(String[] args) {

        Percent percent = new Percent();

        System.out.println(percent.getValue(100,27));
        System.out.println(percent.getValue(10,27));
        System.out.println(percent.getValue(110,27));
        System.out.println();
        System.out.println(percent.getBase(60, 30));
        System.out.println(percent.getBase(127, 127));
        System.out.println();
        System.out.println(percent.getPercent(100, 127));
        System.out.println(percent.getPercent(100, 27));
        System.out.println(percent.getPercent(200, 60));
        System.out.println(percent.getPercent(127, 127));
    }
}
