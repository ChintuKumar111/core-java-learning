package Basics;

import java.util.Scanner;

public class reverseNumber {


        public static void main (String[] args) throws java.lang.Exception
        {

            Scanner sc = new Scanner (System. in);

            System.out.println("Enter the number you wan to reverse");

//			int userInputNumber = sc.nextInt();
//
//			String ss = new  StringBuilder(String.valueOf(userInputNumber)).reverse().toString();
//
//			System.out.println(ss);
//

            int reverse=0;
            int lastDigit ;

            int userInput = sc.nextInt();

            while(userInput>0) {

                lastDigit = userInput%10;

                reverse = reverse*10 +lastDigit;

                userInput/=10;


            }
            System.out.println(reverse);
        }

}
