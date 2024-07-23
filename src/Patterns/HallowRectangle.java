package Patterns;

import java.util.Scanner;

public class HallowRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Hollow triangle valid for 4");
        int col= sc.nextInt();
        for (int i = 1; i <= col; i++) {
            for (int j = 1; j <= col+1; j++) {
                if ((i==2||i==3)&&(j==2||j==3||j==4)){
                    System.out.print("  ");
                }else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
