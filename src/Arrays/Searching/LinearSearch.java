package SearchingSortingArray;

import java.util.Scanner;

public class LinearSearch {
//    private final int key;
    private final String name;

    public LinearSearch(String name) {
        this.name = name;
    }

//    public LinearSearch(int key) {
//        this.key = key;
//    }

//    public int Search(int[] arr){
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]==key) {
//                System.out.printf("Element found at %d position\n",i+1);
//                return 0;
//            }
//        }
//        return -1;
//    }

    public int stringSearch(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(name)) {
                System.out.printf("Dish is being prepared at counter %d\n",i+1);
                return 0;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int[] arr=Utility.input1DArray();
        String[] menu={"dosa","somosa","jalebi","dahi","sweets","piaghi"};
//        Utility.display1DArray(arr);
//        System.out.print("Enter the number of element to be searched: ");
//        LinearSearch sea=new LinearSearch(sc.nextInt());
        System.out.print("Enter the dish to be served: ");
        LinearSearch dish=new LinearSearch(sc.next());
        if (dish.stringSearch(menu)==-1){
            System.out.println("Sorry your dish is not available now");
        }
//        (sea.stringSearch(menu));
//        if (sea.Search(arr)==-1){
//            System.out.print("Element not found");
//        }
    }
}
