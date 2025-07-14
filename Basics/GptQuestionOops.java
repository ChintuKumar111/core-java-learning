package Basics;

public class GptQuestionOops {

        public static void main (String [] args) {

            Manager mn = new Manager();
            mn.showDetails("Rahul",85000);
            mn.show("IT");


        }

    }


    class Employe{

        String name ;
        int salary;

        void showDetails(String name ,int salary)
        {

            this.name = name;
            this.salary= salary;

            System.out.println("Name " +name + "\nSalary : "+salary);
        }
    }
    class Manager extends Employe{


        String Department;

        void showDetails(String name ,int salary) {

            super.showDetails(name, salary);



        }


        void 	show(String Department){

            this.Department = Department;

            System.out.println("Department  "+Department);
        }



    }


