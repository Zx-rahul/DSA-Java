package Arrays.Operations.C.Optimal;

import Arrays.Searching.Utility;

public class NumberThatAppearsOnce {
    public static void main(String[] args) {
        int[] arr= Utility.input1DArray();
        Utility.display1DArray(arr);
        System.out.println(appearOnce(arr));
    }

    private static int appearOnce(int[] arr) {
        int xor=0;
        for (int i : arr) {
            xor^=i;
        }
        return xor;
    }
}
