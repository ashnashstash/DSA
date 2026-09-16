import java.util.*;

public class WordSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a paragraph:");
        String para = sc.nextLine();

        String[] words = para.replaceAll("[^a-zA-Z ]", "").split("\\s+");

        for (int i = 0; i < words.length - 1; i++) {
            for (int j = 0; j < words.length - i - 1; j++) {

                if (words[j].length() > words[j + 1].length()) {
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }

        System.out.println("\nWords sorted by length:");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i] + " - " + words[i].length());
        }
    }
}
