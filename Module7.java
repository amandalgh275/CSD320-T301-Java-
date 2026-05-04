/*
 * Name: Amanda Tirey
 * Date: 5/2/2026
 * Module 7: Password Validator – Method Implementation
 * 
 * Purpose: This program checks whether a user's password meets security rules:
 *          minimum length, letter/digit mixture, and at least one uppercase
 *          and one lowercase character.
 */

package module7;

import java.util.Scanner;

public class Module7 {
    
    public static boolean isValidPassword(String password) {
        if (password.length() < 8) {
            return false;
        }
        
        boolean hasLetter = false;
        boolean hasDigit = false;
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        
        for (int i = 0; i < password.length(); i++) {
            char current = password.charAt(i);
            
            if (Character.isLetter(current)) {
                hasLetter = true;
                if (Character.isUpperCase(current)) {
                    hasUpperCase = true;
                }
                if (Character.isLowerCase(current)) {
                    hasLowerCase = true;
                }
            }
            if (Character.isDigit(current)) {
                hasDigit = true;
            }
        }
        
        return hasLetter && hasDigit && hasUpperCase && hasLowerCase;
    }
    
    public static String getPasswordFeedback(String password) {
        if (password.length() < 8) {
            return "Password must be at least 8 characters long.";
        }
        
        boolean hasLetter = false;
        boolean hasDigit = false;
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        
        for (int i = 0; i < password.length(); i++) {
            char current = password.charAt(i);
            if (Character.isLetter(current)) {
                hasLetter = true;
                if (Character.isUpperCase(current)) {
                    hasUpperCase = true;
                }
                if (Character.isLowerCase(current)) {
                    hasLowerCase = true;
                }
            }
            if (Character.isDigit(current)) {
                hasDigit = true;
            }
        }
        
        if (!hasLetter) {
            return "Password must contain at least one letter.";
        }
        if (!hasDigit) {
            return "Password must contain at least one digit.";
        }
        if (!hasUpperCase) {
            return "Password must contain at least one uppercase letter.";
        }
        if (!hasLowerCase) {
            return "Password must contain at least one lowercase letter.";
        }
        return "Password is valid!";
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=========================================");
        System.out.println("         PASSWORD VALIDATOR");
        System.out.println("=========================================");
        System.out.println("Rules:");
        System.out.println("  • At least 8 characters");
        System.out.println("  • Both letters and digits");
        System.out.println("  • At least one uppercase letter");
        System.out.println("  • At least one lowercase letter");
        System.out.println("-----------------------------------------");
        
        String userPassword;
        boolean isValid = false;
        
        while (!isValid) {
            System.out.print("\nEnter a password: ");
            userPassword = scanner.nextLine();
            
            if (isValidPassword(userPassword)) {
                isValid = true;
                System.out.println("\n✓ VALID password! Your password has been accepted.");
            } else {
                System.out.println("\n✗ INVALID password.");
                System.out.println("Reason: " + getPasswordFeedback(userPassword));
                System.out.println("\nPlease try again.");
            }
        }
        
        scanner.close();
    }
}