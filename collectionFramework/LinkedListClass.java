package collectionFramework;

import java.util.LinkedList;

public class LinkedListClass {
    public static void main (String args[]){

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.offer(1);
        linkedList.offer(2);
        linkedList.offer(3);
        linkedList.offer(4);
        System.out.println(linkedList);

        linkedList.poll();
        System.out.println(linkedList);

        System.out.println(linkedList.peek());
    }

}
