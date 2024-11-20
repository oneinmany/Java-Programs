/*
              1
            1   1
          1   2   1
        1   3   3   1
      1   4   6   4   1 //pascals triangle
 */
package Patterns;

import java.util.Scanner;

public class P12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); 
    for(int i=0;i<n;i++){
      for(int space =1;space<n-i;space++){
        System.out.print("  ");
      }
      int value =1;
      for(int j=0;j<=i;j++){
        System.out.print(value+"  ");
        value = value*(i-j)/(j+1);
      }
      System.out.println();
    }

  }
}
