package Basics;

import java.util.Scanner;

public class sumOfAllElementsOfArray {

        public static void main (String args[]) {
            int sum = 0;

            int position=0;

            Scanner sc = new Scanner(System.in);

            System.out.println("How many time you want to add ");

            int totalNumber = sc.nextInt();

            int arr [] = new int[totalNumber];

            while(totalNumber>0) {

                System.out.println("Enter your number");

                int input = sc.nextInt();

                arr[position] = input;

                sum +=arr[position];

                position++;
                totalNumber--;
            }

            System.out.println("sum is  : "+sum);



    }
}
