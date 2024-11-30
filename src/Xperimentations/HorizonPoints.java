package Xperimentations;

import java.util.ArrayList;

public class HorizonPoints {
    public static ArrayList<Integer> areHorizonPoints(int[] buildingHeights) {
        ArrayList<Integer> horizonPoints = new ArrayList<>();

        //empty checking
        if (buildingHeights.length==0){
            return horizonPoints;
        }

        int maxHeight = buildingHeights[0];  //tracks the maximum height
        horizonPoints.add(0);//First element always be a horizon point

        for (int i = 1; i < buildingHeights.length; i++) {
            if (maxHeight < buildingHeights[i]){
                horizonPoints.add(i);//Adding the horizon point or in other words
                // Adding the index if the building is taller than the max height to its left
                maxHeight=buildingHeights[i];//Updating the maximum height
            }
        }



        return horizonPoints;
    }

    public static void main(String[] args) {
        int[] buildingHeights = {3,1,5,2,6};
        System.out.println(areHorizonPoints(buildingHeights));
    }
}
