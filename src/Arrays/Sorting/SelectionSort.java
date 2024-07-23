package Arrays.Sorting;

import Collections.Collection.List.Swapping;
import Patterns.Utility;

public class SelectionSort {

    int[] descendingSort(int[] arr){
        for (int i = 0; i <= arr.length-2 ; i++) {
            int max=i;
            for (int j = i+1; j <= arr.length-1 ; j++) {
                if (arr[max]<arr[j]){
                    max=j;
                }
            }
            int temp=arr[max];
            arr[max]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }

    int[] ascendingSort(int[] arr){
        for (int i = 0; i <= arr.length-2 ; i++) {
            int min=i;
            for (int j = i+1; j <= arr.length-1 ; j++) {
                if (arr[min]>arr[j]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr= Utility.input1DArray();
        int[] copyArr=arr.clone();
        System.out.println("Before sorting");
        Utility.display1DArray(arr);
        SelectionSort selection=new SelectionSort();
        System.out.println("After sorting in ascending order");
        Utility.display1DArray(selection.ascendingSort(arr));
        System.out.println("After sorting in descending order");
        Utility.display1DArray(selection.descendingSort(copyArr));
    }

}
