package Collections.Collection.Set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharacters {

    public static void uniqueFinder(Set<Character> unique,String word){
        System.out.println("Input string: " + word);
        for (char ch : word.toCharArray()) {
            unique.add(ch);
        }
        System.out.println("Unique characters: " + unique);
        System.out.println("Number of unique characters: " + unique.size());
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Set<Character> unique=new HashSet<>();
        System.out.println("please enter the string");
        String word=sc.nextLine();
        uniqueFinder(unique,word);
    }
}
