package userregistration;

import java.util.Scanner;

public class UserRegistration {
    Scanner scanner = new Scanner(System.in);

    private void validFirstName() {
        System.out.println("Enter the first name: ");
        String name = scanner.next();
        String regex = "^[A-Z][a-z]{3,}";
        if (name.matches(regex)) {
            System.out.println("First Name of the user is valid.");
        } else {
            System.out.println("First Name of the user is invalid.");
        }
    }

    public static void main(String[] args) {
        UserRegistration user = new UserRegistration();
        user.validFirstName();
    }

}
