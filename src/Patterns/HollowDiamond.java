package Patterns;

import java.util.Scanner;

public class HollowDiamond {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of times to be printed: ");
        int n= sc.nextInt();
        int space=0;
        for (int i = 0; i < n; i++) {
            for (int j = n-i-1; j >= 0; j--) {
                System.out.print("*");
            }
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            space+=2;
            for (int j = n-i-1; j >= 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

//        space=2*(n-1);
        for (int i = n-1; i >= 0; i--) {
            for (int j = n-i-1; j >= 0; j--) {
                System.out.print("*");
            }
            space-=2;
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = n-i-1; j >= 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
