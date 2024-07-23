package FunctionalProgramming;

import java.util.List;
import java.util.function.Consumer;

public class TestingFilter {
    public static void main(String[] args) {
        List<String> fruits= List.of("mango","guava","pineapple","grapes","apple");
        System.out.println("Printing fruits normally");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println("Printing fruits by streams");
        fruits.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String fruit) {
                System.out.println(fruit);
            }
        });
        System.out.println("Printing fruits by lambda");
        fruits.stream()
                .filter(fruit->fruit.endsWith("e"))
                .forEach(System.out::println);
            }
}

