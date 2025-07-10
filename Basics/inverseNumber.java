package Basics;
import java.util.*;
public class inverseNumber {



        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number: ");
            int num = sc.nextInt();

            int position = 1;
            int inverse = 0;

            while (num != 0) {
                int digit = num % 10;
                inverse += position * (int) Math.pow(10, digit - 1);
                num /= 10;
                position++;
            }

            System.out.println("Inverse number: " + inverse);
        }


}
