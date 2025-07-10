package Basics;
import java.util.*;
import java.lang.*;
import java.io.*;


public class rotateTheNumber{









    public static void main (String args[]) {


        int count = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input you want it to rotate");

        int input = sc.nextInt();

        int newInput = input;

        System.out.println("how many digits ?");

        int times = sc.nextInt();
        int ans=0;

        while (input>0) {

            input = input/10;
            count++;




            if (times == 0) {
                System.out.println("Ans is: " + input);
                return;
            }}
        System.out.println("Total digits  "+ count);

        times = times % count;

        int LastDigit = newInput %(int)Math.pow(10,times);

        int remainingDigits = newInput/(int)Math.pow(10, times);

        int rotateAns = LastDigit*(int)Math.pow(10,count-times)+remainingDigits;



        System.out.println("Ans is :"+rotateAns);



    }




}



