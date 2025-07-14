package Basics;

public class LearningConDeep {



        public static void main(String[] args) {
            Student s1 = new Student("Rahul");
            Student s2 = new Student("Anjali", 18);
            Student s3 = new Student("Aman", 20, "A");
        }
    }
    class Student {


        String name;
        int age;
        String grade;

        // Constructor 1 - only name

        Student(String name){this.name = name;}

        // Constructor 2 - name and age
        Student(String name,int age){this.name = name; this.age= age;}

        // Constructor 3 - name, age, grade
        Student(String name,int age,String grade){this.name = name; this.age= age; this.grade = grade;}
    }




