package Basics;

public class AbcstarctSecondExample {

        public static void main (String [] args) {

            newCircle c1 = new newCircle(20);

            c1.area(5, 0);

            Rectangle1 r1 = new Rectangle1(30);
            r1.area(5,10);


        }

    }

    abstract class Shapess {

        int number ;

        Shapess(int number ){ this.number = number;
            System.out.println("Printing the absract constructor using abstarct class"+number);}

        abstract void area(int radius,int height);

        void display() {
            System.out.println("Showing the Dispaly");
        }

    }

    class Circle extends Shapess {
        int num ;

        Circle(int num){
            super(num);
            this.num = num;
        }



        void area(int radius,int height) {


            double result = Math.PI*radius*radius;
            System.out.println("The arae of circle is  : "+result);


        }


    }

    class Rectangle1 extends Shapess {
        int num;

        Rectangle1(int num){super(num);
            this.num = num;}

        void area(int base, int height) {
            int result = (base *height)/2;
            System.out.println("The arae of Rectangle is  : "+result);
        }
    }

