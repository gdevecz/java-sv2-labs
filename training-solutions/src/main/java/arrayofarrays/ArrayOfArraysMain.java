package arrayofarrays;

public class ArrayOfArraysMain {

    public static void main(String[] args) {

        int[][] array = {{ 0, 1, 2 },
                         { 0, 1, 2 },
                         { 0, 1, 2 }};

        ArrayOfArrays arrayOfArrays = new ArrayOfArrays();
        arrayOfArrays.printArrayOfArrays(array);
    }

}
