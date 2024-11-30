package Xperimentations;

public class DistinctIsland {
    public int numIslands(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int rows = grid.length;
        int cols = grid[0].length;
        int islands = 0;

        // Creating a visited array for marking
        boolean[][] visited = new boolean[rows][cols];

        //Firstly counting the horizontal islands
        for (int i = 0; i < rows; i++) {
            int j = 0;
            while (j < cols) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    int start = j;
                    //finding the end of horizontal sequence
                    while (j + 1 < cols && grid[i][j + 1] == 1) {
                        j++;
                    }
                    //if sequence length is greater than 1 then count as island
                    if (j > start) {
                        islands++;
                        //Marking true the visited cells
                        for (int k = start; k <= j; k++) {
                            visited[i][k] = true;
                        }
                    }
                }
                j++;
            }
        }

        //secoundly counting the vertical islands
        for (int j = 0; j < cols; j++) {
            int i = 0;
            while (i < rows) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    int start = i;
                    //finding the end of vertical sequence
                    while (i + 1 < rows && grid[i + 1][j] == 1) {
                        i++;
                    }
                    if (i >= start) {
                        islands++;
                        //Marking true the visited cells
                        for (int k = start; k <= i; k++) {
                            visited[k][j] = true;
                        }
                    }
                }
                i++;
            }
        }

        //lastly counting remaining single cells
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    islands++;
                }
            }
        }

        return islands;
    }

    public static void main(String[] args) {
        //given inputs
        int[][] grid = {
                {1, 1, 0, 0, 0},
                {1, 1, 0, 0, 1},
                {0, 0, 0, 1, 1},
                {0, 0, 0, 0, 0},
                {1, 0, 1, 0, 1}
        };

        DistinctIsland solution = new DistinctIsland();
        System.out.println("Number of islands: " + solution.numIslands(grid));
    }
}