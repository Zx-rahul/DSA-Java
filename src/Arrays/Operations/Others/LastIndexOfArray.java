package Arrays.Operations.Others;

import Arrays.Searching.Utility;

public class LastIndexOfArray {
    public static void main(String[] args) {
        int[] arr= Utility.input1DArray();
        Utility.display1DArray(arr);
        System.out.println(arr[arr.length-1]);
        System.out.printf("length of array is %d",arr.length);
    }
}
