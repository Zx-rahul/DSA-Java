package Patterns;

import java.util.Scanner;

public class NestedBoundaryPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of times to be printed: ");
        int n= sc.nextInt();
        for (int i = 0; i < 2*n-1; i++) {
            for (int j = 0; j < 2*n-1; j++) {
                int top=i;
                int left=j;
                int down=2*n-2-i;
                int right=2*n-2-j;
                System.out.print(n-Math.min(Math.min(left,right),Math.min(top,down)));
            }
            System.out.println();
        }

    }
}
