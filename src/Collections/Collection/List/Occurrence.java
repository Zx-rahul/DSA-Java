package Collections.Collection.List;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Occurrence {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,5,7,9,0,3,3,2,-1);
        System.out.println(Collections.frequency(list,0));
        System.out.println(Collections.frequency(list,1));
        System.out.println(Collections.frequency(list,2));
        System.out.println(Collections.frequency(list,3));
    }
}
