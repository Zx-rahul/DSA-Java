package patterns;

import java.util.Scanner;

public class LetterPrint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of columns of letter pattern to be printed");
        int col= sc.nextInt();
        int let=65;
        char lets='A';
        for (int i = 1; i <= col; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(lets+" ");
                lets++;
                System.out.print((char) let+" ");
                let++;
            }
            System.out.println();
        }
    }
}
