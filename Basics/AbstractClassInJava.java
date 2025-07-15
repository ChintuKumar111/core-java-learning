package Basics;




    abstract class Shape {
        abstract void area();

        void display() {
            System.out.println("Displaying Shape info...");
        }
    }

    class Circle extends Shape {
        int radius;

        Circle(int radius) {
            this.radius = radius;
        }

        void area() {
            double result = Math.PI * radius * radius;
            System.out.println("Area of Circle: " + result);
        }
    }

    class Rectangle extends Shape {
        int base, height;

        Rectangle(int base, int height) {
            this.base = base;
            this.height = height;
        }

        void area() {
            int result = base * height;
            System.out.println("Area of Rectangle: " + result);
        }
    }

public class AbstractClassInJava {
        public static void main(String[] args) {
            Shape c1 = new Circle(5);
            c1.area();
            c1.display();

            Shape r1 = new Rectangle(5, 10);
            r1.area();
            r1.display();
        }
    }


