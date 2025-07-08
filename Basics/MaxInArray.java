package Basics;

import java.util.*;
import java.lang.*;
import java.io.*;
public class MaxInArray {


        public static void main (String args[]) {
            int max = 0;

            int position=0;

            Scanner sc = new Scanner(System.in);

            System.out.println("How many time you want to add ");

            int totalNumber = sc.nextInt();

            int arr [] = new int[totalNumber];

            while(totalNumber>0) {

                System.out.println("Enter your numbers to find max ");

                int input = sc.nextInt();

                arr[position] = input;


                totalNumber--;
                position++;

            }

            for (int i = 0;i<arr.length;i++) {

                if(max<arr[i] ){

                    max=arr[i];

                }

            }

            System.out.println("max is  "+max);


    }
}
