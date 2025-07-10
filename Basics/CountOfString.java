package Basics;


import java.util.*;
import java.lang.*;

class CountOfString{

        public static void main (String args[]) {


            // Approach first

            Scanner sc = new Scanner(System.in);

            String str = sc.nextLine();


//String lowerCase = str.toLowerCase();
//
//String upperCase = str.toUpperCase();
//
//System.out.println(lowerCase);
//
//System.out.println(upperCase);

            int count = 0;
            for(int i = 0;i<str.length();i++) {


                count++;

            }
            System.out.println("total number in string  :"+count);


        }







    }

