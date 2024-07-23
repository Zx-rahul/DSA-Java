package FunctionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestingDistinct {
    public static void main(String[] args) {
        var list=List.of(1,2,3,4,3,2,1,5,5,5);
        var newList=list.stream()
                .distinct()
                .toList();
//                .collect(Collectors.toList());
        System.out.println(newList);
    }
}
