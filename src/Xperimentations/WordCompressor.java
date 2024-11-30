package Xperimentations;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class WordCompressor {

    public static List<String> compressJumboWords(List<String> words) {
        List<String> result = new ArrayList<>();

        for (String word : words) {
            result.add(containsJumboSequence(word) ? "JUMBO" : word);
        }

        return result;
    }

    private static boolean containsJumboSequence(String word) {
        // Converting to uppercase to make case-insensitive comparison
        word = word.toUpperCase();

        int jIndex = word.indexOf('J');
        if (jIndex == -1) return false;

        int uIndex = word.indexOf('U', jIndex + 1);
        if (uIndex == -1) return false;

        int mIndex = word.indexOf('M', uIndex + 1);
        if (mIndex == -1) return false;

        int bIndex = word.indexOf('B', mIndex + 1);
        if (bIndex == -1) return false;

        int oIndex = word.indexOf('O', bIndex + 1);
        if (oIndex == -1) return false;

        return true;
    }

    public static void main(String[] args) {
        //given inputs
        List<String> testWords = Arrays.asList("jumbo", "robot", "abjuvombo", "justmakebitold", "JUMBO");
        System.out.println(testWords);
        List<String> compressed = compressJumboWords(testWords);
        System.out.println(compressed);

    }
}
