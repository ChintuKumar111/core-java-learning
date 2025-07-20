package Basics;

import java.util.*;
import java.lang.*;


public class NumberPresentInArray {



        public static void main (String args[]) {

            int position=0;

            Scanner sc = new Scanner(System.in);

            System.out.println("How many time you want to add ");

            int totalNumber = sc.nextInt();


            int arr [] = new int[totalNumber];

            while(totalNumber>0) {



                int input = sc.nextInt();

                arr[position] = input;


                totalNumber--;
                position++;

            }

            System.out.println(" Enter your number to check in array ");

            int userInput = sc.nextInt();
            boolean bn = false;
            int num = 0;

            for (int i = 0;i<arr.length;i++) {

                if(userInput==arr[i]) {
                    bn = true;
                    num= i;
                }


            }

            if(bn) {
                System.out.println("number is present " + num +"th position"+ " "+ userInput);

            }

            else {

                System.out.println("number is not present thankyou :");

            }
        }
    }








