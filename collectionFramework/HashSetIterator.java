package collectionFramework;

import javax.swing.text.html.HTMLDocument;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetIterator {

    public static void main(String[] args) {

        System.out.println("hash set iterator using ");

        HashSet<Integer> set = new  HashSet<>();

        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);

        System.out.println(set);
  Iterator it = set.iterator();

  while(it.hasNext()){
      System.out.println(it.next());
  }
    }
}
