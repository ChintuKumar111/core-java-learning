package Basics;

import java.util.Scanner;

public class simplecalculator {








        public static void main (String[] args) throws java.lang.Exception
        {
            // your code goes here


            Scanner sc = new Scanner(System.in);

            System.out.println("Welcome to the simple calculator");

            System.out.println("Enter the first Number ");

            double firstNumber = sc.nextDouble();

            System.out.println("Enter your second Number");

            double secondNumber = sc.nextDouble();

            System.out.println("choose Action  +, - ,* , /");

            char operator = sc.next().charAt(0);


            switch(operator) {
                case '+' :
                    System.out.println(firstNumber+secondNumber);
                    break;

                case '-':
                    System.out.println(firstNumber-secondNumber );
                    break;

                case '*':
                    System.out.println(firstNumber*secondNumber);
                    break;

                case '/':
                    System.out.println(firstNumber/secondNumber);
            }



        }
    }


