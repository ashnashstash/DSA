import java.util.Scanner;

public class QuickSort {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the length of array : ");
    int len = sc.nextInt();

    int[] arr = new int[len];

    System.out.print("Enter array elements : ");
    for (int i = 0; i < len; i++) {
      arr[i] = sc.nextInt();
    }

    quickSort(arr, 0, len - 1);

    System.out.print("Sorted array : ");
    for (int i = 0; i < len; i++) {
      System.out.print(arr[i] + " ");
    }

    sc.close();
  }

  static void quickSort(int[] arr, int start, int end) {
    if (start < end) {
      int partitionIndex = partition(arr, start, end);

      quickSort(arr, start, partitionIndex - 1);
      quickSort(arr, partitionIndex, end);
    }
  }

  static int partition(int[] arr, int start, int end) {
    int pivot = arr[(start + end) / 2];

    while (start <= end) {

      while (arr[start] < pivot) {
        start++;
      }

      while (arr[end] > pivot) {
        end--;
      }

      if (start <= end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        start++;
        end--;
      }
    }

    return start;
  }
}
