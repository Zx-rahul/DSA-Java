package Xperimentations;


import java.util.ArrayList;
import java.util.List;

    public class Snack {

        //variable for counting purpose
            private static int count = 0;


            // Method for finding all combinations
            public static void snackCombinations(List<String> combination, int target, String[][] snacks, int index) {

                // Base case--> if target becomes 0 that means we got a valid combination
                if (target == 0) {
                    //Printing each valid combination
                    System.out.println(combination);
                    count++;
                    return;
                }

                // If target becomes -ve, no need to proceed further
                if (target < 0) {
                    return;
                }

                // Trying each snack starting from the current index
                for (int i = index; i < snacks.length; i++) {
                    String snackName = snacks[i][0];
                    int snackSpiciness = Integer.parseInt(snacks[i][1]);

                    // Adding the current snack to the combination
                    combination.add(snackName);

                    // Recursion with reduced target (allowing the same snack again)
                    snackCombinations(combination, target - snackSpiciness, snacks, i);

                    //removing the last added snack
                    combination.removeLast();
                }
            }

            public static void main(String[] args) {
                //Given Inputs
                String[][] snacks = { {"Samosa", "5"}, {"Ketchup", "2"}, {"Chips", "3"}, {"Spicy Nuts", "4"} };
                int targetSpiciness = 7;

                System.out.println("Possible Combinations for Target Spiciness " + targetSpiciness + " are--> ");

                // Finding all combinations that add-on to reach the target spiciness
                snackCombinations(new ArrayList<>(), targetSpiciness, snacks, 0);

                // Total count of valid combinations
                System.out.println("Total number of combinations: " + count);
            }
    }

