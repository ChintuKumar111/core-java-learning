package Basics;

public class ArrayElementsAddByRow {

        public static void main (String args[]) {

            int x = 0;

            int [][]a = {{1,2,3},
                    {4,5,6}};

            System.out.println("Additon by row in 2d array");

            for (int i =0;i<a.length;i++) {
                int sum = 0;

                for(int j = 0;j<a[i].length;j++) {



                    sum = sum+a[i][j];

                }
                System.out.println(i+1+"row sum is : "+sum);

            }
        }
        
    }








