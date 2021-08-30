package userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    Scanner scanner = new Scanner(System.in);

    private void validMobileNo() {
        System.out.println("Enter the Mobile number: ");
        String mobileNumber = scanner.nextLine();
        String regex = "[0-9]{2}\\s{1}[0-9]{10}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(mobileNumber);
        boolean b = m.matches();
        if (b)
            System.out.println("Mobile number of the user is valid.");
        else
            System.out.println("Mobile number of the user is invalid.");

    }

    public static void main(String[] args) {
        UserRegistration user = new UserRegistration();
        user.validMobileNo();
    }
}