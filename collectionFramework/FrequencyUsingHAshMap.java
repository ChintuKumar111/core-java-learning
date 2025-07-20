package collectionFramework;

import java.util.HashMap;
import java.util.Scanner;

public class FrequencyUsingHAshMap {
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Calculation the frequency of string");
        System.out.println("Enter your word  ");
        String word = sc.nextLine();

        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch : word.toCharArray()){
            if(map.containsKey(ch)){

                map.put(ch,map.get(ch)+1);
            }else {
                map.put(ch,1);
            }
        }
        System.out.println(map);

    }
}
