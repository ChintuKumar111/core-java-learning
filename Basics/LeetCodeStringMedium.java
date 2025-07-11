package Basics;


	import java.util.*;
	import java.lang.*;
	import java.io.*;

public class LeetCodeStringMedium {


        public static void main (String args[]) {


            // Approach first

            Scanner sc = new Scanner(System.in);

            String str = sc.nextLine();


            char start = str.charAt(0);
            String sum = "";

            int count = 1;

            for ( int i = 1;i<str.length();i++) {

                char current = str.charAt(i);

                if(current == start) {
                    count++;

                }else {
                    if(count>1) {

                        sum +=start+""+count;

                        start = current ;
                        count =1;

                    }else {

                        sum+=start+"";
                        start=current;
                    }



                }

            }

            if(count>1) {

                sum +=start+""+count;}
            else {

                sum+=start+"";

            }

            System.out.println(sum);

        }

    }

//input aabcc
//output  a2bc2
