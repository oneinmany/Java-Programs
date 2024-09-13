package ConstructorsExample;

public class Second {
  String name;
  int age;
  double height;
  Second(String name, int age,double height){
   this.name = name; 
   this.age = age;
   this.height = height;
  }
  void play(){
    System.out.println(name+" likes to play cricket");
  }
  void eat(){
    System.out.println(name+" Likes to eat butter-nann");
  }
}
