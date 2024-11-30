package Xperimentations;

public class DistanceCalculator {

    public static double isTotalDistance(int[][] landmarks) {
        double totalDistance = 0.0;

        for (int i = 1; i < landmarks.length; i++) {
            int[] point1 = landmarks[i - 1];
            int[] point2 = landmarks[i];

            // Calculating distance between point1 and point2 by Euclidean formula
            double distance = Math.sqrt(Math.pow(point2[0] - point1[0], 2) + Math.pow(point2[1] - point1[1], 2));
            totalDistance += distance;
        }

        // Rounding off to two decimal places
        return Math.round(totalDistance * 100.0) / 100.0;
    }

    public static void main(String[] args) {
        int[][] landmarks = {
                {1, 2},
                {4, 6},
                {8, 10}};

        double totalDistance = isTotalDistance(landmarks);
        System.out.println("Total distance : " + totalDistance);
    }
}
