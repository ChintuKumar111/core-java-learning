package collectionFramework;

import java.util.HashSet;

public class HashsetLearning {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        set.add(2);
        set.add(5);
        set.add(8);

        System.out.println(set);


        for(int i = 1; i< set.size();i++){

            if(set.contains(i)){

                System.out.println("element exist ");

            }else{
                System.out.println("no value found");
            }

        }

    }
}
