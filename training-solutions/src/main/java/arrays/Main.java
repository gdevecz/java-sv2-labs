package arrays;

import java.util.Arrays;

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
        System.out.println(arraysMain.sameTempValuesDaylight(
                new double[]{10.2, 11.4, 13.0, 14.4},
                new double[]{10.2, 11.4, 13.0, 14.4}));
        System.out.println(arraysMain.sameTempValuesDaylight(
                new double[]{10.2, 11.4, 13.0, 14.4},
                new double[]{10.2, 11.4, 13.0, 16.4}));
        System.out.println(arraysMain.sameTempValuesDaylight(
                new double[]{10.2, 11.4, 13.0, 14.4},
                new double[]{10.2, 11.4, 13.0}));
        System.out.println();
        int[] result = {3, 10, 54, 2, 9};
        int[] tipps = {3, 10, 54, 2, 9};
        System.out.println("Original: ");
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(tipps));
        System.out.println(arraysMain.wonLottery(result, tipps));
        System.out.println("After method:");
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(tipps));
        System.out.println();
        tipps = new int[]{3, 10, 54, 9, 2};
        System.out.println("Original: ");
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(tipps));
        System.out.println(arraysMain.wonLottery(result, tipps));
        System.out.println("After method:");
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(tipps));
        System.out.println();
        result = new int[]{3, 10, 54, 2, 9};
        tipps = new int[]{3, 10, 54, 2, 10};
        System.out.println("Original: ");
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(tipps));
        System.out.println(arraysMain.wonLottery(result, tipps));
        System.out.println("After method:");
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(tipps));
    }
}
