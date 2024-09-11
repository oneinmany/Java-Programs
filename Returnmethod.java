public class Returnmethod {
  public static void main(String[] args) {
      int sum = addition(8, 7);
      System.out.println(sum);
  }
  // Change the return type to int and add a return statement
  public static int addition(int x, int y) {
      return x + y;
  }
}
