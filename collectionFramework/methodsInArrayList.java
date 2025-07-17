package collectionFramework;
import java.util.*;
import java.util.ArrayList;

public class methodsInArrayList {
    public static void  main(String args[]) {

                ArrayList<String> fruits = new ArrayList<>();

                fruits.add("Apple");
                fruits.add("Banana");
                fruits.add("Mango");

                fruits.remove("Mango");

                fruits.add("mango");

                fruits.add(0,"Mango");

                fruits.set(3,"Grapes");
        System.out.println(fruits);



        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);

        list.remove(5);
        System.out.println(list);

        System.out.println(list.contains(2));
        System.out.println(list);
        System.out.println(list.size());

        System.out.println(list.isEmpty());
        System.out.println(list.clone());
        System.out.println(list.getLast());
        System.out.println(list.get(3));
            }
        }

