package collectionFramework;

import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        String arr[] = new String[list.size()];

       for(int i =0;i<list.size();i++){

           arr[i]= list.get(i);


       }
       for(String ar :arr){
           System.out.println(ar);
       }
    }
}
