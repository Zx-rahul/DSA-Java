package Xperimentations;

public class ScareCrows {

    public static int scarecrowsRequired(String farm) {
        if (farm == null || farm.isEmpty()) {//checking if empty or null
            return 0;
        }

        char[] farms = farm.toCharArray();
        int scarecrowCount = 0;//To count the minimum number of scarecrows
        int i = 0;

        while (i < farms.length) {
            if (farms[i] == 'C') {//when C found

                // Trying to place scarecrow at optimal position
                if (i + 1 < farms.length && farms[i + 1] == '.') {//0-second last index //Forward Checking
                    //Covers i, i+1, i+2
                    scarecrowCount++;
                    i += 3;  // Skipping the protected area
                }
                //1-last index //Reverse checking
                else if (i - 1 >= 0 && farms[i - 1] == '.') {//
                    //Covers i-2, i-1, i
                    scarecrowCount++;
                    i += 1;  // Skipping the next protected area
                } else {
                    //If we Can't protect the crop [CCC][#C#]
                    return -1;
                }
            } else {
                i++;
            }
        }

        return scarecrowCount;
    }

    public static void main(String[] args) {
        //given Inputs
        String farm1 = "C..C.C.C..";
        String farm2 = "C.C.#C.CC";

        System.out.println(scarecrowsRequired(farm1));
        System.out.println(scarecrowsRequired(farm2));
    }

}
