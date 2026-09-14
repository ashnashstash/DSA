import java.util.Scanner;

public class StudentArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number of entries : ");
    int n = sc.nextInt();
    String[] name = new String[n];
    int[] marks = new int[n];

    System.out.println("Name of students : ");
    for (int i = 0; i < n; i++) {
      name[i] = sc.next();
    }
    System.out.println("Marks of students : ");
    for (int i = 0; i < n; i++) {
      marks[i] = sc.nextInt();
    }

    int max = marks[0];
    int print = 0;
    for (int i = 0; i < n; i++) {
      if (marks[i] > max) {
        max = marks[i];
        print = i;
      }
    }

    for (int i = 0; i < n; i++) {
      if (i == print) {
        System.out.println("Student with highest marks : " + name[i] + " " + marks[i]);
      }
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (marks[j] < marks[i]) {
          int temp = marks[j];
          marks[j] = marks[i];
          marks[i] = temp;

          String tempName = name[j];
          name[j] = name[i];
          name[i] = tempName;
        }
      }
    }
    System.out.println("Student with second highest marks : " + name[n - 1] + " " + marks[n - 1]);
  }
}
