package Basics;

import java.util.*;
import java.lang.*;
import java.io.*;



public class vowelsConsonantTotalNumber {

    public static void main (String args[]) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter name or sentence to check how many vowels and consonat are their");

            String number = sc.nextLine();
            String value = "";

            int vowel = 0;
            int consonant = 0;

            for (int i =0;i<number.length();i++) {



                String input = String.valueOf(number.charAt(i));

                input = input.toLowerCase();

                if(input.equals("a") || input.equals("e")||input.equals("i")||input.equals("o") || input.equals("u")) {

                    vowel++;
                }else {
                    consonant++;
                      }
           }
            System.out.println("total number of vowel :"+value + " "+vowel);
            System.out.println("total number of  consonant : " + value + " "+consonant);

        }

}
