package Xperimentations;

import java.util.Scanner;

public class Zoom {

    //JUST FOR DISPLAY PURPOSE
    public static void display2DArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
    }

    //JUST FOR INPUT PURPOSE
    public static int[][] input2DArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int column = scanner.nextInt();
        int arr[][] = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("Enter the element of %d row and %d column: ", i, j);
                arr[i][j] = scanner.nextInt();
            }
        }
        return arr;
    }


    //
    public static void magnify(int[][] scene, int factor) {//magnification function
        for (int i = 0; i < scene.length; i++) {
            for (int j = 0; j <= i; j++) {
                scene[i][j] *= factor;//Increasing Clarity (multiplying each view by binocular factor)
            }
        }
    }

    public static void main(String[] args) {//main method
        Scanner sc = new Scanner(System.in);
        int[][] scene = input2DArray();
        System.out.println("\nScene: ");
        display2DArray(scene);
        System.out.print("Enter the magnification factor of the binocular: ");
        int factor = sc.nextInt();
        magnify(scene, factor);
        System.out.println("Magnified Scene:");
        display2DArray(scene);
    }
}
