package Patterns;

import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the length of the rhombus : ");
        int size= sc.nextInt();
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size-i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
