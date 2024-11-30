package Arrays.Operations.Others;

import Arrays.Searching.Utility;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] arr = Utility.input2DArray();
        Utility.display2DArray(arr);
        int startRow = 0, startColumn = 0, endRow = arr.length - 1, endColumn = arr[0].length - 1;
        while ((startRow <= endRow) && (startColumn <= endColumn)) {
            //top
            for (int i = startColumn; i <= endColumn; i++) {
                System.out.printf("%d ", arr[startRow][i]);
            }
            //right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.printf("%d ", arr[i][endColumn]);
            }
            //bottom
            for (int i = endColumn - 1; i >= startColumn; i--) {
                if (startRow==endRow)
                    break;
                System.out.printf("%d ", arr[endRow][i]);
            }
            //left
            for (int i = endRow - 1; i >= startColumn +1 ; i--) {
                if (startColumn==endColumn)
                    break;
                System.out.printf("%d ", arr[i][startColumn]);
            }
            startRow++;
            endColumn--;
            endRow--;
            startColumn++;
        }
        }
    }

