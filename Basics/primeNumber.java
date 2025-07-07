package Basics;

import java.util.Scanner;

public class primeNumber {


        public static void main (String args[]) {

            Scanner sc = new Scanner(System.in);

            boolean bn = false;

            System.out.println(" Enter Your number to check even and odd");
            int input = sc.nextInt();


            for (int i = 2; i<=input/2;i++) {

                if(input==1|| input==2) {
                    System.out.println("Number is prime");
                }

                if(input%i==0) {
                    bn = true;
                    break;

                }
            }

            if(bn) {
                System.out.println("Not a prime number");
            }else {

                System.out.println("Number is prime");
            }
        }

}
