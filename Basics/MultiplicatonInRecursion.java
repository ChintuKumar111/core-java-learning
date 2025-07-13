package Basics;

import java.util.Scanner;

public class MultiplicatonInRecursion {

    public static int Multiply(int number , int iteration){

        if(iteration==11){

            System.out.println("Program Complete");
            return 1;
        }

        System.out.println(number +" X " +iteration +" = " +number*iteration );

        return Multiply(number,iteration+1);

    }
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int ite = 1;
        int input = s.nextInt();
        Multiply(input,ite);


    }
}
