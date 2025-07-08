package Basics;

import java.util.Scanner;

public class SecondMaxInArray {


        public static void main (String args[]) {

            int firstMax = Integer.MIN_VALUE;
            int secondMax = Integer.MIN_VALUE;


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



                if(firstMax<arr[i] ){

                    firstMax=arr[i];

                }



            }
            for (int i = 0;i<arr.length;i++) {


                if (arr[i] != firstMax && arr[i] > secondMax) {
                    secondMax = arr[i];
                }

            }


            System.out.println("first max is  "+firstMax);
            System.out.println("second max is  "+secondMax);


        }
    }


