package Arrays.Operations.C.Optimal;

import Arrays.Searching.Utility;

public class SecondSmallest {
    public static void main(String[] args) {
        int[] arr= Utility.input1DArray();
        Utility.display1DArray(arr);
        System.out.println(secondLarge(arr));
    }

    private static int secondLarge(int[] arr) {
        int smallest=arr[0];
        int secSml=Integer.MAX_VALUE;
        for (int i : arr) {
            if (i<smallest){
                secSml=smallest;
                smallest=i;
            } else if (i<secSml && i!=smallest) {
                //i!=smallest or i>smallest is imp to avoid duplicate elem
                //run for 1 3 7 7 5
                secSml=i;
            }
        }
        return secSml;
    }
}
