import java.util.*;

public class TwoDArrayInsertSort {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter row length : ");
    int r = sc.nextInt();
    System.out.println("enter columns length : ");
    int c = sc.nextInt();
    int[][] arr = new int[r][c];

    System.out.println("enter array elements : ");
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        arr[i][j] = sc.nextInt();
      }
    }

    for (int i = 0; i < r; i++) {
      for (int k = 1; k < c; k++) {
        int key = arr[i][k];
        int j = k - 1;
        while (j >= 0 && arr[i][j] > key) {
          arr[i][j + 1] = arr[i][j];
          j--;
        }
        arr[i][j + 1] = key;
      }
    }

    System.out.println("matrix : ");
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }
}
