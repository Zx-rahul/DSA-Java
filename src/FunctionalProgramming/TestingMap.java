package FunctionalProgramming;

import java.util.List;

public class TestingMap {
    public static void main(String[] args) {
        var nums= List.of("1","2","3","4","5");
        nums.stream()
                .map(Integer::parseInt)
                .map(num->Math.pow(num,2))
                .reduce(Double::sum)
                .ifPresent(System.out::println);
    }
}
