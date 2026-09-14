import java.util.*;

public class TwoDArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter row length : ");
    int r = sc.nextInt();
    System.out.println("enter columns length : ");
    int c = sc.nextInt();
    int[][] arr = new int[r][c];

    System.out.println("enter array elements : ");
    for (int i = 0; i < r; i++) {
      for(int j = 0; j < c; j++){
        arr[i][j] = sc.nextInt();
      }
    }

    System.out.println("matrix : ");
    for (int i = 0; i < r; i++) {
      for(int j = 0; j < c; j++){
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }
}
