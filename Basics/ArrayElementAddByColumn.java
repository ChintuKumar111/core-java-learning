package Basics;

public class ArrayElementAddByColumn {

    public static void main(String[] args) {

        int arr [][]= {{1,2,3}
        ,{4,5,6}};


        for(int col = 0; col<arr[0].length;col++){
int sum =0;
            for(int row = 0;row<arr.length;row++){

                System.out.print(arr[row][col]);

               sum +=arr[row][col];
            }
            System.out.println();
            System.out.println("sum is by colum :"+sum);

        }

    }
}
