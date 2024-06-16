package patterns;

import java.util.Scanner;

public class NumberPattern {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number of columns of number patterns to be printed");
            int col= sc.nextInt();
            for (int i = 1; i <= col; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j+" ");
                }
                System.out.println();
            }
        }
    }
