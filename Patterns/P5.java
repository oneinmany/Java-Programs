/* 
    *
    **
    ***
    ****
    *****
    ****
    ***
    **
    * 
*/
package Patterns;

import java.util.Scanner;

public class P5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int row =1;row<2*n-1;row++){
      int totalcol=0;
      if(row>n){
        totalcol = 2*n-row;
      }
      else{
        totalcol =row;
      }
      for(int col=1;col<totalcol;col++){
        System.out.print("*"+" ");
      }
      System.out.println();
    }
  }
}
