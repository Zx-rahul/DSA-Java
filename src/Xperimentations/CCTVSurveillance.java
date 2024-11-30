package Xperimentations;

public class CCTVSurveillance {

    public static boolean isSecured(char[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j]=='.') {

                    if (!((i > 0 && grid[i-1][j] == 'C') ||   // up
                            (i < grid.length - 1 && grid[i+1][j] == 'C') ||  // down
                            (j > 0 && grid[i][j-1] == 'C') ||   // left
                            (j < grid[0].length - 1 && grid[i][j+1] == 'C'))) {  // right
                        return false;
                    }

                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        //given Input
        char[][] grid = {
                {'C', '.', '.', '.'},
                {'X', '.', 'C', '.'},
                {'.', '.', 'X', 'C'}
        };

        System.out.println(isSecured(grid));
    }
}
