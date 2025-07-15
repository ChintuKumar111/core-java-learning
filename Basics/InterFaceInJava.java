package Basics;

public class InterFaceInJava {
        public static void main (String args[]){

            Student1 s = new Student1();

            s.disp();
            College.disp();


        }
    }


    interface College{

        static void disp() {System.out.println("gdehg");}

    }

    class Student1 implements College{

        public void disp(){

            System.out.println("Displaying the details of students");}

    }

