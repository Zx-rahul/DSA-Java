package Revision;

import Patterns.Utility;

public class BS {
    public static void main(String[] args) {
        int[] arr=Utility.input1DArray();
        Utility.display1DArray(arr);
        int swap;
        for (int i = 0; i < arr.length-1; i++) {
            swap=0;
            for (int j = 0; j < arr.length-1-i; j++) {
                System.out.println("j"+j);
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
            }
            if (swap==0){
                break;
            }
        }
        System.out.println("sorted");
        Utility.display1DArray(arr);
    }
}
