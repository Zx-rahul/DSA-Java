package Collections.Collection.Set;

import Collections.Utility;

import java.util.HashSet;
import java.util.Set;

public class TestingSet {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        System.out.println(set.add("zx"));
        System.out.println(set.add("rahul"));
        System.out.println(set.add("banerjee"));
        System.out.println(set.add("Hmmm"));
        Utility.print(set);
        System.out.println(set.add("zx"));
        System.out.println(set.size());
        System.out.println(set.contains("zx"));
        System.out.println(set.remove("zx"));
        Utility.print(set);
        System.out.println(set.remove("zx"));
    }
}
