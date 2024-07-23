package Recursion;

import java.util.Scanner;

public class Fibonacci {
    public static int print(int n) {
        if (n<2){
            return n;
        }
        return print(n-1)+print(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        System.out.println(print(n));
    }
}
