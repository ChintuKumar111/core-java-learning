package collectionFramework;
import java .util.*;
public class GettingElementOnHAshMAp {
    public static void  main(String args[])
    {


        System.out.println("Using hashmap in java ");

        HashMap<Integer,String> map = new HashMap<>();

        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");
        map.put(4,"four");
        map.put(5,"five");
        map.put(6,"six");

        System.out.println(map);

        System.out.println(map.get(2));

        map.clone();
        System.out.println(map);



        map.remove(4);
        System.out.println(map);

        for(int key : map.keySet()){
            System.out.println(key);
            System.out.println("key  " +key +"value  "+map.get(key));
        }
        for(Map.Entry<Integer ,String> e : map.entrySet()){
            System.out.println(e);
        }

    }

}
