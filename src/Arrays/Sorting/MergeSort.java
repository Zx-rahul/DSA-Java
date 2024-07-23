package Arrays.Sorting;

import Arrays.Searching.Utility;

import java.util.ArrayList;
import java.util.Scanner;

public class MergeSort {

    public static void sort(int[] arr,int low,int high) {
        if (low>=high){
            return;
        }
        int mid=(high+low)/2;
        sort(arr, low, mid);
        sort(arr, mid+1, high);
        merge(arr,low,mid,high);
    }

    private static void merge(int[] arr,int low,int mid,int high) {
        int left=low;
        int right=mid+1;
        ArrayList<Integer> temp=new ArrayList<>();
        while (left<=mid && right<=high){
            if (arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }else {
                temp.add(arr[right]);
                right++;
            }
        }
        while (left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while (right<=high){
            temp.add(arr[right]);
            right++;
        }
        for (int i = low; i <= high ; i++) {
            arr[i]=temp.get(i-low);
        }
    }

    public static void main(String[] args) {
        int[] arr= Utility.input1DArray();
        Utility.display1DArray(arr);
        sort(arr,0,arr.length-1);
        Utility.display1DArray(arr);
    }
}
