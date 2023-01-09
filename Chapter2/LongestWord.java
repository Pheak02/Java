import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a sentence: ");
            String input_sentence = scanner.nextLine(); // read user input
            String[] words = input_sentence.split(" ");
            String longest_word = "";
            int longest_word_len = 0;
            for (int i = 0; i < words.length; i++) {
                String word = words[i];
                int len = word.length(); // length means method returns the length of a specified string
                if (len > longest_word_len) {
                    longest_word = word;
                    longest_word_len = len;
                }
            }
            System.out.println(longest_word);
        }
    }
}