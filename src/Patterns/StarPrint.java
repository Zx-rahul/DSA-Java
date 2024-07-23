package Patterns;

import java.util.Scanner;

public class StarPrint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of columns of inverted stars to be printed");
        int col= sc.nextInt();
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < (col-i); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
