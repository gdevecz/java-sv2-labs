package arrayofarrays;

public class Triangular {

    public int[][] triangularMatrix(int size) {

        int[][] triangularArray = new int[size][];
        for (int i = 0; i < size; i++) {
            triangularArray[i] = new int[i + 1];
            for (int j = 0; j < triangularArray[i].length; j++) {
                triangularArray[i][j] = i;
            }
        }
        return triangularArray;
    }
}
