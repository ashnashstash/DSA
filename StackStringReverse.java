import java.util.Scanner;

public class StackStringReverse {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter string : ");
    String str = sc.nextLine();
    char[] stack = new char[str.length()];
    int top = -1;

    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      stack[++top] = ch;
    }

    String reverse = "";

    while (top >= 0) {
      reverse += stack[top--];
    }
    
    System.out.println(reverse);
  }
}
