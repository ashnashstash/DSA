public class Factorial {
  public static void main(String args[]) {
    int i, fact = 1;
    int number = 5;
    for (i = 1; i <= number; i++) {
      fact = fact * i;
    }
    System.out.println("Factorial of " + number + " = " + fact);
  }
}

// while (i <= number) {
//     fact = fact * i;
//     i++;
// }

// do {
//     fact = fact * i;
//     i++;
// } while (i <= number);

        