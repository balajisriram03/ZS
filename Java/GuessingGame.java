import java.util.Scanner;

public class GuessingGame {
    int randomNum = 4;
    int guessedNum = 0;

    public static void main(String[] args) {
        GuessingGame game = new GuessingGame();
        game.processing();
    }

    public boolean getGuessedInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a random number between 1-10");
        int guessedNum = scan.nextInt();
        return checkCondition(guessedNum);
    }

    public boolean checkCondition(int guessedNum) {
        if (randomNum == guessedNum) {
            return true;
        }
        return false;
    }

    public void processing() {
        while (true) {
            if (getGuessedInput()) {
                System.out.println("Congratulations! You guessed the correct number!");
                break;
            } else {
                System.out.println("Sorry, try again.");
            }
        }
    }
}