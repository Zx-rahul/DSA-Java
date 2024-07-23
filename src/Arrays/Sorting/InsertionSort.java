package Arrays.Sorting;

import Patterns.Utility;

public class InsertionSort {
    int[] descendingSort(int[] arr){
        for (int i = 1; i <= arr.length-1; i++) {
            int j=i;
            while (j>0 && arr[j-1]<arr[j]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
        return arr;
    }

    int[] ascendingSort(int[] arr){
        for (int i = 1; i <= arr.length-1; i++) {
            int j=i;
            while (j>0 && arr[j-1]>arr[j]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr= Utility.input1DArray();
        int[] copyArr=arr.clone();
        System.out.println("Before sorting");
        Utility.display1DArray(arr);
        InsertionSort insertion=new InsertionSort();
        System.out.println("After sorting in ascending order");
        Utility.display1DArray(insertion.ascendingSort(arr));
        System.out.println("After sorting in descending order");
        Utility.display1DArray(insertion.descendingSort(copyArr));
    }
}
