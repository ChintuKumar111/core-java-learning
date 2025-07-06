package Basics;




import java.util.*;
import java.lang.*;
import java.io.*;

public class FirstProgram {




        public static void main(String[] args) throws java.lang.Exception {
            // your code goes here


            Scanner sc = new Scanner(System.in);

            System.out.println("Enter your Number to check to even and odd ");
            int value = sc.nextInt();

            if (value % 2 == 0) {


                System.out.println("Number is even " + value);


            } else {
                System.out.println("Number is Odd :" + value);
            }



    }
}