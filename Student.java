import java.util.*;

class Student extends Person {
  int m1, m2, m3;
  double avg;

  Student(String name, int age, String gender, int m1, int m2, int m3) {
    super(name, age, gender);
    this.m1 = m1;
    this.m2 = m2;
    this.m3 = m3;
    this.avg = 0.0;
  }

  void calc() {
    avg = (m1 + m2 + m3) / 3.0;
  }

  void dis() {
    display();
    System.out.println("Marks in subject 1 : " + m1);
    System.out.println("Marks in subject 2 : " + m2);
    System.out.println("Marks in subject 3 : " + m3);
    System.out.println("Average Marks      : " + avg);
  }

  public static void main(String[] args) {
    Student obj = new Student("Nashrah", 20, "F", 89, 95, 99);

    obj.calc();
    obj.dis();
  }
}