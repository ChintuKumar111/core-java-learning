package Basics;

import java.util.*;
import java.lang.*;
import java.io.*;

public class evenOddArray {

        public static void main (String args[]) {
            int max = 0;

            int position=0;

            Scanner sc = new Scanner(System.in);

            System.out.println("How many time you want to check ");

            int totalNumber = sc.nextInt();
            int count = 0;
            int oddCount = 0;
            int value = 0;
            int oddValue=0;

            int arr [] = new int[totalNumber];

            while(totalNumber>0) {

                System.out.println("Enter your numbers to find odd even ");

                int input = sc.nextInt();

                arr[position] = input;


                totalNumber--;
                position++;

            }

            System.out.print("even numer is ");

            for (int i = 0;i<arr.length;i++) {

                if(arr[i]%2==0 ){

                    System.out.print(+arr[i]+" ");

                    count++;

                }
            }

            System.out.println( );

            System.out.print("odd numer is");
            for (int i = 0;i<arr.length;i++) {

                if(arr[i]%2!=0 ){

                    System.out.print(arr[i]+" ");

                    oddCount++;
                }



            }


            System.out.println( );
            System.out.println(" total even numer is  "+count);
            System.out.println(" total odd numer is  "+oddCount);



        }
    }

