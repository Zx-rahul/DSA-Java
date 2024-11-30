package Arrays.Operations.Others;

import Arrays.Searching.Utility;

public class Transpose {
    public static void main(String[] args) {
        int[][] arr = Utility.input2DArray();
        System.out.println("Normal Matrix");
        Utility.display2DArray(arr);
        System.out.println("Transposed Matrix");
        Transpose tp = new Transpose();
        Utility.display2DArray(tp.transpose(arr));

    }

    int[][] transpose(int[][] arr) {
        int[][] trans = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                trans[j][i] = arr[i][j];
            }
        }
        return trans;
    }
}