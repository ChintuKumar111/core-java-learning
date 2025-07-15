package Basics;

public class PrivateMethod {

        public static void main (String [] args) {

            xrr x = new xrr();
            x.disp();
            x.fd();

        }

    }

      class Samsung {

        private  void md() {
            System.out.println("private method is calling");
        }

        void fd() {
            md();
        }


    }

     class xrr extends Samsung {

        void disp() {System.out.println("inherited  class ");}

    }

