package Basics;

import java.util.Scanner;

public class FibonaciUsingRecursion {

public static void  main (String [] args) {

            System.out.println("Fibonacci position Enter");
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            int result = Fibo(input);
            System.out.println("Fibonacci position "+input +" = "+ result);



        }


        public static int Fibo(int fiboPosition) {

            int n = fiboPosition;

            if (n == 0) return 0;
            if (n == 1) return 1;

            return Fibo(n-1)+Fibo(n-2);
        }
    }


