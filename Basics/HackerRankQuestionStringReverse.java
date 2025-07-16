package Basics;

import java.util.Scanner;

public class HackerRankQuestionStringReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());  // Read number of strings

        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();                     // Read each string
            String reversed = new StringBuilder(s).reverse().toString();  // Reverse using StringBuilder
            System.out.println(reversed);                      // Print reversed string
        }

        scanner.close();
    }
}
