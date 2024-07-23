package Revision;

import Patterns.Utility;

public class SS {
    public static void main(String[] args) {
            int[] arr= Utility.input1DArray();
            Utility.display1DArray(arr);
            int pos;
        for (int i = 0; i < arr.length-1; i++) {
            pos=i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<arr[pos]){
                    pos=j;
                }
            }
            int temp=arr[pos];
            arr[pos]=arr[i];
            arr[i]=temp;
        }
            System.out.println("sorted");
            Utility.display1DArray(arr);
    }
}
