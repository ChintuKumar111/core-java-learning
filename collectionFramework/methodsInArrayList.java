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
        // add(index, element)
        fruits.add(1, "Orange");  // Insert at index 1

        // Display the list
        System.out.println("After adding: " + fruits); // [Apple, Orange, Banana, Mango]

        // get(index)
        System.out.println("Element at index 2: " + fruits.get(2)); // Banana

        // set(index, element)
        fruits.set(2, "Grapes");
        System.out.println("After set(): " + fruits); // [Apple, Orange, Grapes, Mango]

        // remove(index)
        fruits.remove(3);
        System.out.println("After removing index 3: " + fruits); // [Apple, Orange, Grapes]

        // size()
        System.out.println("Size of list: " + fruits.size()); // 3

        // contains(element)
        System.out.println("Contains 'Apple'? " + fruits.contains("Apple")); // true
        System.out.println("Contains 'Mango'? " + fruits.contains("Mango")); // false

        // isEmpty()
        System.out.println("Is list empty? " + fruits.isEmpty()); // false

        // clear()
        fruits.clear();
        System.out.println("After clear(): " + fruits); // []

        // isEmpty() again
        System.out.println("Is list empty now? " + fruits.isEmpty()); // true
            }
        }

