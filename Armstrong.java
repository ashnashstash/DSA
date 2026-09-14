import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        int n, cubeSum = 0, num, r;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number=");
        n = sc.nextInt();
        num = n;
        while (num > 0) {
            r = num % 10;
            cubeSum = cubeSum + (r * r * r);
            num = num / 10;
        }
        if (n == cubeSum) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
    }
}


// for (num = n; num > 0; num = num / 10) {
//     r = num % 10;
//     cubeSum = cubeSum + (r * r * r);
// }

// do {
//             r = num % 10;
//             cubeSum = cubeSum + (r * r * r);
//             num = num / 10;
//         } while (num > 0);
