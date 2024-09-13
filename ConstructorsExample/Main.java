package ConstructorsExample;

public class Main {
  public static void main(String[] args) {
    Second obj1 = new Second("purna chandu", 19, 160.0);
    Second obj2 = new Second("Sai charan", 20, 165.0);
    Second obj3 = new Second("Rohith Sai", 19, 158.0);
    //System.out.println(obj1.height);
    //System.out.println(obj2.name);
    //System.out.println(obj3.age);
    obj1.eat();
    obj2.play();
    obj3.eat();
  }
}
