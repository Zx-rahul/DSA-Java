package FunctionalProgramming;

import Arrays.Searching.Utility;

import java.util.Arrays;

public class JustOdd {
    public static void main(String[] args) {
        int[] arr= Utility.input1DArray();
        Utility.display1DArray(arr);
        Arrays.stream(arr)
                .filter((n->n%2==1))
                .forEach(System.out::println);
    }
}
