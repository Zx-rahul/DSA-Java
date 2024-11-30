package Arrays.Operations.C.Optimal;

import Arrays.Searching.Utility;

import java.util.Scanner;

public class RotateArrayByKSteps {
    private static void reverse(int[] arr,int start,int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    private static void rotateRight(int[] arr,int k) {
        int n= arr.length;
        if (n == 0 || k <= 0) {
            return;
        }
        k=k % arr.length;
        reverse(arr,0, n-1 );
        reverse(arr,0,k-1);
        reverse(arr,k, n-1);
    }

    private static void rotateLeft(int[] arr,int k) {
        int n= arr.length;
        if (n == 0 || k <= 0) {
            return;
      }
      k=k % n;
      reverse(arr,0,k-1);
      reverse(arr,k, n-1);
      reverse(arr,0, n-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr= Utility.input1DArray();
        Utility.display1DArray(arr);
        System.out.println("How much steps do you want to rotate");
        int k=sc.nextInt();
        int[] arr2=arr.clone();
        rotateLeft(arr,k);
        rotateRight(arr2,k);
        System.out.println("After rotating left");
        Utility.display1DArray(arr);
        System.out.println("After rotating right");
        Utility.display1DArray(arr2);
    }
}
