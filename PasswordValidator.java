// implement a program for password validation using custom exceptions.

package exception;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter password: ");

        String password = scanner.nextLine();

        try {
            checkPasswordHandler(password);
        } catch (WeakPasswordException e) {
            System.out.println("Weak password.");
        } catch (LengthViolationException m) {
            System.out.println("Invalid password.");
        }
    }

    
    static void checkPassword(String password) throws PasswordException {
        if (password.length() < 8) {
            throw new LengthViolationException("Invalid password.");
        } else {
            System.out.println("This is your new password.");
        }
    }

    static void checkPasswordHandler(String password) throws PasswordException {
        checkPassword(password);
    }
}

class PasswordException extends Exception {
    public PasswordException(String message) {
        super(message);
    }
}

// Define WeakPasswordException and LengthViolationException classes
class WeakPasswordException extends PasswordException {
    public WeakPasswordException(String message) {
        super(message);
    }
}

class LengthViolationException extends PasswordException {
    public LengthViolationException(String message) {
        super(message);
    }
}
