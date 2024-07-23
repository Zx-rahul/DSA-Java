package Collections.Collection.List;

import java.util.*;

public class CustomComparator {
    public static void main(String[] args) {
        List<String> stringList= Arrays.asList("mango","lamon","banana");
//        List<String> stringList=new ArrayList<>();
        System.out.println(stringList);
        sortInDescending(stringList);
        System.out.println(stringList);
    }

    public static void sortInDescending(List<String> stringList){
    Collections.sort(stringList, new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return -1;
        }
    });
    }
}
