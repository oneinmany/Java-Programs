/*
 *       1
        212
       32123
      4321234
       32123
        212
         1
 */
package Patterns;

import java.util.Scanner;

public class P14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int row = 1; row <= 2 * n; row++) {

      int c = row > n ? 2 * n - row: row;

      for (int space = 0; space < n-c; space++) {
          System.out.print("  ");
      }
      for (int col = c; col >= 1; col--) {
          System.out.print(col + " ");
      }
      for (int col = 2; col <= c; col++) {
          System.out.print(col + " ");
      }

      System.out.println();
  }
}

  }
