package Xperimentations;

import java.util.List;

public class LongestWord {


    public static String word(List<String> words, char ch) {
        String longestWord = "";

        for (String word : words) {
            // Checking if the word starts with the given character
            if (word.charAt(0) == ch) {
                // If we find a bigger word than the prev one
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
        }

        return longestWord;  // Returning the longest word(word or empty string)
    }

    public static void main(String[] args) {
        //Given Inputs
        List<String> words1 = List.of("explore", "adventure", "uncharted", "endless", "expedition");
        char ch1 = 'e';
        List<String> words2 = List.of("quest", "voyage", "map", "horizon");
        char ch2 = 'a';

        System.out.println(word(words1, ch1));
        System.out.println(word(words2, ch2));
    }

}