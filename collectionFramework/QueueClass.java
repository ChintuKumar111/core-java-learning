package collectionFramework;

import java.util.LinkedList;
import java.util.Queue;

public class QueueClass {
    public static void main(String args[])
    {
        Queue<Integer> queue = new LinkedList<>();
        //for add
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);

        //for getting the elements

        System.out.println(queue);
        System.out.println(queue.peek());

        System.out.println(  queue.poll());


    }

}
