package Xperimentations;

import java.util.*;

public class AdventurousExplorer {


    public static List<String> findUniqueElements(List<List<String>> caves, List<String> knownElements) {

        Set<String> knownSet = new HashSet<>(knownElements);//conversion
        Set<String> newElements = new HashSet<>();

        for (List<String> cave : caves) {
            for (String element : cave) {
                if (!knownSet.contains(element)) {
                    newElements.add(element);
                }
            }
        }
        return new ArrayList<>(newElements);
    }

    public static void main(String[] args) {
        // Given caves input
        List<List<String>> caves = Arrays.asList(
                Arrays.asList("gold", "silver", "emerald"),
                Arrays.asList("emerald", "diamond", "ruby"),
                Arrays.asList("sapphire", "silver", "platinum")
        );

        // given know input
        List<String> knownElements = Arrays.asList("gold", "silver", "platinum");
        List<String> uniqueElements = findUniqueElements(caves, knownElements);

        System.out.println(uniqueElements);
    }
}

