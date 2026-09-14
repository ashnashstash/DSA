import java.util.Scanner;

public class StudentManagement {
  int rollNo;
  String name;
  int m1, m2, m3;
  double average;

  StudentManagement(String n, int r, int a, int b, int c) {
    name = n;
    rollNo = r;
    m1 = a;
    m2 = b;
    m3 = c;
  }

  void averageMarks() {
    average = (m1 + m2 + m3) / 3;
  }

  void grades() {
    if (average >= 90)
      System.out.println("A");
    else if (average >= 75)
      System.out.println("B");
    else if (average >= 60)
      System.out.println("C");
    else if (average >= 40)
      System.out.println("D");
    else
      System.out.println("F");
  }

  void display() {
    System.out.println("Name: " + name);
    System.out.println("Roll No: " + rollNo);
    System.out.println("Marks: " + m1 + ", " + m2 + ", " + m3);
    System.out.println("Average: " + average);
    grades();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Name: ");
    String n = sc.nextLine();

    System.out.print("Enter Roll No: ");
    int r = sc.nextInt();

    System.out.print("Enter marks of 3 subjects: ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    StudentManagement obj = new StudentManagement(n, r, a, b, c);

    obj.averageMarks();
    obj.display();

  }
}
