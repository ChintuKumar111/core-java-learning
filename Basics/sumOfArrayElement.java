package Basics;
import java.util.*;
import java.lang.*;
import java.io.*;

public class sumOfArrayElement {


        public static void main (String args[]) {

            int position=0;
            int sum = 0;

            Scanner sc = new Scanner(System.in);

            System.out.println("How many time you want to add ");

            int totalNumber = sc.nextInt();


            int arr [] = new int[totalNumber];

            while(totalNumber>0) {



                int input = sc.nextInt();

                arr[position] = input;


                totalNumber--;
                position++;

            }


            for (int i = 0; i<arr.length;i++) {

                sum +=arr[i];

            }
            System.out.println("sum is :"+sum);


        }
    }








