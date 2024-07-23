package Arrays.Hashing;

import java.util.Arrays;
import java.util.Scanner;

public class CharacterHashing {
    public static void compute(int[] hash,String word)
    {
        for (char c : word.toCharArray()) {
            if (c>='a'&& c<='z') {
                //pre compute
                hash[c-'a']++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your sentence");
        String word=sc.nextLine().toLowerCase().replaceAll("[^a-z]","");
        int hash[]=new int[26];
        Arrays.fill(hash,0);
        //pre compute
        compute(hash,word);
        System.out.println("Number of queries");
        int q=sc.nextInt();
        while (q>0) {
            System.out.print("Enter the letter to be searched: \n");
            char c = Character.toLowerCase(sc.next().charAt(0));
            if (c >= 'a' && c <= 'z') {
                //fetching
                System.out.printf("Element occurred %d times%n", hash[c - 'a']);

            } else {
                System.out.println("Invalid character entered. Please enter a lowercase letter between 'a' and 'z'.");
            }
            q--;
        }
    }
}
