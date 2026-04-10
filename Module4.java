// Name: Amanda Tirey
// Date: 4/10/2026
// Assignment: Module 4 - String Substring Checker

// Purpose: This program prompts the user for two strings and checks if either string is a substring of the other.

package module4; 

import java.util.Scanner;

public class Module4 {
    
    public static void main(String[] args) {
        
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Display program header
        System.out.println("==================================================");
        System.out.println("           STRING SUBSTRING CHECKER");
        System.out.println("==================================================");
        
        // Step 1: Prompt the user for the first string
        System.out.println("\nEnter the first string:");
        System.out.print("> ");
        String firstString = scanner.nextLine();
        
        // Step 2: Prompt the user for the second string
        System.out.println("Enter the second string:");
        System.out.print("> ");
        String secondString = scanner.nextLine();
        
        // Step 3: Add a blank line for readability
        System.out.println();
        
        // Step 4: Perform the substring checks and report results
        checkAndReportSubstrings(firstString, secondString);
        
        // Step 5: End message
        System.out.println("\n==================================================");
        System.out.println("Program complete. Thank you!");
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
    
    /**
     * This method checks if either string is a substring of the other
     * and prints the appropriate message to the console.
     *
     * @param str1 The first string entered by the user
     * @param str2 The second string entered by the user
     */
    public static void checkAndReportSubstrings(String str1, String str2) {
        
        System.out.println("--- Results ---");
        
        // Check if the first string is a substring of the second string
        if (str2.contains(str1)) {
            System.out.println("✓ \"" + str1 + "\" IS a substring of \"" + str2 + "\"");
            
            // Show the position where the substring is found
            int position = str2.indexOf(str1);
            System.out.println("  (Found at position " + position + ")");
            
        // Check if the second string is a substring of the first string
        } else if (str1.contains(str2)) {
            System.out.println("✓ \"" + str2 + "\" IS a substring of \"" + str1 + "\"");
            
            // Show the position where the substring is found
            int position = str1.indexOf(str2);
            System.out.println("  (Found at position " + position + ")");
            
        // If neither condition is true, report no substring relationship
        } else {
            System.out.println("✗ Neither string is a substring of the other.");
            System.out.println("  \"" + str1 + "\" does not contain \"" + str2 + "\"");
            System.out.println("  \"" + str2 + "\" does not contain \"" + str1 + "\"");
        }
    }
}
