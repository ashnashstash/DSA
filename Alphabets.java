import java.util.*;

class Alphabets {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int capital = 0, small = 0, special = 0, numerals = 0;

    System.out.print("enter a string : ");
    String word = sc.nextLine();

    for (int i = 0; i < word.length(); i++) {
      char ch = word.charAt(i);

      if (ch >= 'A' && ch <= 'Z') {
        capital++;
      } else if (ch >= 'a' && ch <= 'z') {
        small++;
      } else if (ch >= '0' && ch <= '9') {
        numerals++;
      } else {
        special++;
      }
    }

    System.out.println("capital : " + capital);
    System.out.println("small : " + small);
    System.out.println("numerals : " + numerals);
    System.out.println("special : " + special);

  }
}
