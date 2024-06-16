package Arrays.Sorting;

import patterns.Utility;

public class InsertionSort {
    int[] descendingSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int current=arr[i];
            int prev=i-1;
            while (prev>=0&&arr[prev]<current){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=current;
        }
        return arr;
    }

    int[] ascendingSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int current=arr[i];
            int prev=i-1;
            while (prev>=0&&arr[prev]>current){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=current;
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
