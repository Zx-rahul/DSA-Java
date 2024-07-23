package Arrays.Sorting;

import Arrays.Searching.Utility;

public class RecursiveBubbleSort {

    public static void sort(int[] arr,int size) {
        if (size==1){
            return;
        }
        for (int i = 0; i <= size-2; i++) {
            if (arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        sort(arr, size-1);
    }
    public static void main(String[] args) {
        int[] arr= Utility.input1DArray();
        Utility.display1DArray(arr);
        sort(arr,arr.length);
        Utility.display1DArray(arr);
    }
}
