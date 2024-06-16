package Arrays.Operations;

import Arrays.Searching.Utility;

public class DiagonalSum {
    public int sum(int[][] arr){
        int sum=0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if (i==j||i+j== arr.length-1){
//                    sum+=arr[i][j];
//                }
//            }
//        }
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
            if (i != arr.length - 1 - i) {
                sum += arr[i][(arr.length - 1) - i];
            }
        }
//        if (arr.length%2!=0){
//            sum-=arr[arr.length/2][arr.length/2];
//        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] arr= Utility.input2DArray();
        if (arr.length != arr[0].length) {
            System.err.println("Sorry, invalid size of array. The array must be nxn, i.e. rows equals to columns");
            System.exit(1);
        }
        Utility.display2DArray(arr);
        DiagonalSum add=new DiagonalSum();
        System.out.printf("the sum of primary diagonal and secondary diagonal is %d",add.sum(arr));
    }
}
