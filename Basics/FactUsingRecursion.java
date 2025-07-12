package Basics;
import java.util.*;
import java.lang.*;
import java.io.*;

public class FactUsingRecursion {
        public static void main (String [] args) {

            Scanner sc =new Scanner(System.in);

            System.out.println("Enter your number for Factorial number");

            int userInput = sc.nextInt();

            int res = 	fact(userInput);

            System.out.println("Factorial of "+ userInput + " is  : "+ res);

        }


        public static int fact(int n) {


            if(n==0 || n==1) {
                return 1;
            }
            return n*fact(n-1);
        }

    }
