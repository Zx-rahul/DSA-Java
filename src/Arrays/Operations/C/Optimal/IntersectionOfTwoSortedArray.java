package Arrays.Operations.C.Optimal;

import java.util.*;

public class IntersectionOfTwoSortedArray {
    public static void main(String[] args) {
        List<Integer> arr1= Arrays.asList(2,3,4,5);
        List<Integer> arr2= Arrays.asList(2,3,4,6);
        inter(arr1,arr1.size(),arr2,arr2.size());
    }

    private static void inter(List<Integer> arr1, int n, List<Integer> arr2, int m) {
        int i=0,j=0;
        ArrayList<Integer> list=new ArrayList<>();
        while (i<n && j<m){
            if (arr1.get(i)<arr2.get(j)){
                i++;
            }else if (arr1.get(j)<arr2.get(i)) {
                j++;
            }else {
                if (list.isEmpty() || !list.getLast().equals(arr1.get(i))) {
                    list.add(arr1.get(i));
                }
                i++;
                j++;
            }
        }
        System.out.println(list);
    }
}
