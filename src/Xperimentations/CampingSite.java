package Xperimentations;

public class CampingSite {

    public static int[] findBestCampingSite(char[][] map) {
        int rows = map.length;
        int cols = map[0].length;

        // Directions--> Up, Down, Left, Right
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        int[] bestSite = {-1, -1}; // default value if no site found
        int bestPriority = -1;  //To store best priority

        // Traversing the 2D array for finding empty spots
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (map[i][j] == 'E') {
                    // Checking the neighbors of this empty spot
                    int waterCount = 0, treeCount = 0, rockCount = 0;

                    for (int[] dir : directions) {
                        int newRow = i + dir[0];  // x
                        int newCol = j + dir[1];  // y

                        //Checking if the neighbor is within bounds
                        if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols) {
                            if (map[newRow][newCol] == 'W') waterCount++;
                            else if (map[newRow][newCol] == 'T') treeCount++;
                            else if (map[newRow][newCol] == 'R') rockCount++;
                        }
                    }

                    //checking which priority the case fits in
                    int currentPriority = priority(waterCount, treeCount, rockCount);

                    // If the current spot has a higher priority, update best spot and bestSite coordinates
                    if (currentPriority > bestPriority) {
                        bestPriority = currentPriority;
                        bestSite[0] = i;
                        bestSite[1] = j;
                    }
                }
            }
        }

        return bestSite;
    }


    private static int priority(int waterCount, int treeCount, int rockCount) {
        //Priority 1--> Three different resources and one identical resource
        if ((waterCount > 0 && treeCount > 0 && rockCount > 0) &&
                (waterCount == 2 || treeCount == 2 || rockCount == 2)) {
            return 4;  // Highest priority
        }

        //Priority 2--> Three different resources [W, T, R]
        if (waterCount > 0 && treeCount > 0 && rockCount > 0) {
            return 3;
        }

        //Priority 3--> Two different resources and one identical
        if ((waterCount > 0 && treeCount > 0 && (waterCount == 2 || treeCount == 2)) ||
                (waterCount > 0 && rockCount > 0 && (waterCount == 2 || rockCount == 2)) ||
                (treeCount > 0 && rockCount > 0 && (treeCount == 2 || rockCount == 2))) {
            return 2;
        }

        //Priority 4--> Just two different resources
        if ((waterCount > 0 && treeCount > 0) ||
                (waterCount > 0 && rockCount > 0) ||
                (treeCount > 0 && rockCount > 0)) {
            return 1;  // Lowest priority
        }

        return 0;  // No resources
    }

    public static void main(String[] args) {
        // Input 1
        char[][] map1 = {
                {'E', 'W', 'E', 'T'},
                {'R', 'E', 'T', 'E'},
                {'E', 'E', 'W', 'E'},
                {'T', 'E', 'E', 'R'}
        };
        int[] result1 = findBestCampingSite(map1);
        System.out.println("Best camping site: (" + result1[0] + ", " + result1[1] + ")");

        // Input 2
        char[][] map2 = {
                {'R', 'E', 'T', 'R'},
                {'T', 'E', 'E', 'W'},
                {'E', 'E', 'W', 'E'},
                {'R', 'E', 'T', 'E'}
        };
        int[] result2 = findBestCampingSite(map2);
        System.out.println("Best camping site: (" + result2[0] + ", " + result2[1] + ")");
    }
}
