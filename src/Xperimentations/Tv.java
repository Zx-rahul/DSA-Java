package Xperimentations;

public class Tv {

    public static boolean irSignalRange(int[] tv_position, int[] remote_position, int remote_range) {
        // Checking if the TV is within range on either the x-axis or y-axis
        return (Math.abs(tv_position[0] - remote_position[0]) <= remote_range)
                || (Math.abs(tv_position[1] - remote_position[1]) <= remote_range);
    }


    public static void main(String[] args) {
        //Given Inputs
        int[] tv_position = {2,6};
        int[] remote_position = {2,3};
        int remote_range = 4;
        if (irSignalRange(tv_position,remote_position,remote_range)){
            System.out.println("True, TV is accessible");
        }else {
            System.out.println("False, TV is not accessible");
        }
    }
}

