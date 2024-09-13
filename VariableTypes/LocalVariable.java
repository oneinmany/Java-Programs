package VariableTypes;
//Local Variable = Declared inside a method visible only to that method.
import java.util.Random;
public class LocalVariable {
 LocalVariable(){
  Random random = new Random();
  int number=0;
  roll(number, random);
 }
 void roll(int number, Random random) {
  number = random.nextInt(6)+1;
  System.out.println(number);
 }
}

