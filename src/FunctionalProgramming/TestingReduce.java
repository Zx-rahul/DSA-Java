package FunctionalProgramming;

import java.util.List;
import java.util.function.BinaryOperator;

public class TestingReduce {
    public static void main(String[] args) {
        List<Integer> num = List.of(1, 3, 4, 5, 7, 7, 9);
        int sum = 0;
        for (Integer i : num) {
            sum += i;
        }
        System.out.println(sum);


        //Using functional interface
    int newSum=num.stream()
            .reduce(0, new BinaryOperator<Integer>() {
                @Override
                public Integer apply(Integer integer, Integer integer2) {
                    return integer+integer2;
                }
            });
        System.out.println(newSum);


//Using lambda
    int newSum2=num.stream().reduce(0,(a,b)->a+b);
//  int newSum2=num.stream().reduce(0, Integer::sum);
        System.out.println(newSum2);
}
}
