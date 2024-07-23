package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestingCollections {
    public static void main(String[] args) {
        List<Integer> numList=new ArrayList<>();
        numList.add(34);
        numList.add(55);
        numList.add(90);
        numList.add(-93);
        Utility.print(numList);

        Collections.sort(numList);
        Utility.print(numList);

        Collections.reverse(numList);
        Utility.print(numList);

        List<Integer> unmodifiable= Collections.unmodifiableList(numList);
//        unmodifiable.add(88);
    }
}
