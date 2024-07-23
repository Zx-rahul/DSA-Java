package Patterns;

import java.util.Scanner;

public class ButterflyRevised {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the length of for butterfly pattern:  ");
        int n= sc.nextInt();
        int stars,spaces;
        for (int i = 1; i <= n+n-1; i++) {
            if (i>n){
                stars=n-(i-n);
            }else {
                stars=i;
            }
            spaces=(2*n)-(2*stars);
            //stars
            for (int j = 0; j < stars ; j++) {
                System.out.print("* ");
            }
            //spaces
            for (int j = 0; j < spaces; j++) {
                System.out.print("  ");
            }
            //stars
            for (int j = 0; j < stars ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
