package Arrays.Sorting;

import patterns.Utility;

public class SelectionSort {

    int[] descendingSort(int[] arr){
        int temp,maxPos;
        for (int i = 0; i < arr.length-1; i++) {
            maxPos=i;
            for (int j = i+1; j < arr.length; j++) {
                System.out.println("j"+j);
                if (arr[maxPos]<arr[j]){
                    maxPos=j;
                }
            }
            //swapping in outer loop
            //swapping after extracting the maximum value's position
            temp=arr[maxPos];
            arr[maxPos]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }

    int[] ascendingSort(int[] arr){
        int temp,minPos;
        for (int i = 0; i < arr.length-1; i++) {
            minPos=i;
            for (int j = i+1; j < arr.length; j++) {
                System.out.println("j"+j);
                if (arr[minPos]>arr[j]){
                    minPos=j;
                }
            }
            //swapping in outer loop
            //swapping after extracting the minimum value's position
            temp=arr[minPos];
            arr[minPos]=arr[i];
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
