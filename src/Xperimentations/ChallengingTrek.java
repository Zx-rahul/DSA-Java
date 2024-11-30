package Xperimentations;
import java.util.Scanner;

public class ChallengingTrek {

    //JUST FOR INPUT PURPOSE
    public static int[] input1DArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of altitudes: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Enter the %d altitude: ", (i + 1));
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    //JUST FOR DISPLAY PURPOSE
    public static void display1DArray(int[] arr) {
        System.out.print("trail : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();
    }


    //ACTUAL CODE
    public static int energyRequired(int[] trail) {
        int totalEnergy = 0;

        for (int i = 0; i < trail.length - 1; i++) {
            if (trail[i + 1] > trail[i]) {//Climbing Uphill else continue
                totalEnergy += trail[i + 1] - trail[i];//Calculating total energy
            }
        }
        return totalEnergy;
    }

    public static void main(String[] args) {
        int[] trail = input1DArray();
        display1DArray(trail);
        System.out.println("Total Energy Required = " + energyRequired(trail));
    }
}
