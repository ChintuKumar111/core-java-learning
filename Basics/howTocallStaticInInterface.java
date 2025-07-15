package Basics;

public class howTocallStaticInInterface {        public static void main(String[] args) {
            CheckIdd id = new CheckIdd();
            id.methodName();
            Basics.UserId.Blockk();

        }
    }

    interface UserIdd{
        int tokens = 123;

        static void Blockk(){
            System.out.println("Static block called  from interface");
        }

        public abstract  void methodName();

    }

    class CheckIdd implements UserIdd {
        static {
            System.out.println("this is the static block ");
        }

        public void methodName(){
            System.out.println(Basics.UserId.tokens);
        }
    }

