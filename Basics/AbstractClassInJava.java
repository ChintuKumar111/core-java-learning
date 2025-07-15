package Basics;



class AbstractClassInJava {
    public static void main (String args[]){

        newCircle newCircle = new newCircle(23);
        newCircle.area(2,1);

        newCircle.display();
        Rectangle rectangle1 = new Rectangle(4);

        rectangle1.area(4,5);


    }
}



abstract class ShapeIss {

    int number ;

    ShapeIss(int number ){ this.number = number;
        System.out.println("Printing the absract constructor using abstarct class"+number);}

    abstract void area(int radius,int height);

    void display() {
        System.out.println("Showing the Dispaly");
    }

}

class newCircle extends ShapeIss {
    int num ;

    newCircle(int num){
        super(num);
        this.num = num;
    }



    void area(int radius,int height) {


        double result = Math.PI*radius*radius;
        System.out.println("The arae of circle is  : "+result);


    }


}

class Rectangle extends ShapeIss {
    int num;

    Rectangle(int num){super(num);
        this.num = num;}

    void area(int base, int height) {
        int result = (base *height)/2;
        System.out.println("The arae of Rectangle is  : "+result);
    }
}