import java.util.*;

public class BubbleSort {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the length of array : ");
    int len = sc.nextInt();

    int[] arr = new int[len];

    System.out.print("Enter array elements : ");
    for (int i = 0; i < len; i++) {
      arr[i] = sc.nextInt();
    }

    for (int i = 0; i < len - 1; i++) {
      for (int j = 0; j < len - i - 1; j++) {
        int temp = 0;
        if (arr[j] > arr[j + 1]) {
          temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }

    System.out.print("Sorted array : ");
    for (int i = 0; i < len; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
