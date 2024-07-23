package Collections.Collection.List;

import Collections.Utility;

import java.util.Arrays;
import java.util.List;

public class Swapping {
    public static void swap(List<Integer> list,int x,int y) {
    int temp=list.get(x);
    list.set(x,list.get(y));
    list.set(y,temp);
    }
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,3,2,4);
        Utility.print(list);
        swap(list,1,2);
        Utility.print(list);
    }
}
