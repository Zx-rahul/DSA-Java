package Patterns;


import java.util.Scanner;

public class ButterflyPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of for butterfly pattern");
        int size= sc.nextInt();
        for (int i = 1; i <= size ; i++) {
                for (int k = 1; k <= i; k++) {
                    System.out.print("* ");
                }
                for (int k = 1; k <=(size*2)-i*2 ; k++) {
                    System.out.print("  ");
                }
                for (int k =1; k <= i ; k++) {
                    System.out.print("* ");
                }
            System.out.println();
        }
        for (int i = 1; i <= size ; i++) {
            for (int k = 1; k <= (size-i)+1; k++) {
                System.out.print("* ");
            }
            for (int k = 1; k <= i-1; k++) {
                System.out.print("    ");
            }
            for (int k =1; k <= (size-i)+1 ; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
