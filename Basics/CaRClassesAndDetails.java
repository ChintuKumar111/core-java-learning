package Basics;

public class CaRClassesAndDetails {
    public static void main (String [] args) {

            Car bmw = new Car();
            Car merce = new Car();
            Car lambo = new Car();

            bmw.brand= "Brawen Motors WorkShop";
            bmw.color = "Matt black";
            bmw.speed = 140;

            bmw.Details();

        }


    }

      class Car{
        String brand,color;
        int speed;

        void Details() {

            System.out.println("This is the brand :"+ brand +" ");
            System.out.println("This is the Color :"+ color +" ");
            System.out.println("This is the speed :"+ speed +" ");
        }
    }

