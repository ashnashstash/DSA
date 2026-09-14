import java.util.*;

class PasswordChecker {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String password = "@Ab09fG";
    int i;

    for (i = 1; i <= 3; i++) {
      System.out.print("enter password : ");
      String pass = sc.next();

      if (password.equals(pass)) {
        System.out.println("log in successfull!");
        break;
      } else {
        if (i == 3) {
          System.out.println("device locked");
        } else {
          System.out.println("incorrect password, " + (3 - i) + " trys left");
        }
      }
    }
  }
}
