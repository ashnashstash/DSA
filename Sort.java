import java.util.*;

class Sort {
  public static void main(String[] args) {
    int arr[] = { 1, 4, 5, 6, 2 };

    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        int temp = 0;
        if (arr[j] < arr[i]) {
          temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }

    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }

    System.out.println("second largest number : " + arr[arr.length - 2]);
  }
}