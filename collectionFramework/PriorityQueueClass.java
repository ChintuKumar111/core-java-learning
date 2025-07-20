package collectionFramework;

import java.util.PriorityQueue;
import java.util.*;
public class PriorityQueueClass {
    public static void main(String[] args) {


        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();
        pq.add(5);
        pq.add(3);
        pq.add(6);
        pq.add(32);
        pq.add(33);



pq.poll();

//it always goes for the largest value and if(true)
// then print the number for increasing its print proper but for decrease not  aspected
// after next index

//always provide min heap in increase order
        System.out.println(pq
        );
        System.out.println(pq.peek());

    }

}