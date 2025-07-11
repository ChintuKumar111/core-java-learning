package Basics;
import java.util.*;
import java.lang.*;
import java.io.*;
public class OcuurenceNumberByFunction {

        public static int Occur(int userInput, int checkInput) {
            int count = 0;

            while (userInput > 0) {

                int check = userInput % 10;

                if (check == checkInput) {

                    count++;
                }

                userInput /= 10;
            }
            System.out.println("the number " + checkInput + " is occur " + count + " times ");
            return count;
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter your number for question");

            int userInput = sc.nextInt();

            System.out.println("Enter the number you want to recieve that how much time it occur in given question");


            int checkInput = sc.nextInt();


            Occur(userInput, checkInput);

        }
    }




