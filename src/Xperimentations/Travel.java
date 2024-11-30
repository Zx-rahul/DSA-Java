package Xperimentations;

import java.util.*;

public class Travel {

    public static List<String> combos(int budget, Map<String, List<Integer>> countries) {
        List<String> selectedCountries = new ArrayList<>();
        List<Map.Entry<String, Integer>> countryCosts = new ArrayList<>();

        for (Map.Entry<String, List<Integer>> entry : countries.entrySet()) {
            int minPrice = Collections.min(entry.getValue());
            countryCosts.add(Map.entry(entry.getKey(), minPrice));
        }

        countryCosts.sort(Comparator.comparingInt(Map.Entry::getValue));

        for (Map.Entry<String, Integer> entry : countryCosts) {
            int cost = entry.getValue();
            if (cost <= budget) {
                selectedCountries.add(entry.getKey());
                budget -= cost;
            }
        }

        return selectedCountries;
    }

    public static void main(String[] args) {
        int budget = 1000;
        Map<String, List<Integer>> countries = new HashMap<>();
        countries.put("Japan", List.of(1000));
        countries.put("Brazil", List.of(300, 350, 400));
        countries.put("Australia", List.of(500, 550));

        List<String> result = combos(budget, countries);
        System.out.println("Best combo: " + result);
    }
}