package Basics;

import java.util.Scanner;

public class LearningRecursion {
        public static void main (String [] args) {

            Scanner sc =new Scanner(System.in);

            int inner = sc.nextInt();


            int res = fact(inner);

            System.out.println(res);
        }
        public static int  fact(int n) {
            if(n==0) {
                return 1 ;
            }
            return fact(n-1);

        }
    }

