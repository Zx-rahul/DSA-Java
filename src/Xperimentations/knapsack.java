package Xperimentations;


public class knapsack {
    // Calculating maximum value
    public static int knapsack(int N, int W, int[] weights, int[] values) {
        return knapsackRecursive(N, W, weights, values);
    }

    // Helper recursive function
    private static int knapsackRecursive(int N, int W, int[] weights, int[] values) {
        // when no items left or no weight is left
        if (N == 0 || W == 0) {
            return 0;
        }

        // if bag W is more, skip it
        if (weights[N - 1] > W) {
            return knapsackRecursive(N - 1, W, weights, values);
        } else {
            return Math.max(
                    values[N - 1] + knapsackRecursive(N - 1, W - weights[N - 1], weights, values),
                    knapsackRecursive(N - 1, W, weights, values)
            );
        }
    }

    public static void main(String[] args) {
        //manual input
        int N = 4; // number of items
        int W = 10; // maximum bag weight
        int[] weights = {5, 4, 6, 3}; // weight of items
        int[] values = {10, 40, 30, 50}; // value of items

        int maxValue = knapsack(N, W, weights, values);
        System.out.println("Maximum total value in the backpack: " + maxValue);
    }
}

