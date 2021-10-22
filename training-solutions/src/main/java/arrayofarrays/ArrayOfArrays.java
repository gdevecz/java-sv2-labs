package arrayofarrays;

public class ArrayOfArrays {

    public void printArrayOfArrays(int[][] a) {
        for (int i = 0; i < a.length; i ++) {
            for (int j = 0; j < a[i].length; j ++ ) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
