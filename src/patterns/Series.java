package patterns;

import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        char c;
        for (int i = 0; i <=s; i++) {
            c='A';
            for (int j = 0; j <= i; j++,c++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
    }

