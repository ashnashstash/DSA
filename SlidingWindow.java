import java.util.*;

public class SlidingWindow {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter length of the array : ");
    int l = sc.nextInt();
    int[] arr = new int[l];

    System.out.print("enter array elements : ");
    for (int i = 0; i < l; i++) {
      arr[i] = sc.nextInt();
    }

    int k = 3;

    int sum = 0;
    for (int i = 0; i < k; i++) {
      sum = sum + arr[i];
    }

    int maxSum = sum;

    for (int i = k; i < arr.length; i++) {
      sum = sum + arr[i];
      sum = sum - arr[i - k];

      if (sum > maxSum) {
        maxSum = sum;
      }
    }

    System.out.println("Maximum sum of a subarray of size " + k + " is: " + maxSum);

  }
}
