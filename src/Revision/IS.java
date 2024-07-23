package Revision;

import Patterns.Utility;

public class IS {
    public static void main(String[] args) {
        int[] arr= Utility.input1DArray();
        Utility.display1DArray(arr);
        int current;
        for (int i = 1; i < arr.length; i++) {
            current=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>current){//checking if the previous
                // element is larger than the current element
                arr[j+1]=arr[j];//shifting
                j--;
            }
            arr[j+1]=current;//inserting the current element
            // to the correct position
        }
        Utility.display1DArray(arr);
    }
}
