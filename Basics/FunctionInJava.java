package Basics;
	import java.util.*;
	import java.lang.*;
	import java.io.*;

        public class FunctionInJava {

            public static int Multiplication(int x) {

                ;
                int result = 1;

                for (int i = 1; i <= 10; i++) {

                    result = i * x;
                    System.out.println(i + " X " + x + " =" + result);
                }

                return result;


            }

            public static void main(String args[]) {


                // Approach first

                Scanner sc = new Scanner(System.in);

                System.out.print("Enter a number to print its multiplication table: ");
                int number = sc.nextInt();

                System.out.println("Multpilication of " + number);


                Multiplication(number);


                // Learning.Multiplication(number); we can also use this line in ;
            }
        }