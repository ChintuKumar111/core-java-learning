package Basics;

import java.sql.SQLOutput;
import java.util.jar.JarOutputStream;

public class StarPattern2 {
    public static void main(String[] args) {
        for(int i = 1; i<=5;i++){
            for(int j = 1; j<=5;j++){

                if(j+i ==6){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
