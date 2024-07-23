package Collections.Map.Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterHashing {
    public static void main(String[] args) {
        HashMap<Character,Integer> hash=new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your sentence: ");
        String word= sc.nextLine().toLowerCase();
        precompute(hash,word);
        System.out.println("Number of queries");
        int q=sc.nextInt();
        System.out.println("Give the element below to be searched:  ");
        while (q>0) {
            System.out.print("Enter: \n");
            char v=sc.next().charAt(0);
            System.out.println("Present "+hash.get(v)+" Times");
            q--;
        }
    }

    private static void precompute(HashMap<Character,Integer> hash,String word) {
        for (char c : word.toCharArray()) {
            hash.put(c, hash.getOrDefault(c,0)+1);

        }
    }
}
