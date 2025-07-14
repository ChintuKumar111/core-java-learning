package Basics;

public class LearningConstructor {
        public static void main(String[] args) {
            Carss bmw = new Carss();
            Carss lambo = new Carss("BMW", "520-d", 170);  // Object creation
        }
    }

    class Car {
        String brand, model;
        int speed;

        Car() {
            this.brand = "Default Brand";
            this.model = "Default Model";
            this.speed = 0;

            System.out.println("Brand is  : " + brand);
            System.out.println("Model is  : " + model);
            System.out.println("Speed is  : " + speed + " km/h");
        }


        // Constructor with 3 parameters
        Car(String brand, String model, int speed) {
            this.brand = brand;
            this.model = model;
            this.speed = speed;

            // Print details
            System.out.println("Brand is  : " + brand);
            System.out.println("Model is  : " + model);
            System.out.println("Speed is  : " + speed + " km/h");
        }
    }


