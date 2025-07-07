package Basics;
import java.util.*;
import java.lang.*;
import java.io.*;

public class palindrome {


        public static void main (String args[]) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter your number for check palindrome");

            int number = sc.nextInt();

//		String original = String.valueOf(number);
//
//
//		String str = new StringBuilder(String.valueOf(original)).reverse().toString();
//
//		if(str.equals(original)){
//			System.out.println("this is palindrome");
//		}
//
//		else {
//
//
//		System.out.println("this is not");
//
//	}


            int fNumber = 0;
            int SNumber = 1;
            for (int i =2;i<=number;i++) {

                int result = fNumber+SNumber;

                System.out.println(result);

                fNumber = SNumber;
                SNumber= result;
            }




        }
    }

