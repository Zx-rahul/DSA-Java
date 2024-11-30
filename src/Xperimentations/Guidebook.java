package Xperimentations;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Guidebook {
    public static List<String> sortTitles(List<String> titles) {

        // Sorting the list of titles alphabetically
        titles.sort(String.CASE_INSENSITIVE_ORDER);
        return titles;
    }

    public static void main(String[] args) {

        // Example inputs given
        int n = 5;//manually enter the value of n
        List<String> titles = Arrays.asList("Introduction", "Conclusion", "Appendix", "History", "Methods");

        // Printing the sorted titles
        System.out.println(sortTitles( titles));
    }
}
