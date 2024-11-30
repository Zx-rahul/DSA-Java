package Xperimentations;

import java.util.Scanner;

public class CarsMileage {

    public static boolean canReachDestination(double distance, double fuel) {

        // Calculating base fuel
        double baseFuelNeeded = distance / 24.0;

        // Calculating extra fuel needed due to efficiency drop
        double extraLitres = distance / 30.0;

        //Calculating Total fuel consumption
        double totalFuelRequired = baseFuelNeeded + extraLitres;

        // Checking Given fuel is enough or not
        return fuel >= totalFuelRequired;
    }

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("******WELCOME TO CAR******");
        System.out.println("Don't forget to tie your seatbelts");
        System.out.println("Enter how much distance you are going to travel in KMs");
        double distance = scanner.nextDouble();
        System.out.println("Enter the amount of fuel in litres");
        double fuel = scanner.nextDouble();
        System.out.println(canReachDestination(distance, fuel));
    }

}
