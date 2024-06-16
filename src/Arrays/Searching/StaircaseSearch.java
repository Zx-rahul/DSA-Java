package Arrays.Searching;

import java.util.Scanner;

public class StaircaseSearch {
    private final int key;

    public StaircaseSearch(int key) {
        this.key = key;
    }
    public void searchWithDownLeft(int[][] arr){
        System.out.println("In searchWithDownLeft");
        int catcher,column=0,row= arr.length-1;
        while (column <= arr[0].length && row >= 0){
            catcher=arr[row][column];
            if (key==catcher){
                System.out.printf("key {%d} found at index[%d][%d]\n",catcher,row,column);
                return;
            }
            else if (key<catcher){
                row--;
            }else{
                column++;
            }
        }
        System.out.println("key is not found in the matrix");
    }

    public void searchWithTopRight(int[][] arr){
        System.out.println("In searchWithTopRight");
        int catcher,column=arr[0].length-1,row=0;
        while (column >= 0 && row <= arr.length-1){
            catcher=arr[row][column];
            if (key==catcher){
                System.out.printf("key {%d} found at index[%d][%d]\n",catcher,row,column);
            return;
            }
            else if (key<catcher){
                column--;
            }else{
                row++;
            }
        }
        System.out.println("key is not found in the matrix");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr=Utility.input2DArray();
        Utility.display2DArray(arr);
        int[][] copy=arr;
        System.out.println("Enter the value to be searched");
        StaircaseSearch staircase=new StaircaseSearch(sc.nextInt());
        staircase.searchWithTopRight(arr);
        staircase.searchWithDownLeft(copy);
    }
}
