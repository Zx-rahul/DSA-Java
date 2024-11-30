package Xperimentations;

import java.util.Scanner;

public class BootSelection {

    public static int durabilityChecker(int[] trail, int[] boot) {
        int changes = 0;
        int bootIndex = 0;
        int position = 0;

        // Traverse the trail
        while (position < trail.length) {
            // Check if the current boot can handle the current terrain
            if (boot[bootIndex] >= trail[position]) {
                position++; // Move to the next position
            } else {
                // Try to find a new boot that can handle the current terrain
                boolean foundBoot = false;
                for (int i = bootIndex + 1; i < boot.length; i++) {
                    if (boot[i] >= trail[position]) {
                        bootIndex = i; // Switch to the new boot
                        changes++; // Increment boot changes
                        foundBoot = true;
                        break;
                    }
                }
                // If no boot can handle the current terrain, the trail cannot be completed
                if (!foundBoot) {
                    return -1; // The trail cannot be completed
                }
            }
        }
        return changes;
    }

    //just for array input purpose
    public static int[] input(String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter the number of %ss: ",name);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Enter the %s %d: ",name, (i + 1));
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println("Enter the difficulty level of Trail");
        int[] trail = input("trail");
        int[] boot = input("boot");
        System.out.println("Minimum Boot Changes Required: "+durabilityChecker(trail,boot));

    }
}
