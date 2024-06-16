package Arrays.Searching;

import java.util.Scanner;

public class Utility {
    public static void display2DArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%d ",arr[i][j]);
            }
            System.out.println();
        }
    }
    public static int[][] input2DArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row= scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int column= scanner.nextInt();
        int arr[][]=new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("Enter the element of %d row and %d column: ",i,j);
                arr[i][j]= scanner.nextInt();
            }
        }
        return arr;
    }



    public static void display1DArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();
    }

    public static int[] input1DArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Enter the %d element: ", (i + 1));
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
}
