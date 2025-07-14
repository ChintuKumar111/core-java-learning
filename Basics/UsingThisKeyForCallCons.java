package Basics;

import java.sql.SQLOutput;

public class UsingThisKeyForCallCons {
    public static void main(String[] args) {
        UseKeyWord useKeyWord = new UseKeyWord();
        UseKeyWord use = new UseKeyWord("lambo",1200);

    }
}

class UseKeyWord{
    String name ;
    int age;
    UseKeyWord(){
        this("star",12);
        System.out.println("Printing the default constructoe");
    }

    UseKeyWord(String name ,int age ){
        this.name =name ;
        this.age= age;

        System.out.println("Name is : "+name +"\n Age is : "+age);
    }
}