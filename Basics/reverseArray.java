package Basics;

import java.util.*;
import java.lang.*;
import java.io.*;
public class reverseArray {











        public static void main (String args[]) {

            int position=0;

            Scanner sc = new Scanner(System.in);

            System.out.println("How many time you want to add ");

            int totalNumber = sc.nextInt();

            int value = 0;


            int arr [] = new int[totalNumber];

            while(totalNumber>0) {



                int input = sc.nextInt();

                arr[position] = input;


                totalNumber--;
                position++;

            }
            System.out.print("reversed array: " +" ");
            for(int i = arr.length-1;i>=0;i--) {

                System.out.print(arr[i]+" ");


            }








    }
}
