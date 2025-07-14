package Basics;

public class NoStaticMethodCall {



        public static void main (String [] args) {

            NoStaticMethodCall n = new NoStaticMethodCall();
            n.Add();


        }

        public  void Add()
        {
            System.out.println("Printing Addition for the queries");
        }


}
