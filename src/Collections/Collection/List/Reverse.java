package Collections.Collection.List;

import Collections.Utility;

import java.util.Arrays;
import java.util.List;

public class Reverse {
    public static void reverse(List<Integer> list) {
//        Collections.reverse(list);//library classes
        //homemade
        for (int i = 0; i < list.size()/2; i++) {
            int temp=list.get(i);
            list.set(i,list.get(list.size()-1-i));
            list.set(list.size()-1-i,temp);
        }
    }
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4);
        Utility.print(list);
        reverse(list);
        Utility.print(list);
    }
}
