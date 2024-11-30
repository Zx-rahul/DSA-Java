package Arrays.Sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListUtils {

    // Method to take input from user and create a list
    public static ArrayList<Integer> takeInput() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter integers (type 'end' to finish):");

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                list.add(scanner.nextInt());
            } else {
                String input = scanner.next();
                if (input.equalsIgnoreCase("end")) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter an integer or 'end' to finish.");
                }
            }
        }
        return (ArrayList<Integer>) list;
    }

    // Method to display the list
    public static void displayList(List<Integer> list) {
        System.out.println("List: " + list);
    }
}
