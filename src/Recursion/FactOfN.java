package Recursion;

import java.util.Scanner;

public class FactOfN {
    public static long print(long n) {
        if(n==0){
            return 1;
        }
        System.out.println(n+"\n");
        return n*print(n-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        System.out.println(print(n));
    }
}
