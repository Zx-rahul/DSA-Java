package Recursion;

import java.util.Scanner;

public class StringPalindrome {
    public static boolean print(StringBuilder word,int i) {
        if (i>= word.length()/2){
            return true;
        }
        if (word.charAt(i)!=word.charAt(word.length()-1-i)) {

                return false;
        }
        return print(word, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String word = sc.nextLine();
        StringBuilder newWord = new StringBuilder();
        for (char c : word.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                newWord.append(Character.toLowerCase(c));
            }
        }
        System.out.println(print(newWord,0));
    }
}