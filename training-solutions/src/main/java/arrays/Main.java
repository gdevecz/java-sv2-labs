package arrays;

public class Main {
    public static void main(String[] args) {

        ArraysMain arraysMain = new ArraysMain();

        System.out.println(arraysMain.numberOfDaysAsString());
        System.out.println();
        System.out.println(arraysMain.multiplicationTableAsString(5));
        System.out.println();
        System.out.println(arraysMain.sameTempValues(
                new double[]{10.2, 11.4, 13.0, 14.4},
                new double[]{10.2, 11.4, 13.0, 14.4}));
        System.out.println(arraysMain.sameTempValues(
                new double[]{10.2, 11.4, 13.0, 14.4},
                new double[]{10.2, 11.4, 13.0, 16.4}));
        System.out.println(arraysMain.sameTempValues(
                new double[]{10.2, 11.4, 13.0, 14.4},
                new double[]{10.2, 11.4, 13.0}));
        System.out.println();
    }
}
