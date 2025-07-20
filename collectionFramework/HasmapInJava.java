package collectionFramework;

import java.util.*;

public class HasmapInJava {
    public static void main(String args[]){


        HashMap<Integer,String> map = new HashMap<>();

        map.put(11,"Tony stark");
        map.put(12,"mark 12");
        map.put(13,"marrk 41");
        map.put(14,"mark 45");
        map.put(15,"MARK 23");

        System.out.println("elements in map which are exits " +map
        );


        map.get(14);
        System.out.println(map.get(12)
        );


    }
}
