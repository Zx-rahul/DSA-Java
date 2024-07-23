package Collections.Map.Hashing;

import Arrays.Searching.Utility;

import java.util.HashMap;
import java.util.Scanner;

public class Hashing {
    private static void precompute(HashMap<Integer,Integer> hash,int[] arr){
        for (int i : arr) {
            hash.put(i,hash.getOrDefault(i,0)+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]= Utility.input1DArray();
        Utility.display1DArray(arr);
        HashMap<Integer,Integer> hash=new HashMap<>();
        precompute(hash,arr);
        System.out.println("Number of queries");
        int q=sc.nextInt();
        System.out.println("Give the element below to be searched:  ");
        while (q>0) {
            System.out.print("Enter: \n");
            int v=sc.nextInt();
            System.out.println("Present "+hash.get(v)+" Times");
            q--;
        }
    }
}
