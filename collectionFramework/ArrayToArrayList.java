package collectionFramework;
import java.util.*;
public class ArrayToArrayList {
    public static void main(String[] args) {

        Integer arr [] = {1,2,3,4,5};

        //int arr [] = {1,2,3,4}; is going to give error becouse primitive type data (int);

        ArrayList <Integer> list = new ArrayList<>(Arrays.asList(arr));
//but for String it will use
        System.out.println(list);


        //another method to do this operation

        int array[] = {1,2,3,4,5};

        for(int value:array){
            list.add(value);
        }
        System.out.println(list);
    }
}
