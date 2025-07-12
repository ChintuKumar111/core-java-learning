package Basics;

import java.util.*;
import java.lang.*;
import java.io.*;
public class PrimeNumberPrinting {



        public static void main (String args[]) {

            Scanner sc = new Scanner(System.in);



            System.out.println(" Enter the upper limit to print prime numbers: ");
            int input = sc.nextInt();


            for (int i = 2; i<=input;i++) {

                boolean bn = false;

                for (int j = 2; j<=Math.sqrt(i);j++) {

                    if(i%j==0) {
                        bn = true;
                        break;
                    }
                }
                if(!bn) {
                    System.out.println(i);
                }
            }


//            for(int i = 2; i <=input;i++){
//                int count  = 0;
//
//                for (int j = 1;j<=i;j++){
//
//                    if(i%j==0) {
//                        count++;
//
//                    }
//                }
//                if(count==2){
//                    System.out.println(i);
//                }
//            }

        }
    }
