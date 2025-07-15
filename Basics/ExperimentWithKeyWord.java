package Basics;

public class ExperimentWithKeyWord {
    public static void main(String[] args) {

        Square shape = new Square(23);
        shape.Are(22);

    }
}

 class ShapeIs {
    int n ;
    ShapeIs(int n ){
        this.n = n;
        System.out.println("Constructing the first constructor from shape  23 "+n);
    }
    void Are(int n){
        this.n = n;

        System.out.println("printing the value from class first 22  "+n);



    }
}

 class Square extends ShapeIs {
    int n ;

    Square(int n ){
        super(n);
        this.n= n;

        System.out.println("printing the value from constructor Second class  "+n);

    }
    void Are(int n){
        super.Are(n);
        this.n=n;
        System.out.println("printing the value from method :"+n);

    }


}