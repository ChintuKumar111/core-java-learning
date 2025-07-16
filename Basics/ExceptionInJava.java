package Basics;

public class ExceptionInJava {
        public static void main (String args[]){


            int number = 10 ;
            int divideBy = 0;
            int arr []  = new int [5];

            try {
                int result = number/divideBy;

                System.out.println("result is :"+result);

                ExceptionInJava.ArrQuestion(arr);


            }catch(Exception e ) {
                System.out.println(e.getMessage());
            }


        }

        public static int  ArrQuestion(int a[])
        {
            System.out.println("Arr counting");
            return a[8];


        }
    }


