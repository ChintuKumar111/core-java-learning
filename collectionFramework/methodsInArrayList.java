package collectionFramework;
import java.util.*;
import java.util.ArrayList;

public class methodsInArrayList {
    public static void  main(String args[]) {

                ArrayList<String> fruits = new ArrayList<>();

                fruits.add("Apple");
                fruits.add("Banana");
                fruits.add("Mango");

                System.out.println("Fruits: " + fruits);
                System.out.println("First Fruit: " + fruits.get(0));

                fruits.set(1, "Orange");
                fruits.remove("Mango");

                System.out.println("Updated List: " + fruits);
                System.out.println("Size: " + fruits.size());
            }
        }

