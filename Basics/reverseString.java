package Basics;

import java.util.*;
import java.lang.*;
import java.io.*;





public class reverseString {

    public static void main (String[] args) throws java.lang.Exception
    {

//			Scanner sc = new Scanner (System. in);
//
//			System.out.println("Enetr the number you wan to reverse");
//
////			int userInputNumber = sc.nextInt();
////
////			String ss = new  StringBuilder(String.valueOf(userInputNumber)).reverse().toString();
////
////			System.out.println(ss);
////
//
//			 int reverse=0;
//			int lastDigit ;
//
//			int userInput = sc.nextInt();
//
//
//			String reverse1 = new StringBuilder(String.valueOf(userInput)).reverse().toString();
//
//			System.out.println(reverse1);

//			while(userInput>0) {
//
//				lastDigit = userInput%10;
//
//				reverse = reverse*10 +lastDigit;
//
//				userInput/=10;
//
//
////			}
//			System.out.println(reverse);





        Scanner sc = new Scanner(System.in);

        int userInput = sc.nextInt();

        int simpleValue = 0;

        String str= new StringBuilder(String.valueOf(userInput)).reverse().toString();

        System.out.println(str);




    }
}

