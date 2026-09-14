import java.util.*;

class Encapsulation {
  private String name;
  private int age;

  void setName(String name) {
    this.name = name;
  }

  void getName() {
    System.out.println("Name : " + name);
  }

  void setAge(int age) {
    this.age = age;
  }

  void getAge() {
    System.out.println("Age : " + age);
  }

  public static void main(String[] args) {
    Encapsulation obj = new Encapsulation();

    obj.setName("Nashrah");
    obj.getName();

    obj.setAge(20);
    obj.getAge();
  }
}