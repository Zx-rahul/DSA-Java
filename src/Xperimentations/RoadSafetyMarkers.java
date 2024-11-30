package Xperimentations;

public class RoadSafetyMarkers {
    public static int minimumMarkersRequired(int[] road) {
        int n = road.length;
        int markers = 0;
        int i = 0;

        while (i < n) {
            // If we encountered a hazardous zone (1)
            if (road[i] == 1) {
                markers++; // Placing a marker on the hazardous zone
                // Moving to the position after the next two sections (since marker covered i, i+1, i+2)
                i += 3;
            } else {
                // If we encountered a safe zone (0) just move next
                i++;
            }
        }

        return markers;
    }

    public static void main(String[] args) {
        // Given Inputs
        int[] road1 = {1, 0, 1, 1, 0, 1};
        int[] road2 = {1, 0, 0, 1, 1, 0, 1};

        System.out.println(minimumMarkersRequired(road1));
        System.out.println(minimumMarkersRequired(road2));

    }
}
