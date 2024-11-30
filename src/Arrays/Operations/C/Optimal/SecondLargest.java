package Arrays.Operations.C.Optimal;

import Arrays.Searching.Utility;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr= Utility.input1DArray();
        Utility.display1DArray(arr);
        System.out.println(secondLarge(arr));
    }

    private static int secondLarge(int[] arr) {
    int largest=arr[0];
    int secLar=Integer.MIN_VALUE;
        for (int i : arr) {
            if (i>largest){
                secLar=largest;
                largest=i;
            } else if (i>secLar && i!=largest) {
                //i!=largest or i<largest is imp to avoid duplicate elem
                //run for 1 3 7 7 5
                secLar=i;
            }
        }
        return secLar;
    }
}
