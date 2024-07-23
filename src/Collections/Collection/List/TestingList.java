package Collections.Collection.List;

import java.util.ArrayList;
import java.util.List;

public class TestingList {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("rahul");
        list.add("banerjee");
        System.out.println(list);
//      list.add(56);
        list.remove(1);
        list.add(0,"zx");
        System.out.println(list);
        list.add("stiver");
        System.out.println(list.get(2));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for (String s : list) {
            System.out.println(s);
        }
        if (list.contains("zx")){
            System.out.println(list.indexOf("zx"));
        }
        list.clear();
    }
}
