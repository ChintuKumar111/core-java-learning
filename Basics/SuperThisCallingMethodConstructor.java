package Basics;

public class SuperThisCallingMethodConstructor {

        public static void main (String [] args) {


            real d = new real();
            d.pdf();
        }
    }

    class Demo {

        Demo()
        {System.out.println("DEmo constructor");}
        void print() {

            this.Nprint();
            System.out.println("1st");

        }

        void Nprint() {

            System.out.println("2nd");
        }

    }

    class real extends Demo {

        real ()
        {

            super();
            System.out.println("real constructor is calling");}

        void pdf()
        {
            super.print();

            System.out.println("pdf is calling");


        }


}
