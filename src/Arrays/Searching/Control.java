package Arrays.Searching;

import java.util.Scanner;

    public class Control {
        private final int key;

        public Control(int key) {
            this.key = key;
        }

        int largest(int[] arr){
            int first = 0, last = arr.length - 1, mid;
            while (first <= last) {
                mid = first + (last - first) / 2;
                if (arr[mid] == key) {
                    return arr[mid];
                } else if (arr[mid] > key) {
                    last = mid - 1;
                } else {
                    first = mid + 1;
                }
            }
            return -999;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] arr = Utility.input1DArray();
            Utility.display1DArray(arr);
            System.out.println("Enter the number to be searched:");
            Control search = new Control(sc.nextInt());
            int res = search.largest(arr);
            if (res == -999) {
                System.out.println("Number not found");
            } else {
                System.out.printf("Element %d found\n", res);
            }
        }
    }

