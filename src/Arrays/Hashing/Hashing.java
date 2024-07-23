package Arrays.Hashing;

import Arrays.Searching.Utility;

import java.util.Arrays;
import java.util.Scanner;


public class Hashing {
    public static void compute(int[] hash,int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr= Utility.input1DArray();
        Utility.display1DArray(arr);
        int hash[]=new int[13];
        Arrays.fill(hash,0);
        compute(hash,arr);
        System.out.println("Number of queries");
        int q=sc.nextInt();
        while (q>0) {
            System.out.print("Enter the element to be searched: \n");
            int num = sc.nextInt();
            System.out.println("Element occurred "+hash[num]+" times");
            q--;
        }
    }
}
