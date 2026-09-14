import java.util.*;

public class LinearSearch {
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

    for (int i = 0; i < len; i++) {
      if (arr[i] == key) {
        System.out.println("key found at position " + (i + 1));
        break;
      }
    }
  }
}
