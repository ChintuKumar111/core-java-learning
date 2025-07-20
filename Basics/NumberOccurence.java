package Basics;





import java.util.*;
import java.lang.*;

public class NumberOccurence {

        public static void main(String[] args) {

            int count = 0;

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter your number for question");

            int question = sc.nextInt();

            System.out.println("Enter the number you want to get that how much time it occur in given question");


            int userInput = sc.nextInt();

            while (question > 0) {

                int checkInput = question % 10;

                if (checkInput == userInput) {

                    count++;

                }


                question /= 10;


            }
            System.out.println("the number " + userInput + " is occur " + count + " timess ");

        }

    }
