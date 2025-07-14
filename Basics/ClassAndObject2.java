package Basics;

public class ClassAndObject2 {


        public static class Person{

            String name ;
            int age ;

            void Disp() {
                System.out.println(name +" "+age +" hello ");
            }
        }
        public static void main (String [] args) {

       Person p = new Person();
            p.age=10;
            p.name = "A";
            p.Disp();


        Person p2 = new Person();
        p2.age=20;
        p2.name = "b";
            p2.Disp();
    }
    }


