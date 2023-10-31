import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        User user = new User();
        user.getInput();
        System.out.println(user);
    }

    public static boolean validateInput(String input) { 
        if (input == null || input.isEmpty()) {
            return false;
        }

        if (input.trim().length() != input.length()) {
            return false;
        }

        if (input.contains(" ")) {
            return false;
        }

        if (!input.matches("[a-zA-Z0-9]+")) {
            return false;
        }

        return true;
    }
}

class User {
    private String username;
    private String pin;

    User() {
        username = null;
        pin = null;
    }

    User(String username, String pin) {
        this.username = username;
        this.pin = pin;
    }

    public void getInput() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        while (!HelloWorld.validateInput(name)) {
            System.out.println("Invalid input! Please try again.");
            System.out.print("Enter your name: ");
            name = sc.nextLine();
        }

        System.out.print("Enter your pin: ");
        String pin = sc.nextLine();
        while (!HelloWorld.validateInput(pin)) {
            System.out.println("Invalid input! Please try again.");
            System.out.print("Enter your pin: ");
            pin = sc.nextLine();
        }

        this.username = name;
        this.pin = pin;
    }

    public String toString() {
        return "Username: " + this.username + ", Pin: " + this.pin;
    }
}
