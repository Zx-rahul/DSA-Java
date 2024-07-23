package Patterns;

import java.util.Scanner;

public class Multi_Pattern {

    public static void alphaTriangle(int n){
        for (int i = 1; i <= n; i++) {
            char c=(char) (65+n-1);
            for (int j = 1; j <= i ; j++,c--) {
                System.out.printf("%s ",c);
            }
            System.out.println();
        }
    }

    public static void deltaTriangle(int n){
        for (int i = 1; i <= n; i++) {
            char c= (char) (65+n-i);
            for (int j = c; j < 65+n; j++,c++) {
                System.out.printf("%s ",c);
            }
            System.out.println();
        }
    }

    public static void symmetricalLettersPyramid(int n){
    char c;
        for (int i = 1; i <= n ; i++) {
            c='A';
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.printf("%s ",c);
//                c=j>(2*i-1)/2?--c:++c;
                if (j>(2*i-1)/2){
                    --c;
                }else {
                    ++c;
                }
            }
            System.out.println();
        }
    }

    public static void sameLettersPyramid(int n){
        char c='A';
        for (int i = 1; i <= n ; i++,c++) {
            for (int j = 1; j <= i ; j++) {
                System.out.printf("%s ",c);
            }
            System.out.println();
        }
    }

    public static void lettersReverse(int n){
        char c;
        for (int i = n; i >= 1 ; i--) {
            c='A';
            for (int j = 1; j <= i ; j++,c++) {
                System.out.printf("%s ",c);
            }
            System.out.println();
        }
    }

    public static void countingDoubleTriangle(int n){
        int spaces=n*2-2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            for (int j = 0; j < spaces ; j++) {
                System.out.print(" ");
            }
            spaces-=2;

            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void binaryTriangle(int n){

        for (int i = 0; i < n ; i++) {
            int start;
            if (i%2==0){
                start=1;
            }else {
                start=0;
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(start+" ");
                start=1-start;
            }
            System.out.println();
        }
    }

    public static void slantedTriangle(int n){
        for (int i = 1; i <= 2*n-1; i++) {
            int stars=i;
            if (i>n){
                stars=2*n-i;
            }
            for (int j = 1; j <=stars ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void lowerTriangle(int n){
        for (int i = n; i >= 1 ; i--) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i+(i-1) ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void upperTriangle(int n){
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i+(i-1) ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number to times to be printed :  ");
        int n=sc.nextInt();
        upperTriangle(n);
        lowerTriangle(n);
        slantedTriangle(n);
        binaryTriangle(n);
        countingDoubleTriangle(n);
        lettersReverse(n);
        sameLettersPyramid(n);
        symmetricalLettersPyramid(n);
        deltaTriangle(n);
        alphaTriangle(n);
    }
}
