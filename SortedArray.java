import java.util.Scanner;

public class SortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements in sorted order:");

        for (int i = 0; i < n; i++) {

            int num = sc.nextInt();

            if (i == 0 || num >= arr[i - 1]) {
                arr[i] = num;
            } else {
                System.out.println("Enter elements in a sorted manner");
                i--;
            }
        }

        System.out.println("Sorted Array:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
