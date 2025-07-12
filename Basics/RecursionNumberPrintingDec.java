package Basics;
import java.util.*;
public class RecursionNumberPrintingDec {
        public static void main (String [] args) {

            Scanner sc =new Scanner(System.in);

            System.out.println("Enter your number");

            int userInput = sc.nextInt();

            printDec(userInput);
        }

      public static void printDec(int n) {

            if(n==0) {

                return;
            }

            System.out.println(n);

            printDec(n-1);


        }
}
