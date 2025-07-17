package collectionFramework;

import java.util.Scanner;

public class arrayDuplicate {
    public static void main(String[] args) {

        System.out.println("How many inputs you want to add");

        Scanner sc   = new Scanner(System.in);

        int input = sc.nextInt();

        int arr[] = new int[input];


        for(int i = 0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Number you  entered: ");

        for(int num :arr){
            System.out.print(num +"\t");
        }
        System.out.println();
        boolean bn = false;

        for(int i =0;i<arr.length;i++){

            for(int j = i+1;j<arr.length;j++){

                if(arr[i]==arr[j]){

                    bn = true;
                    System.out.println("found duplicate at "+i+" index value is "+arr[i] );
                    break;
                }
            }

        }
        if(!bn){
            System.out.println("No duplicate found");
        }
    }
}
