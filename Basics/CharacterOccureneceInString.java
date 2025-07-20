package Basics;

import java.util.Scanner;

public class CharacterOccureneceInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your word: ");
        String word = sc.nextLine();

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int count = 0;

            // Check if this character was already counted
            boolean alreadyCounted = false;
            for (int k = 0; k < i; k++) {
                if (word.charAt(k) == ch) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (alreadyCounted) {
                continue; // skip counting this again
            }

            // Count how many times 'ch' appears
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(j) == ch) {
                    count++;
                }
            }

            System.out.println("'" + ch + "' occurs " + count + " time(s)");
        }
    }
}
