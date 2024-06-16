package patterns;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the length of the rhombus : ");
        int size= sc.nextInt();
        int c=0;
        for (int i = 1; i <= size; i++,c++) {
            for (int j = 1; j <= size-i ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i+c ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
//        c=size-1;
//        for (int i = size; i >= 1; i--,c--) {
//            for (int j = 1; j <= size-i ; j++) {
//                System.out.print("  ");
//            }
//            for (int j = 1; j <= i+c ; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
    }
}
