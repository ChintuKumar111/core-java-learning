package collectionFramework;
import java.util.*;

public class SortingElementsInARRAYLIST {

        public static void main (String args[]){


            Scanner sc = new Scanner (System.in);

            System.out.println("Enter the number you wants to add INTEGER TYPE");

            int input = sc.nextInt();

            ArrayList<Integer> list = new ArrayList<>();


            for (int i=0;i<=input;i++) {



                list.add(sc.nextInt());


            }

            System.out.print("Entered number are  "+list +"\t");

            list.sort(Comparator.reverseOrder());

            System.out.println
                    ("In decreasing order");

            System.out.println(list);


    }
}
