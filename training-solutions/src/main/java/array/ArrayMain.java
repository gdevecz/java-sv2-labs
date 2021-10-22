package array;

import java.sql.Array;

public class ArrayMain {

    public static void main(String[] args) {

        String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(weekdays[1]);
        System.out.println(weekdays.length);

        int[] arrayOfIntegers = new int[5];
        int actualVolume = 1;
        int baseOfPower = 2;
        for (int i = 0; i < arrayOfIntegers.length; i++) {
            arrayOfIntegers[i] = actualVolume;
            actualVolume *= baseOfPower;
        }
        for (int number : arrayOfIntegers) {
            System.out.print(number + " ");
        }
        System.out.println();

        boolean[] arrayOfBoolean = new boolean[6];
        arrayOfBoolean[0] = false;
        for (int i = 1; i < arrayOfBoolean.length; i++) {
            arrayOfBoolean[i] = !arrayOfBoolean[i - 1];
        }
        for (boolean item : arrayOfBoolean) {
            System.out.print(item + " ");
        }
        System.out.println();

        System.out.println("\nAz array handler tesztelése");
        ArrayHandler arrayHandler = new ArrayHandler();
        int[] testArrayOfIntegers = new int[arrayOfIntegers.length];
        System.arraycopy(arrayOfIntegers, 0, testArrayOfIntegers, 0, arrayOfIntegers.length);
        System.out.println("Az eredeti tömb: ");
        for (int item : testArrayOfIntegers) {
            System.out.println(item);
        }
        for (int item : testArrayOfIntegers) {
            System.out.print(item + ", ");
        }
        arrayHandler.addIndexToNumber(testArrayOfIntegers);
        System.out.println("\nA módosított tömb: ");
        for (int item : testArrayOfIntegers) {
            System.out.println(item);
        }
        for (int item : testArrayOfIntegers) {
            System.out.print(item + ", ");
        }
        System.out.println();

        String[] testArrayOfString = new String[weekdays.length];
        System.arraycopy(weekdays,0, testArrayOfString,0,weekdays.length);
        System.out.println("\nAz eredeti tömb: ");
        for (String item : testArrayOfString) {
            System.out.println(item);
        }
        for (String item : testArrayOfString) {
            System.out.print(item + ", ");
        }
        arrayHandler.concatenateIndexToWord(testArrayOfString);
        System.out.println("\nA módosított tömb: ");
        for (String item : testArrayOfString) {
            System.out.println(item);
        }
        for (String item : testArrayOfString) {
            System.out.print(item + ", ");
        }


    }
}