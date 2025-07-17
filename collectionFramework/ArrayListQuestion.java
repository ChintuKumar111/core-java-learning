package collectionFramework;

import java.util.ArrayList;

public class ArrayListQuestion {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(5);

        System.out.println("Original inputs  "+list);

        ArrayList<Integer> newList = new ArrayList<>();

        for (int num :list){

            if(!newList.contains(num)){

                newList.add(num);
            }


       }
        System.out.println(newList);
    }
}