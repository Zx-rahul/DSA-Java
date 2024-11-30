package Arrays.Operations.C.Optimal;

import Arrays.Searching.Utility;

public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr= Utility.input1DArray();
        Utility.display1DArray(arr);
        System.out.println(maxCons(arr));
    }

    private static int maxCons(int[] arr) {
        int cnt=0,max=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==1){
                cnt++;
                max=Math.max(max,cnt);
            }else {
                cnt=0;
            }
        }
        return max;
    }
}
