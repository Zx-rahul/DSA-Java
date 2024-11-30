package Arrays.Operations.C.Optimal;

import Arrays.Searching.Utility;

public class MissingNumberInArray {
    public static void main(String[] args) {
        int[] arr= Utility.input1DArray();
        Utility.display1DArray(arr);
        System.out.println(missing(arr));
    }

    private static int missing(int[] arr) {
        int xor1=0,xor2=0;
        for (int i = 0; i < arr.length; i++) {
            xor2^=arr[i];
            xor1^=(i+1);
        }
        xor1^= arr.length+1;
        return xor1^xor2;
    }
}
