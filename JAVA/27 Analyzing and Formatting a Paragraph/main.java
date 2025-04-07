import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a paragraph: ");
        String paragraph = scanner.nextLine().trim();
        String trimmed_paragraph = paragraph;

        String one_spaces = trimmed_paragraph.replaceAll("\\s+", " ");

        String[] words = one_spaces.split(" ");

        System.out.println("Word Count: " + words.length);

        String replaced_word = one_spaces.replaceAll("Java", "Python");
        System.out.println("Modified Paragraph: " + replaced_word);
        scanner.close();
    }
}
