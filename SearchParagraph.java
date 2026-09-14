import java.util.Scanner;

public class SearchParagraph {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a paragraph:");
        String para = sc.nextLine();

        // Split paragraph into words
        String[] arr = para.split(" ");

        System.out.print("Enter key to search: ");
        String key = sc.nextLine();

        boolean found = false;

        System.out.println("Positions of " + key + ":");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(key)) {
                System.out.println(i);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Key not found");
        }
    }
}
