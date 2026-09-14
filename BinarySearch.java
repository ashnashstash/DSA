import java.util.Scanner;

public class BinarySearch {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter array length : ");
    int len = sc.nextInt();
    int[] arr = new int[len];

    System.out.println("enter array elements : ");
    for (int i = 0; i < len; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println("array elements : ");
    for (int i = 0; i < len; i++) {
      System.out.println(arr[i]);
    }

    System.out.println("enter key : ");
    int key = sc.nextInt();

    int c = 0;
    int start = 0;
    int end = len - 1;
    while (start <= end) {
      int mid = (start + end) / 2;
      if (key == arr[mid]) {
        System.out.println("element found at position : " + mid);
        c = 1;
        break;
      } else if (key > arr[mid]) {
        start = mid + 1;
      } else if (key < arr[mid]) {
        end = mid - 1;
      }
    }
    if (c == 0) {
      System.out.println("element not found");
    }
  }
}
