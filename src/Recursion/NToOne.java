package Recursion;

import java.util.Scanner;

public class NToOne {

    public static void print(int n) {
        if(n>0){
            System.out.printf("%s ",n);
            print(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        print(n);
    }
}
