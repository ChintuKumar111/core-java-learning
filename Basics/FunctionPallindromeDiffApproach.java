package Basics;
import java.util.*;
import java.lang.*;
import java.io.*;


public class FunctionPallindromeDiffApproach {
        public static boolean Occur(int userInput) {

            int check = 0;
            int reverse = 0;
            int Pallindrome = userInput;

            while (userInput > 0) {


                check = userInput % 10;

                System.out.print(check);

                reverse = reverse * 10 + check;

                userInput /= 10;
            }

            return reverse == Pallindrome;


        }

        public static void main(String[] args) {


            Scanner sc = new Scanner(System.in);

            System.out.println("Enter your number for question");

            int userInput = sc.nextInt();


            boolean result = Occur(userInput);

            if (result) {
                System.out.println(" pallindrome");
            } else
                System.out.println(" not pallindrome");

        }

    }