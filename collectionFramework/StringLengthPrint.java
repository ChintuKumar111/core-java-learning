package collectionFramework;
import java.util.*;
public class StringLengthPrint {

        public static void main (String args[]){



            Scanner sc = new Scanner (System.in);

            System.out.println("Enter the number you wants to add INTEGER TYPE");

            int input = sc.nextInt();


            sc.nextLine();
            ArrayList<String> list = new ArrayList<>();


            for (int i=0;i<=input;i++) {

                list.add(sc.nextLine());


            }
            System.out.println("Your String Inputs are :");
            System.out.println(list);

            for(int i = list.size()-1;i>=0;i--) {


                if(list.get(i).length()<5) {

                    list.remove(i);
                }
            }

            System.out.println("The string input which have longer length than 5 are :");
            System.out.println(list);



        }



    }

