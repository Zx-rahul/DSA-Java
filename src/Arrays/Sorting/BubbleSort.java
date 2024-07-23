package Arrays.Sorting;

import Patterns.Utility;

import java.util.Arrays;

public class BubbleSort {

    int[] descendingSort(int[] arr){
        int swap;
        for (int i = arr.length-1; i>=1 ; i--) {
            swap=0;
            for (int j = 0; j <= i-1; j++) {
                if (arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap=1;
                }
            }
            if (swap==0){
                break;
            }
        }
        return arr;
    }

    int[] ascendingSort(int[] arr){
        int swap;
        for (int i = arr.length-1; i>=1 ; i--) {
            swap=0;
            for (int j = 0; j <= i-1; j++) {
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap=1;
                }
            }
            if (swap==0){
                break;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr= Utility.input1DArray();
        int[] copyArr=arr.clone();
        System.out.println("Before sorting");
        Utility.display1DArray(arr);
        BubbleSort bubble=new BubbleSort();
        System.out.println("After sorting in ascending order");
        Utility.display1DArray(bubble.ascendingSort(arr));
        System.out.println("After sorting in descending order");
        Utility.display1DArray(bubble.descendingSort(copyArr));
    }
}
