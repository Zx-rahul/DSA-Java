package FunctionalProgramming;

import java.util.List;
import java.util.function.BinaryOperator;

public class Multiplication {
    public static void main(String[] args) {
        List<Integer> nums=List.of(2,3,4,5);
        //lambda inside argument
        System.out.println(nums.stream().reduce(1,(a,b)->a*b));
        //lambda in variables
        BinaryOperator<Integer> multi=(a,b)->a*b;
        int res=multi.apply(4,5);
        System.out.println(res);
    }
}
