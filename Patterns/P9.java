/*
    *********
     *******
      *****
       ***
        * 
*/
package Patterns;

import java.util.Scanner;

public class P9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    for(int i=1;i<=n;i++){
      for(int space=1;space<i;space++){
        System.out.print(" ");
      }
      for(int j =1;j<=2*(n-i+1)-1;j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
