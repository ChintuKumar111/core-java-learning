package Basics;

import java.util.Scanner;

public class numberOfDigits {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            char c = 'a','e',

            int count = 0;
           // int n = Math.abs(num);  // handles negative numbers

            if (num == 0) {
                count = 1;  // 0 has 1 digit
            } else {
                while (num > 0) {
                    num = num / 10;
                    count++;
                }
            }

            System.out.println("Number of digits: " + count);
        }
    }

