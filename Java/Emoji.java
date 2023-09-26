import java.util.Scanner;

public class Emoji {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the corresponding word to print emoji: ");
        String emojiName = scanner.nextLine().toLowerCase();

        if (emojiName.equals("smile")) {
            System.out.println("\uD83D\uDE00"); 
        } else if (emojiName.equals("heart")) {
            System.out.println("\uD83D\uDC9E"); 
        } else if (emojiName.equals("sad")) {
            System.out.println("\uD83D\uDE22"); 
        } else if (emojiName.equals("laugh")) {
            System.out.println("\uD83E\uDD23"); 
        } else if (emojiName.equals("angry")) {
            System.out.println("\uD83D\uDE20"); 
            
        } else {
            System.out.println("Invalid option selected.");
        }
    }
}