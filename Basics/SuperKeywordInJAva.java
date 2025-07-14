package Basics;

public class SuperKeywordInJAva {
        public static void main (String [] args) {


            Scross creta = new Scross();

            creta.disp();

        }

    }

    class Carss {

        String brand , model;
        int speed;



        Carss(){System.out.println("fisrt calling");}
        Carss(String brand, String model, int speed){
            this.brand = brand;
            this.model = model;
            this.speed = speed;

            System.out.println("brand is  "+brand +" \n model is "+model+" \n speed is "+speed);

        }

    }

    class Scross extends Carss {


        Scross(){


            super("mm","M#0 -d",15);
            System.out.println("creta is running constructor");
        }
        void disp() {

            System.out.println("creta is running");
        }

    }



