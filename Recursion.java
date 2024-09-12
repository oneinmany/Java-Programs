/*In Creating a method the Void cannot be converted in to integer.
Step by Step Implementation:
When the sum() function is called, it adds parameter xto the sum of all numbers smaller than k and returns the result. When x becomes 0, the function just returns 0. When running, the program follows these steps:

11 + sum(10)
11 + ( 10 + sum(9) )
11+ ( 10 + ( 9+ sum(8) ) )
...
11+ 10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + sum(0)
11+ 10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0
Since the function does not call itself when x is 0, the program stops there and returns the result */
public class Recursion {
  public static void main(String[] args){
    int result = sum(11);
    System.out.println(result);
  }
  public static int sum(int x){
    if(x>0){
      return x+sum(x-1);
    }
    else{
      return 0;
    }
  }
}
