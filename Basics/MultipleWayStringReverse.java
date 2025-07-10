package Basics;

import java.util.*;
import java.lang.*;
import java.io.*;
public class MultipleWayStringReverse {


        public static void main (String args[]) {


            // Approach first

            Scanner sc = new Scanner(System.in);

            String str = sc.nextLine();

            StringBuilder sb = new StringBuilder(str);


            String ans = sb.reverse().toString();

            System.out.println(ans);

//Approach second

            StringBuilder sc1 = new StringBuilder(String.valueOf(str)).reverse();

            System.out.println(sc1);


            // Approach Third

            for (int i = str.length()-1; i>=0;i--) {


                char ch = str.charAt(i);

                System.out.print(ch);


            }



        }


    }


