import java.util.Scanner;

public class MergeSort {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the length of array : ");
    int len = sc.nextInt();

    int[] arr = new int[len];

    System.out.print("Enter array elements : ");
    for (int i = 0; i < len; i++) {
      arr[i] = sc.nextInt();
    }

    mergeSort(arr, 0, len - 1);

    System.out.print("Sorted array : ");
    for (int i = 0; i < len; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  static void mergeSort(int[] arr, int start, int end) {
    if (start < end) {

      int mid = (start + end) / 2;

      mergeSort(arr, start, mid);
      mergeSort(arr, mid + 1, end);

      merge(arr, start, mid, end);
    }
  }

  static void merge(int[] arr, int start, int mid, int end) {

    int[] temp = new int[end - start + 1];

    int i = start;
    int j = mid + 1;
    int k = 0;

    while (i <= mid && j <= end) {

      if (arr[i] < arr[j]) {
        temp[k] = arr[i];
        i++;
      } else {
        temp[k] = arr[j];
        j++;
      }

      k++;
    }

    while (i <= mid) {
      temp[k] = arr[i];
      i++;
      k++;
    }

    while (j <= end) {
      temp[k] = arr[j];
      j++;
      k++;
    }

    for (i = start, k = 0; i <= end; i++, k++) {
      arr[i] = temp[k];
    }
  }
}
