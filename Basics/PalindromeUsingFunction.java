package Basics;

	import java.util.*;

public class PalindromeUsingFunction {

        public static int Occur(int userInput){

            int check = 0;
            int Pallindrome=0;

            while(userInput>0) {

                Pallindrome = userInput;

                check = userInput%10;

                System.out.print(check);

                userInput/=10;
            }
            if(Pallindrome == check) {
                System.out.println("  Number is pallindrome ");
            }else {

                System.out.println("  Number is not  palindrome");
            }
            return check;
        }
        public static void main(String [] args) {


            Scanner sc = new Scanner(System.in);

            System.out.println("Enter your number for question");

            int userInput = sc.nextInt();
            Occur(userInput);
        }
    }


