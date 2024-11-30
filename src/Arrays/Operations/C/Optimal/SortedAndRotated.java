package Arrays.Operations.C.Optimal;

import Arrays.Searching.Utility;

public class SortedAndRotated {
    public static void main(String[] args) {
        int[] arr= Utility.input1DArray();
        Utility.display1DArray(arr);
        System.out.println(isSorted(arr));
    }

    private static boolean isSorted(int[] arr) {
        int count=0;
        for (int i = 1; i <= arr.length-1; i++) {
            if (arr[i-1]>arr[i]){
                count++;
            }
        }
        if (arr[0]<arr[arr.length-1]){
          count++;
        }
        return count<=1;
    }
}
