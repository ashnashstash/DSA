import java.util.*;

public class Strong {
    public static void main(String[] args) {
        int num = 145;
        int temp = num;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            int fact = 1;

            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }

            sum += fact;

            temp /= 10;
        }

        if (sum == num)
            System.out.println(num + " is a Strong Number");
        else
            System.out.println(num + " is not a Strong Number");
    }
}

// while (temp > 0) {
//     int digit = temp % 10;
//     int fact = 1;
//     int i = 1;

//     while (i <= digit) {
//         fact = fact * i;
//         i++;
//     }

//     sum = sum + fact;
//     temp = temp / 10;
// }

// do {
//     int digit = temp % 10;
//     int fact = 1;
//     int i = 1;

//     do {
//         fact = fact * i;
//         i++;
//     } while (i <= digit);

//     sum = sum + fact;
//     temp = temp / 10;

//     }while(temp>0);
