import java.util.Scanner;

public class NimGame {
    private int n;
    private int[] arr;

    public NimGame() {
        this.n = 10;
        this.arr = new int[10];
    }

    public NimGame(int n) {
        this.n = n;
        this.arr = new int[n];
    }

    public void initializeArray() {
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
    }

    public void displayArray() {
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            if (i != n - 1) {
                System.out.print(arr[i] + ",");
            } else {
                System.out.println(arr[i] + "]");
            }
        }
    }

    public void playGame() {
        initializeArray();
        displayArray();

        while (n >= 0) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your guess (1 or 2): ");
            int userGuess = scan.nextInt();
            System.out.println("Your Guess = " + userGuess);

            if (userGuess == 1 || userGuess == 2) {
                n -= userGuess;

                if (n <= 0) {
                    System.out.println("Congratulations! You are the winner.");
                    break;
                }

                displayArray();

                int compGuess = (int) (Math.random() * 2) + 1;
                System.out.println("Computer guess = " + compGuess);
                n -= compGuess;

                if (n <= 0) {
                    System.out.println("The computer is the winner.");
                    break;
                }

                displayArray();
            } else {
                System.out.println("Please enter a valid guess (1 or 2).");
            }
        }
    }

    public static void main(String[] args) {
        NimGame obj = new NimGame(10);
        obj.playGame();
    }
}