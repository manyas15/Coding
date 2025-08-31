
import java.util.Scanner;

public class PasswordValidator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();

        try {
            validPassword(password);
            System.out.println("Correct");
        } catch (TooShortException e) {
            System.out.println("Too short!");
        } catch (NoDigitException e) {
            System.out.println("No digit!");
        }
    }

    public static void validPassword(String password) throws TooShortException, NoDigitException {

        {

            if (password.length() < 6) {
                throw new TooShortException();
            }

            boolean hasDigit = false;
            for (char c : password.toCharArray()) {
                if (Character.isDigit(c)) {
                    hasDigit = true;
                    break;
                }
            }

            if (!hasDigit) {
                throw new NoDigitException();
            }
        }
    }
}

class TooShortException extends Exception {

    public TooShortException() {
        super("Too short");
    }
}

class NoDigitException extends Exception {

    public NoDigitException() {
        super("No digit");
    }
}
