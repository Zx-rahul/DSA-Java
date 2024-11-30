package Arrays.Operations.C.Optimal;

import Arrays.Searching.Utility;

import java.util.ArrayList;
import java.util.List;

public class UnionOfTwoSortedArray {
    public static void main(String... args) {
        int[] arr = Utility.input1DArray();
        int[] arr2 = Utility.input1DArray();
        Utility.display1DArray(arr);
        Utility.display1DArray(arr2);
        System.out.println(union(arr, arr2));
    }

    private static List<Integer> union(int[] arr, int[] arr2) {
        int i = 0, j = 0;
        ArrayList<Integer> list =new ArrayList<>();
        while (i < arr.length && j < arr2.length) {
            if (arr[i] <= arr2[j]) {
                if (list.isEmpty() || !list.getLast().equals(arr[i])) {
                    list.add(arr[i]);
                }
                i++;
            } else {
                if (list.isEmpty() || !list.getLast().equals(arr2[j])) {
                    list.add(arr2[j]);
                }
                j++;
            }
        }

        while (i < arr.length) {
                if (list.isEmpty() || !list.getLast().equals(arr[i])) {
                    list.add(arr[i]);
                }
                i++;
        }
        while (j < arr2.length) {
            if (list.isEmpty() || !list.getLast().equals(arr2[j]) ) {
                list.add(arr2[j]);
            }
            j++;
        }
     return list;
    }
}