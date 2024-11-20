/*
         *
        **
       ***
      ****
     *****
 */
package Patterns;

import java.util.Scanner;

public class P6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); // Input for number of rows
    for (int row = 1; row <= n; row++) { // Loop for rows
      // Print spaces
      for (int space = 1; space <= n - row; space++) {
        System.out.print(" ");
      }
      // Print stars
      for (int col = 1; col <= row; col++) {
        System.out.print("*");
      }
      System.out.println(); // Move to the next line after each row
    }
    sc.close();
  }
}

