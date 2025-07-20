package collectionFramework;

public class ThreadInJava {
    public static void main(String[] args) {


        MyThread1 t1 = new MyThread1();
        Thread t2 = new Thread(t1);
        t2.start();
        MyThread th = new MyThread();
        th.start();

        for(int i = 1;i<1000;i++){

            System.out.println("main" + "  "+i);
        }
    }
}

class MyThread extends Thread{


    public void run(){
        int number = 1000;
        while (number >0){

            System.out.println("MARK 42");
            number--;
        }

    }
}

class MyThread1 implements Runnable{

    public void run(){
        for(int i = 1;i<1000;i++){

            System.out.println("Runnable method running");

        }

    }
}