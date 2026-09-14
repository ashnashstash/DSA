import java.util.*;

public class Array {
  public static void main(String[] args) {
    // int[] a = { 2, 3, 4, 5, 6 };
    // System.out.println(a.length);

    int sum=0;
    Scanner sc = new Scanner(System.in);
    System.out.print("enter length of the array : ");
    int l = sc.nextInt();
    int[] arr = new int[l];

    System.out.print("enter array elements : ");
    for (int i = 0; i < l; i++) {
      arr[i] = sc.nextInt();
    }

    for (int i = 0; i < l; i++) {
      sum += arr[i];
    }

    System.out.print("array elements : ");
    for (int i = 0; i < l; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();

    System.out.print("sum : " + sum);
  }
}
