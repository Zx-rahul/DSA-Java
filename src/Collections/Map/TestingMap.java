package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class TestingMap {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("rahul",30);
        map.put("vinod",99);
        map.put("harshit",50);
        map.put("ayush",70);
        map.put("shivam",2);
        System.out.println(map.size());
        System.out.println(map.get("vinod"));
        System.out.println(map.containsKey("shivam"));
        System.out.println(map.containsKey("anshi"));
        System.out.println(map.remove("shivam"));
        System.out.println(map.size());
        System.out.println(map);
        for (String key : map.keySet()) {
            System.out.printf("%s : %s\n",key,map.get(key));
        }
    }
}
