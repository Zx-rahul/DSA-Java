package Xperimentations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Encryption {

    public static List<String> encrypt( List<String> keywords, int shiftValue) {
        List<String> encryptedKeywords = new ArrayList<>();

        //Iterated through each keyword
        for (String keyword : keywords) {
            StringBuilder encryptedWord = new StringBuilder();

            //Encrypting each character in the keyword
            for (char ch : keyword.toCharArray()) {
                if (Character.isLowerCase(ch)) {  // For lowercase
                    char encryptedChar = (char) (((ch - 'a' + shiftValue) % 26) + 'a');
                    encryptedWord.append(encryptedChar);
                } else if (Character.isUpperCase(ch)) {  // For uppercase
                    char encryptedChar = (char) (((ch - 'A' + shiftValue) % 26) + 'A');
                    encryptedWord.append(encryptedChar);
                } else {  // special case remain unchanged
                    encryptedWord.append(ch);
                }
            }

            // Adding the encrypted word to the result list
            encryptedKeywords.add(encryptedWord.toString());
        }

        return encryptedKeywords;
    }




    public static void main(String[] args) {
        // Given inputs
        int n = 3;
        List<String> keywords = Arrays.asList("Hello", "Journal", "Secret");
        int shiftValue = 3;

        List<String> result = encrypt(keywords, shiftValue);

        //Printing the encrypted keyword
        System.out.println(result);
    }
}
