package VariableTypes;
import java.util.Random;

public class GlobalVariable {
  int number;
  Random random ;
  GlobalVariable(){
    random = new Random();
    roll();
  }
  void roll(){
    number = random.nextInt(6)+1;
    System.out.println("Global variable"+number);
  }
}
