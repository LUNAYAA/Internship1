import java.util.*;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the desired password length:");
        int length = scanner.nextInt();
        System.out.println("Do you want a complex password? (yes/no)");
        String complexity = scanner.next();

        System.out.println("Generated Password: " + generatePassword(length, complexity));
    }

    public static String generatePassword(int length, String complexity) {
        String passwordSet;
        if (complexity.equalsIgnoreCase("yes")) {
            passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()";
        } else {
            passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        }

        Random rand = new Random();
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            password[i] = passwordSet.charAt(rand.nextInt(passwordSet.length()));
        }
        return new String(password);
    }
}