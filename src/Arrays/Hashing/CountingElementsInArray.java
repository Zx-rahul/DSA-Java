package Arrays.Hashing;

import Arrays.Searching.Utility;

import java.util.Scanner;

public class CountingElementsInArray {
    //brute force approach TC--> O(Q*N)

    public static int elementOccurred(int n,int[] arr) {
        //brute force approach TC--> O(Q*N)
        int cnt=0;
        for (int i : arr) {
            if (i==n){
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {        //brute force approach TC--> O(Q*N)

        Scanner sc=new Scanner(System.in);
        int[] arr= Utility.input1DArray();
        Utility.display1DArray(arr);
        System.out.println("Enter the element to be searched in array");
        int n=sc.nextInt();
        System.out.printf("The element appeared %d times in the array",elementOccurred(n,arr));
    }
}
