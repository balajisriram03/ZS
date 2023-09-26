import java.util.Scanner;

public class PasswordStrength {

    String key;

    public static void main(String[] args) {
        PasswordStrength myObj = new PasswordStrength();
        myObj.checkStrength();
    }

    public void getinput() {
        System.out.println("Enter your Password in 8 or more characters");
        Scanner scan = new Scanner(System.in);
        key = scan.nextLine();
    }

    public boolean checkLength() {
        boolean isTrue = false;
        if (key.length() >= 8) {
            isTrue = true;
        }
        return isTrue;
    }

    public boolean hasUpper() {
        boolean isTrue = false;
        for (int i = 0; i < key.length(); i++) {
            if (key.charAt(i) >= 65 && key.charAt(i) <= 90) {
                isTrue = true;
                break;
            }
        }
        return isTrue;
    }

    public boolean hasLower() {
        boolean isTrue = false;
        for (int i = 0; i < key.length(); i++) {
            if (key.charAt(i) >= 97 && key.charAt(i) <= 122) {
                isTrue = true;
                break;
            }
        }
        return isTrue;
    }

    public boolean hasNumber() {
        boolean isTrue = false;
        for (int i = 0; i < key.length(); i++) {
            if (key.charAt(i) >= '0' && key.charAt(i) <= '9') {
                isTrue = true;
                break;
            }
        }
        return isTrue;
    }

    public boolean hasSplchars() {
        boolean isTrue = false;
        for (int i = 0; i < key.length(); i++) {
            if (key.charAt(i) == '@' || key.charAt(i) == '!' || key.charAt(i) == '#' || key.charAt(i) == '?' || key.charAt(i) == '*') {
                isTrue = true;
                break;
            }
        }
        return isTrue;
        
    }

    public void checkStrength() {
    getinput();
    int strength = 0;
    if (checkLength()) {
        strength++;
    }
    if (hasUpper()) {
        strength++;
    }
    if (hasLower()) {
        strength++;
    }
    if (hasNumber()) {
        strength++;
    }
    if (hasSplchars()) {
        strength++;
    }
    if (strength <= 2) {
        System.out.println("Your password strength is less than 3 out of 5, so it is a weak password");
    } else if (strength <= 4) {
        System.out.println("Your password strength is less than 5 out of 5, so it is a average password");
    } else {
        System.out.println("Your password strength is 5/5 and is very strong ");
    }
}
}