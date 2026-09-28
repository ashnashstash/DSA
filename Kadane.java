import java.util.Scanner;

public class Kadane {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the length of array : ");
    int n=sc.nextInt();
    long[] arr=new long[n];
    System.out.print("Enter the elements of array : ");
    for(int i=0; i<n; i++){
      arr[i]=sc.nextLong();
    }
    long maxsum = arr[0], currentsum = arr[0];
    for (int i = 1; i < n; i++) {
      currentsum = Math.max(arr[i], currentsum+arr[i]);
      maxsum=Math.max(maxsum, currentsum);
    }
    System.out.println("Max subarray sum : " + maxsum);
  }
}

/*
 * 
 * -> maximum subarray sum
 * no number below 0 exists
 * if less than 0 then will assume sum as 0
 * 
 * border case, edge cases are important
 * 
 * Time Complexity O(n)
 * 
 */
