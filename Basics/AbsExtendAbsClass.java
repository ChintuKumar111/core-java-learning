package Basics;

public class AbsExtendAbsClass {

        public static void main (String [] args) {


            Laptop laptop = new Laptop();
            laptop.PowerOn();

            laptop.RunOS();


        }

    }

    abstract class Machine{

        abstract void PowerOn() ;




    }

    abstract class Computer extends Machine{

        abstract void RunOS();


    }

    class Laptop extends Computer{

        void RunOS() {

            System.out.println("Running operating sysytem in laptop: ");
        }
        void PowerOn() {
            System.out.println("Powering ON of the laptop");
        }


    }

