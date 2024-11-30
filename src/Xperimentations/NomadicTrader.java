package Xperimentations;

public class NomadicTrader {

    public static int maxGoodsCollected(int initialEnergy, int[] goods, int[] travelEnergy, int[] tradeEnergy) {
        int totalGoodsCollected = 0;
        int currentEnergy= initialEnergy;

        for (int i = 0; i < goods.length; i++) {
            // Checking if the trader has enough energy to travel to the next town
            if (currentEnergy >= travelEnergy[i]) {
                // Energy deduction to travel to town i
                currentEnergy -= travelEnergy[i];

                // Collecting goods in the town
                totalGoodsCollected += goods[i];

                // Gain energy from trading
                currentEnergy += tradeEnergy[i];
            } else {
                //trader don't have enough energy to reach the next town, stopping the journey
                break;
            }
        }
        return totalGoodsCollected;//returning total collection
    }

    public static void main(String[] args) {
        //Given Inputs
        int initialEnergy = 20;
        int[] goods = {5, 10, 15};
        int[] travelEnergy = {5, 10, 8};
        int[] tradeEnergy = {5, 10, 5};

        int result = maxGoodsCollected(initialEnergy, goods, travelEnergy, tradeEnergy);
        System.out.println("Maximum goods collected: " + result);
    }
}

