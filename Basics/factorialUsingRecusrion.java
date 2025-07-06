package Basics;

public class factorialUsingRecusrion {


        public static void main (String[] args) throws java.lang.Exception
        {
            // your code goes here
            factorialUsingRecusrion l1 = new factorialUsingRecusrion();
            int res= 	l1.Rec(5);
            System.out.println(res);

        }


        public int Rec(int n ) {

            if (n==0 ||n==1) {

                return 1;
            }

            return n*Rec(n-1);
        }


}
