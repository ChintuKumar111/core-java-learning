package Basics;


import java.util.*;
import java.lang.*;

public class leapyear {

    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Year to check leap or not ");
        int year = sc.nextInt();

        if(year%400==0 || year%4==0 && year%100 != 0) {


            System.out.println("It is leap year:: "+ year);


        }else {
            System.out.println("not leap year :"+ year);
        }


    }
}
