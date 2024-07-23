package Recursion;

import java.util.Scanner;

public class SumOfNTerms {
    public static long print(long n) {
        if(n>0){
           return print(n-1)+(n*n*n);
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        System.out.println(print(n));
    }
}
