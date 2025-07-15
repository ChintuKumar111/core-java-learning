package Basics;

public class JavaInterFaceNewMethods {
    public static void main(String[] args) {
        CheckId id = new CheckId();
        id.methodName();
        UserId.Blockk();

    }
}

interface UserId{
    int tokens = 123;

    static void Blockk(){
        System.out.println("Static block called ");
    }

    public abstract  void methodName();

}

class CheckId implements UserId{

    public void methodName(){
        System.out.println(UserId.tokens);
    }
}