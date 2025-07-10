package Basics;


import java.util.*;
import java.lang.*;
import java.io.*;


public class UpperLowerCase {


        public static void main (String args[]) {


            // Approach first

            Scanner sc = new Scanner(System.in);

            String str = sc.nextLine();


            String lowerCase = str.toLowerCase();

            String upperCase = str.toUpperCase();

            System.out.println(lowerCase);

            System.out.println(upperCase);


        }

    }

