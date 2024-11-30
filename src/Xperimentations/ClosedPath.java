package Xperimentations;

public class ClosedPath {
    public static boolean isClosedPath(String directions) {
        int x = 0, y = 0;//Initial position

        for (char dir : directions.toCharArray()) {
            switch (dir) {
                case 'U': y++; break;//+1 to y-axis in UP direction
                case 'D': y--; break;//-1 to y-axis in DOWN direction
                case 'L': x--; break;//-1 to y-axis in LEFT direction
                case 'R': x++; break;//+1 to y-axis in RIGHT direction
            }
        }

        // Checking if the final position is back in the origin
        return x == 0 && y == 0;
    }

    public static void main(String[] args) {
        //Given Inputs
        String directions = "UDLLRRDDRULU";
        System.out.println(isClosedPath(directions));
    }
}

