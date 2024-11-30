package Xperimentations;

public class RhinoCounting {

    public static int minRangersRequired(int[] rhinos, int maxRhinosPerRanger) {
        int totalRangers = 0;  //how many rangers required

        for (int i = 0; i < rhinos.length; i++) {
            int zones = rhinos[i];

            // If a single ranger can handle the whole zone, assign one ranger
            if (zones <= maxRhinosPerRanger) {
                totalRangers++;
            } else {
                // If more than one ranger is needed for the zone, calculate how many are needed
                totalRangers += (zones / maxRhinosPerRanger);

                // Check if there's any leftover rhinos after dividing by the limit
                if (zones % maxRhinosPerRanger != 0) {
                    totalRangers++;
                }
            }

            // Check if this ranger can travel to the next zone
            if (i < rhinos.length - 1 && zones < maxRhinosPerRanger / 2) {
                // Move to the next zone and let this ranger continue
                int nextZoneRhinos = rhinos[i + 1];

                // If the ranger can handle the full next zone, move them there
                if (nextZoneRhinos <= maxRhinosPerRanger) {
                    i++;  // Skip the next zone since it is covered
                }
            }
        }

        return totalRangers;
    }

    public static void main(String[] args) {
        int[] rhinoCounts = {20,25,5};
        int maxRhinosPerRanger = 10;

        int result = minRangersRequired(rhinoCounts, maxRhinosPerRanger);
        System.out.println("Minimum rangers required: " + result);
    }
}