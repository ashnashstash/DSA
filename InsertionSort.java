import java.util.Scanner;

public class InsertionSort {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the length of array : ");
    int len = sc.nextInt();

    int[] arr = new int[len];

    System.out.print("Enter array elements : ");
    for (int i = 0; i < len; i++) {
      arr[i] = sc.nextInt();
    }

    for (int i = 1; i < len; i++) {
      int key = arr[i];
      int j = i - 1;
      while (j >= 0 && arr[j] > key) {
        arr[j + 1] = arr[j];
        j--;
      }
      arr[j + 1] = key;
    }

    System.out.print("Sorted array : ");
    for (int i = 0; i < len; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
