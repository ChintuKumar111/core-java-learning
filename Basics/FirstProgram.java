package Basics;




import java.util.*;
import java.lang.*;
import java.io.*;

public class FirstProgram {

    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here

        System.out.println("cz star is here ");


        Scanner sc = new Scanner(System.in);

        System.out.println("enter  the first number");

        int firstNumber = sc.nextInt();

        System.out.println("Enter Second Number ");
        int secondNumber = sc.nextInt();

        System.out.println("Enter the third number ");
        int thirdNumber = sc.nextInt();

        if(firstNumber>secondNumber && firstNumber>thirdNumber){
            System.out.println("largest number is : "+ firstNumber);
        }else if (secondNumber>firstNumber && secondNumber>thirdNumber){
            System.out.println("Largets number is :"+ secondNumber);
        }else if(firstNumber == secondNumber && secondNumber== thirdNumber) {
            System.out.println("all  number is equal :"+ thirdNumber);
        }
        else {
            System.out.println("Largest number is :"+ thirdNumber);

        }

    }
}
