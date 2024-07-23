package FunctionalProgramming;

import java.util.List;

public class Concatenate {
    public static void main(String[] args) {
        List<String> strs=List.of("rohan","rahul banerjee","suman","trisha rajput");
        String res=strs.stream()
                .filter(str->str.length()>10)
                .reduce(String::concat)
                .orElse("");
        String res2=strs.stream()
                .filter(str->str.length()>10)
                .reduce("",(s1,s2)->s1.concat(" ").concat(s2));
        System.out.println(res);
        System.out.println(res2);
    }
}
