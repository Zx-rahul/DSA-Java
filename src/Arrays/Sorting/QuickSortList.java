package Arrays.Sorting;

import Arrays.Searching.Utility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuickSortList {
    public static int partition(ArrayList<Integer> arr, int low, int high) {
        int pivot= arr.get(low);
        int i=low,j=high;
        while (i<j){
            while (arr.get(i) <=pivot
                    && i<=high-1){
                i++;
            }
            while (arr.get(j) >pivot
                    && j>=low+1){
                j--;
            }
            if (i<j){
                Collections.swap(arr,i,j);
            }
        }
        Collections.swap(arr,low,j);
        return j;
    }

    public static void quickSort(ArrayList<Integer> arr,int low,int high) {
        if (low<high){
            int partitionIndex= partition(arr, low, high);
            quickSort(arr,low,partitionIndex-1);
            quickSort(arr,partitionIndex+1,high);
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr=ListUtils.takeInput();
        ListUtils.displayList(arr);
        quickSort(arr,0,arr.size()-1);
        ListUtils.displayList(arr);
    }
}
