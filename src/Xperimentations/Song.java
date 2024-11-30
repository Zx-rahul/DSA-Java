package Xperimentations;

public class Song {

    public static String rearrangeChords(String s) {


        int n = s.length();
        int[] freq = new int[26];  // Frequency array for 'A' to 'Z' Index

        // Counting the frequency of each Alphabet/chord
        for (char c : s.toCharArray()) {
            freq[c - 'A']++;
        }

        // Finding the highest frequency
        int maxFreq = 0, maxChar = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                maxChar = i;
            }
        }

        //Checking if it is possible to rearrange the string by formula (n+1)/2
        if (maxFreq > (n + 1) / 2) {
            return "Not Possible";
        }

        //Creating an array to Store the New String
        char[] result = new char[n];
        int index = 0;

        //Placing the most frequent chord in alternate positions (filling in even index 0,2,4....)
        while (freq[maxChar] > 0) {
            result[index] = (char) (maxChar + 'A');
            index += 2;
            freq[maxChar]--;
        }

        //Placing the remaining chords in the odd position( which were left)
        for (int i = 0; i < 26; i++) {
            while (freq[i] > 0) {
                if (index >= n) {
                    index = 1;
                }
                result[index] = (char) (i + 'A');
                index += 2;
                freq[i]--;
            }
        }

        return new String(result);
    }


        public static void main(String[] args) {

            //Given Inputs
            System.out.println(rearrangeChords("AAABBBCCC"));
            System.out.println(rearrangeChords("AAAAA"));
        }
    }
