/*
       E
       D E
       C D E
       B C D E
       A B C D E
 */
package Patterns;
import java.util.Scanner;

public class P17 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); 

    // Loop for each row
    for (int i = 1; i <= n; i++) {
      // Print spaces for right alignment
      for (int space = 0; space < n - i; space++) {
        System.out.print(" "); // Print spaces for right alignment
      }

      // Print characters starting from ('E' - i) and going up to 'E'
      for (char c = (char) ('E' - i); c <= 'E'; c++) {
        System.out.print(c + " "); // Print the character followed by a space
      }

      // Move to the next line after printing the row
      System.out.println();
    }

    sc.close();
  }
}
