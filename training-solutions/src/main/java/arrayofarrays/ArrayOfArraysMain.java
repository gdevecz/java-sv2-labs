package arrayofarrays;

public class ArrayOfArraysMain {

    public static void main(String[] args) {

        int[][] array = {{ 0, 1, 2 },
                         { 0, 1, 2 },
                         { 0, 1, 2 }};
        int size = 4;

        ArrayOfArrays arrayOfArrays = new ArrayOfArrays();
        arrayOfArrays.printArrayOfArrays(array);
        System.out.println();

        Triangular triangular = new Triangular();
        int[][] triangularArray = triangular.triangularMatrix(size);
        arrayOfArrays.printArrayOfArrays(triangularArray);
        System.out.println();

        Rectangle rectangle = new Rectangle();
        int[][] rectangularMatrix = rectangle.rectangularMatrix(size);
        arrayOfArrays.printArrayOfArrays(rectangularMatrix);
    }

}
