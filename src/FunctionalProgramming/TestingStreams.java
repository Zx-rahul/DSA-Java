package FunctionalProgramming;

import java.util.List;

public class TestingStreams {
    public static void main(String[] args) {
        List<String> names=List.of("rohan","rahul","suman","trisha");
        names.stream().forEach(System.out::println);

    }
}
