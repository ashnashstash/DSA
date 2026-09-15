import java.util.*;

public class SelectionSort {
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
      int minIndex = i;
      for (int j = i + 1; j < len; j++) {
        if (arr[j] < arr[minIndex]) {
          minIndex = j;
        }
      }

      int temp = arr[minIndex];
      arr[minIndex] = arr[i];
      arr[i] = temp;
    }

    System.out.print("Sorted array : ");
    for (int i = 0; i < len; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
