package Basics;

public class AbsExtendAbsClass {

        public static void main (String [] args) {

            Rtx laptop = new Rtx();
            laptop.PowerOn();

            laptop.RunOS();
        }
    }

    abstract class Machine{

        abstract void PowerOn() ;

    }

    abstract class Computer extends ExMachine {

        abstract void RunOS();
    }

    class Laptop extends ComputerExpert {

        void RunOS() {

            System.out.println("Running operating system in laptop: ");
        }
        void PowerOn() {
            System.out.println("Powering ON of the laptop");
        }

    }

