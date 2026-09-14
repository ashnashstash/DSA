import java.util.*;

class Max {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int max = 0;

    System.out.print("a : ");
    int a = sc.nextInt();

    System.out.print("b : ");
    int b = sc.nextInt();

    System.out.print("c : ");
    int c = sc.nextInt();

    if (a >= b && a >= c) {
      max = a;
    } else if (b >= a && b >= c) {
      max = b;
    } else {
      max = c;
    }

    System.out.println("max : " + max);
  }
}
