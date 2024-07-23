package Arrays.Sorting;

import Arrays.Searching.Utility;

public class RecursiveInsertionSort {

    public static void sort(int[] arr,int n) {
        if (n<=1){
            return;
        }
        sort(arr, n-1);
        int j=n-1;
        while (j>0 && arr[j-1]>arr[j]){
            int temp=arr[j];
            arr[j]=arr[j-1];
            arr[j-1]=temp;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] arr= Utility.input1DArray();
        Utility.display1DArray(arr);
        sort(arr,arr.length);
        Utility.display1DArray(arr);
    }
}
