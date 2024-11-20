/*
            1
          2 1 2
        3 2 1 2 3
      4 3 2 1 2 3 4
    5 4 3 2 1 2 3 4 5
 */
package Patterns;

import java.util.Scanner;

public class P16 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=1;i<=n;i++){
      for(int space=1;space<=n-i;space++){
        System.out.print("  ");
      }
      for(int j=i;j>=1;j--){
        System.out.print(j+" ");
      }
      for(int j=2;j<=i;j++){
        System.out.print(j+" ");
      }
      System.out.println();
    }
  }
}
