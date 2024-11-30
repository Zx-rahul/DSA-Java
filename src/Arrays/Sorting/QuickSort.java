package Arrays.Sorting;

import Arrays.Searching.Utility;


public class QuickSort {
    public static void swap(int[] arr,int i,int j) {
        SwapUtils.swap(arr, i, j);
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot=arr[low];
        int i=low,j=high;
        while (i<j){
        while (arr[i]<=pivot
        && i<=high-1){
            i++;
        }
        while (arr[j]>pivot
                    && j>=low+1){
                j--;
        }
        if (i<j){
          swap(arr,i,j);
        }
        }
        swap(arr,low,j);
        return j;
    }

    public static void quickSort(int[] arr,int low,int high) {
        if (low<high){
            int partitionIndex= partition(arr, low, high);
            quickSort(arr,low,partitionIndex-1);
            quickSort(arr,partitionIndex+1,high);
        }
    }
    public static void main(String[] args) {
        int[] arr= Utility.input1DArray();
        Utility.display1DArray(arr);
        quickSort(arr,0,arr.length-1);
        Utility.display1DArray(arr);
    }
}
