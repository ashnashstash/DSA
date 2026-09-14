import java.util.*;

public class BinaryConversion {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a decimal number : ");
    int num = sc.nextInt();

    if (num == 0) {
      System.out.println(0);
      return;
    }

    String binaryStr = "";

    while (num > 0) {
      int rem = num % 2;
      binaryStr = rem + binaryStr;
      num = num / 2;
    }

    System.out.println(binaryStr);
  }
}
