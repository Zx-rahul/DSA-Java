package Arrays.Sorting;

import patterns.Utility;

public class BubbleSort {

    int[] descendingSort(int[] arr){
        int temp,swap;
        for (int i = 0; i < arr.length-1; i++) {
            swap=0;
            for (int j = 0; j < (arr.length-1)-i; j++) {
                //swapping in inner loop
                if (arr[j]<arr[j+1]){//swapping
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
            }
            if (swap==0){
                break;
            }
        }
        return arr;
    }

    int[] ascendingSort(int[] arr){
        int temp,swap;
        for (int i = 0; i < arr.length-1; i++) {
            swap=0;
            for (int j = 0; j < (arr.length-1)-i; j++) {
                //swapping in inner loop
                if (arr[j]>arr[j+1]){//swapping
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
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
