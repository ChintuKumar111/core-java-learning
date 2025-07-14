package Basics;

public class SuperKeyWordConstructor {

        public static void main (String [] args) {


            Creta creta = new Creta("creta sx+" , "2020",150);

            creta.disp();

        }

    }

    class newCar {

        String brand , model;
        int speed;



        newCar(){System.out.println("fisrt calling");}
        newCar(String brand, String model, int speed){
            this.brand = brand;
            this.model = model;
            this.speed = speed;

            System.out.println("brand is  "+brand +" \n model is "+model+" \n speed is "+speed);

        }

    }

    class Creta extends newCar {

        String c , y;
        int z;



        Creta(String c ,String y,int z){
            super( c,y,z);

            this.c= c;
            this.y= y;
            this.z= z;

            System.out.println("creta is running constructor ");
            System.out.println("creta is running constructor "+c +" "+ z +    " " + y);

        }
        void disp() {

            System.out.println("creta is running");
        }

    }



