package Arrays.Operations.C.Optimal;

import Arrays.Searching.Utility;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr=Utility.input1DArray();
        Utility.display1DArray(arr);
        remove(arr);
        Utility.display1DArray(arr);
    }

    private static void remove(int[] arr) {
    int i=0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }
    }
}
