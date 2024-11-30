package Xperimentations;

public class IslandCounter {
    public int numIslands(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int rows = grid.length;
        int cols = grid[0].length;
        int islands = 0;

        // Create a copy of the grid
        int[][] gridCopy = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            gridCopy[i] = grid[i].clone();
        }

        char[][] visual = new char[rows][cols];
        int islandNum = 1;

        // Initialize visual array with '0' for water
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 0) {
                    visual[i][j] = '0';
                }
            }
        }

        // First pass: Mark horizontal sequences
        for (int i = 0; i < rows; i++) {
            int start = 0;
            while (start < cols) {
                // Find start of horizontal sequence
                while (start < cols && gridCopy[i][start] != 1) {
                    start++;
                }
                if (start >= cols) break;

                // Find end of horizontal sequence
                int end = start;
                while (end + 1 < cols && gridCopy[i][end + 1] == 1) {
                    end++;
                }

                // If sequence length > 1, mark it as an island
                if (end > start) {
                    islands++;
                    // Mark all cells in sequence
                    for (int j = start; j <= end; j++) {
                        gridCopy[i][j] = 0;  // Mark as visited
                        visual[i][j] = (char)('0' + islandNum);
                    }
                    islandNum++;
                }
                start = end + 1;
            }
        }

        // Second pass: Mark vertical sequences
        for (int j = 0; j < cols; j++) {
            int start = 0;
            while (start < rows) {
                // Find start of vertical sequence
                while (start < rows && gridCopy[start][j] != 1) {
                    start++;
                }
                if (start >= rows) break;

                // Find end of vertical sequence
                int end = start;
                while (end + 1 < rows && gridCopy[end + 1][j] == 1) {
                    end++;
                }

                // If we found a sequence (even single cell), mark it
                if (end >= start) {
                    islands++;
                    // Mark all cells in sequence
                    for (int i = start; i <= end; i++) {
                        gridCopy[i][j] = 0;  // Mark as visited
                        visual[i][j] = (char)('0' + islandNum);
                    }
                    islandNum++;
                }
                start = end + 1;
            }
        }

        // Final pass: Mark remaining single cells
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (gridCopy[i][j] == 1) {
                    islands++;
                    visual[i][j] = (char)('0' + islandNum);
                    islandNum++;
                }
            }
        }

        // Print visualization
        System.out.println("\nVisualization of islands:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(visual[i][j] + " ");
            }
            System.out.println();
        }

        return islands;
    }

    public static void main(String[] args) {
        int[][] grid = {
                {1, 1, 0, 0, 0},
                {1, 1, 0, 0, 1},
                {0, 0, 0, 1, 1},
                {0, 0, 0, 0, 0},
                {1, 0, 1, 0, 1}
        };

        IslandCounter solution = new IslandCounter();
        System.out.println("Number of islands: " + solution.numIslands(grid));
    }
}