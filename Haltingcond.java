public class Haltingcond {
  public static void main(String[] args) {
    int result = sum(6,11);
    System.out.println(result);
  }
  public static int sum(int start, int end){
    if(start< end){
      return start+ sum(start, end-1);
    }
    else{
      return start;
    }
  }
}
