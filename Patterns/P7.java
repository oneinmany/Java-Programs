/*
     *****
      ****
       ***
        **
         *
 */
package Patterns;

import java.util.Scanner;

public class P7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); // Input for number of rows
    for (int i = 1; i <= n; i++) { // Loop for rows
      // Print spaces
      for (int space = 1; space < i; space++) {
        System.out.print(" ");
      }
      // Print stars
      for (int j = i; j <= n; j++) {
        System.out.print("*");
      }
      System.out.println(); // Move to the next line after each row
    }
    sc.close();
  }
}
