import java.util.Scanner;

public class StackPalindrome {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number : ");
    int num = sc.nextInt();
    String str = String.valueOf(num);
    char[] stack = new char[str.length()];
    int top = -1;

    for (int i = 0; i < str.length(); i++) {
      stack[++top] = str.charAt(i);
    }

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) != stack[top--]) {
        System.out.println("Not Palindrome");
        return;
      }
    }
    System.out.println("Palindrome");
  }
}
