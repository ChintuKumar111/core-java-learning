package Basics;

public class LearningConstructor {
        public static void main(String[] args) {
            Car lambo = new Car("BMW", "520-d", 170);  // Object creation
        }
    }

    class Car {
        String brand, model;
        int speed;

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


