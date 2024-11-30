package Arrays.Operations.A.Brute;

import Arrays.Searching.Utility;

import java.util.Scanner;

public class LongestSubarrayWithSumKPositives {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr= Utility.input1DArray();
        Utility.display1DArray(arr);
        System.out.println("Enter the value of K");
        int K=sc.nextInt();
        System.out.println(subArray(arr,K));
    }

    private static int subArray(int[] arr,int K) {
        int sum,len=0;
        for (int i = 0; i < arr.length; i++) {
            sum=0;
            for (int j = i; j < arr.length; j++) {
                sum+=arr[j];
                if (sum==K){
                    len=Math.max(len,j-i+1);
                }
            }
        }
        return len;
    }
}
