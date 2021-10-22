package arrayofarrays;

public class Rectangle {

    public int[][] rectangularMatrix(int size) {

        int[][] newRectangularMatrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                newRectangularMatrix[i][j] = i;
            }
        }
        return newRectangularMatrix;
    }
}
