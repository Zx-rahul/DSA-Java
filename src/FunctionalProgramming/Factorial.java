package FunctionalProgramming;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number for factorial: ");
        long number=sc.nextLong();
        LongStream.rangeClosed(2,number)
                .reduce((a,b)->a*b)
                .ifPresent(System.out::println);
    }
}
