package Arrays.Operations.C.Optimal;

import Arrays.Searching.Utility;
import Arrays.Sorting.SwapUtils;

public class MovingZeros {
    public static void main(String[] args) {
        int[] arr=Utility.input1DArray();
        Utility.display1DArray(arr);
        moving(arr,arr.length);
        Utility.display1DArray(arr);
    }

    private static void moving(int[] arr, int n) {
        int j=-1;
        //finding the first index of 0
        for (int i = 0; i < n; i++) {
        if (arr[i]==0){
            j=i;
            break;
        }
        }
        //checking if the whole array contains non-zero elements
        if (j==-1)
            return;
        //moving the zeros to the last
        for (int i = j+1; i < n; i++) {
            if (arr[i]!=0){
                SwapUtils.swap(arr,i,j);
                j++;
            }
        }
    }
}
