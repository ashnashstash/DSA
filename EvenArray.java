import java.util.Scanner;

public class EvenArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter size of array: ");
    int n = sc.nextInt();

    int[] arr = new int[n];

    System.out.println("Enter only even numbers:");

    for (int i = 0; i < n; i++) {
      int num = sc.nextInt();

      if (num % 2 == 0) {
        arr[i] = num;
      } else {
        System.out.println("Inavalid input");
        i--;
      }
    }

    System.out.println("Even array:");

    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
