package Recursion;

import Arrays.Searching.Utility;

import java.util.Scanner;

public class ReversingArray {

    static int[] n=Utility.input1DArray();
    public static void print(int i) {
        if(i<=(n.length-1)/2){
            int temp=n[i];
            n[i]=n[n.length-1-i];
            n[n.length-1-i]=temp;
            print(++i);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Utility.display1DArray(n);
        print(0);
        Utility.display1DArray(n);
    }
}
