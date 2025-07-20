package Basics;
import java .util.*;
public class CharOccurenceTimesNew {
        public static void main(String[] args) {
            // TODO Auto-generated method stub


            System.out.println("Enter your word to check how many times occur one word in ");


            Scanner sc = new Scanner(System.in);

            String input = sc.nextLine();


            for(int i = 0 ;i<input.length();i++) {


                int count = 0;
                char ch = input.charAt(i);


                boolean alVisit = false;

                for (int k =0;k<i;k++) {

                    if(ch==input.charAt(k)) {
                        alVisit = true;
                        break;

                    }
                }

                if(alVisit) {
                    continue;
                }

                for(int j = 0 ;j<input.length();j++) {

                    if(ch==input.charAt(j)) {

                        count++;


                    }
                }

                System.out.println( "'"+ch +"'  occur " + count +"  times");
            }

        }

    }


