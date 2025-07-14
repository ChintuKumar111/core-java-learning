package Basics;

public class CaRClassesAndDetails {
    public static void main (String [] args) {

            Car1 bmw = new Car1();
            Car1 merce = new Car1();
            Car1 lambo = new Car1();

            bmw.brand= "Brawen Motors WorkShop";
            bmw.color = "Matt black";
            bmw.speed = 140;

            bmw.Details();

        }


    }

      class Car1{
        String brand,color;
        int speed;

        void Details() {

            System.out.println("This is the brand :"+ brand +" ");
            System.out.println("This is the Color :"+ color +" ");
            System.out.println("This is the speed :"+ speed +" ");
        }
    }

