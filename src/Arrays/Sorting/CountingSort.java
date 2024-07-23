package Arrays.Sorting;

import Patterns.Utility;

import java.util.Arrays;

public class CountingSort {//convenient for positive numbers
    //-ve number can be created by taking them positive and reserve sort at last

    int max(int[] arr){
        int max=Integer.MIN_VALUE;
        for (int j : arr) {
            max = Math.max(j, max);
        }
        return max;
    }

    int[] descendingSort(int[] arr){
        int[] count=new int[max(arr)+1];

        // Initialize count array with all zeros
        Arrays.fill(count, 0);

        // Store the count of each element
        for (int oneCount : arr) {
            count[oneCount]++;
        }

        // Building the sorted array
        int j=0;
        for (int i = count.length-1; i >=0; i--)  {
            while (count[i]>0){
                arr[j]=i;
                count[i]--;
                ++j;
            }
        }
        return arr;
    }


    int[] ascendingSort(int[] arr){
        int[] count=new int[max(arr)+1];

        // Initialize count array with all zeros
        Arrays.fill(count, 0);


        // Store the count of each element
        for (int oneCount : arr) {
            count[oneCount]++;
        }

        // Building the sorted array
        int j=0;
        for (int i = 0; i < count.length; i++)  {
            while (count[i]>0){
                arr[j]=i;
                count[i]--;
                ++j;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr= Utility.input1DArray();
        int[] copyArr=arr.clone();
        System.out.println("Before sorting");
        Utility.display1DArray(arr);
        CountingSort count=new CountingSort();
        System.out.println("After sorting in ascending order");
        Utility.display1DArray(count.ascendingSort(arr));
        System.out.println("After sorting in descending order");
        Utility.display1DArray(count.descendingSort(copyArr));
    }
}
