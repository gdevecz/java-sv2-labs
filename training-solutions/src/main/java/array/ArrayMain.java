package array;

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
            System.out.print(item +  " ");
        }
    }
}