package Basics;

public class classAndObject {

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


            }

        }

