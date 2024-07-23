package Revision;

import java.util.Scanner;

public class NumberExtraction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n= sc.nextInt();
        System.out.println((int) Math.ceil(Math.log10(n)));
        int count=0;
        while (n>0){
            n=n/10;
            count++;
            System.out.println(count);
        }
    }
}
