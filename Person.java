import java.util.*;

class Person {
  String name;
  int age;
  String gender;

  Person(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  void display() {
    System.out.println("Name  : " + name);
    System.out.println("Age   : " + age);
    System.out.println("Gender: " + gender);
  }

  public static void main(String[] args) {
    Person obj = new Person("Nashrah", 20, "F");
    obj.display();
  }
}