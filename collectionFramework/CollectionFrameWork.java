package collectionFramework;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionFrameWork {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter your numbers");
        ArrayList<Integer> list = new ArrayList<>();

        int count = 1;

        while (count<6){
            int userInput = sc.nextInt();
            list.add(userInput);
            count++;

        }

        System.out.println(list);




    }
}
