import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class TextAnalyzer {
    private String fileContent = "";
    public void readFile() {
        File file = new File("");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                fileContent += scanner.nextLine() + "\n";
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
    public int countCharacters() {
        int characterCount = 0;
        String text = fileContent.replaceAll("\n", "");
        characterCount = text.length();
        return characterCount;
    }
    public int countWords() {
        int wordCount = 0;
        String text = fileContent.replaceAll("\n", " ");
        String[] words = text.split(" ");
        wordCount = words.length;
        return wordCount;
    }
    public int countLines() {
        int lineCount = 0;
        String[] lines = fileContent.split("\n");
        lineCount = lines.length;
        return lineCount;
    }
    public boolean containsSequence(String sequence) {
        return fileContent.contains(sequence);
    }
    public static void main(String[] args) {
        TextAnalyzer TextAnalyzer = new TextAnalyzer();
        TextAnalyzer.readFile();
        System.out.println("Number of characters: " + TextAnalyzer.countCharacters());
        System.out.println("Number of words: " + TextAnalyzer.countWords());
        System.out.println("Number of lines: " + TextAnalyzer.countLines());
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the sequence to search: ");
        String sequence = scanner.nextLine();
        if (TextAnalyzer.containsSequence(sequence)) {
            System.out.println("Text contains the specified sequence.");
        } else {
            System.out.println("Text does not contain the specified sequence.");
        }
    }
}
