package Xperimentations;

import java.util.ArrayList;
import java.util.List;

public class SolarEnergy {

    // Class representing a solar panel
    static class SolarPanel {
        private int maxCapacity;          // in kw
        private double efficiencyFactor;  // between 0 and 1

        public SolarPanel(int maxCapacity, double efficiencyFactor) {
            this.maxCapacity = maxCapacity;
            this.efficiencyFactor = efficiencyFactor;
        }

        public int getMaxCapacity() {
            return maxCapacity;
        }

        public double getEfficiencyFactor() {
            return efficiencyFactor;
        }

        //calculating energy output of this panel
        public double getEnergyOutput() {
            return maxCapacity * efficiencyFactor;
        }
    }


    public static double calculateTotalEnergyOutput(List<SolarPanel> panels) {
        double totalEnergy = 0.0;

        for (SolarPanel panel : panels) {
            totalEnergy += panel.getEnergyOutput();
        }

        // Rounding off to two decimal places
        totalEnergy = Math.round(totalEnergy * 100.0) / 100.0;
        return totalEnergy;
    }

    // Given Inputs
    public static void main(String[] args) {
        // creating a list of solar panels
        List<SolarPanel> panels = new ArrayList<>();
        panels.add(new SolarPanel(100, 0.8));
        panels.add(new SolarPanel(150, 0.6));
        panels.add(new SolarPanel(200, 0.75));

        // total energy output
        double totalEnergy = calculateTotalEnergyOutput(panels);
        System.out.println("Total Energy Output: " + totalEnergy + " kilowatts");
    }
}
