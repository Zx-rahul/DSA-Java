package Recursion;

import java.util.Scanner;

public class OneToN {
    public static void print(int n) {
        if (n>0){
            print(n-1);
            System.out.printf("%d ",n);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        print(n);
    }
}
