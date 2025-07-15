package Basics;

public class CanAbsHaveStaticFinalMethod {

        public static void main (String [] args) {


            Rtx laptop = new Rtx();
            laptop.PowerOn();

            laptop.RunOS();

            laptop.FMethod();
            Rtx.Experiment();


        }

    }

      abstract class ExMachine {

        abstract  void PowerOn() ;

        public static void Experiment()
        {
            System.out.println("Experiment is printing which is static method");
        }
        final void FMethod() {
            System.out.println("Fmethod is calling");
        }



    }

    abstract class ComputerExpert extends ExMachine {

        abstract void RunOS();




    }

    class Rtx extends ComputerExpert {

        void RunOS() {

            System.out.println("Running operating sysytem in laptop: ");
        }
        void PowerOn() {
            System.out.println("Powering ON of the laptop");
        }



    }

