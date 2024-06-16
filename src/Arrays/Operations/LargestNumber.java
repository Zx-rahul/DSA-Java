package Arrays.Operations;

import Arrays.Searching.Utility;

public class LargestNumber {
    private int largeNumber=Integer.MIN_VALUE;
    private int smallNumber=Integer.MAX_VALUE;

    void large(int[] arr){
        for (int i : arr) {
            if (i>largeNumber){
                largeNumber=i;
            }
            if (i<smallNumber){
                smallNumber=i;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr= Utility.input1DArray();
        Utility.display1DArray(arr);
        LargestNumber num=new LargestNumber();
        num.large(arr);
        System.out.printf("Smallest Number is %d\n",num.smallNumber);
        System.out.printf("Largest Number is %d",num.largeNumber);
    }
}
