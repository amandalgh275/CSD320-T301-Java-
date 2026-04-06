/*
 * Name: Amanda Tirey
 * Date: 4/5/2026
 * Assignment: Rock-Paper-Scissors Game
 * 
 * Purpose: This program simulates the Rock-Paper-Scissors game where the user plays against the computer.
 */

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    
    public static void main(String[] args) {
        // Create Scanner object for user input and Random object for computer choice
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        // Generate computer's choice: 1 (Rock), 2 (Paper), or 3 (Scissors)
        int computerChoice = random.nextInt(3) + 1;
        
        // Display welcome message and game instructions
        System.out.println("Welcome to Rock-Paper-Scissors!");
        System.out.println("Enter your choice:");
        System.out.println("1 - Rock");
        System.out.println("2 - Paper");
        System.out.println("3 - Scissors");
        System.out.print("Your choice (1, 2, or 3): ");
        
        // Read user's choice
        int userChoice = input.nextInt();
        
        // Validate user input - ensure it's between 1 and 3
        if (userChoice < 1 || userChoice > 3) {
            System.out.println("Invalid input! Please run the program again and enter 1, 2, or 3.");
            input.close();  // Close scanner to prevent resource leak
            return;         // Exit the program
        }
        
        // Convert numeric choices to readable strings for display
        String computerSelection = convertChoiceToString(computerChoice);
        String userSelection = convertChoiceToString(userChoice);
        
        // Display the results header
        System.out.println("\n--- RESULTS ---");
        System.out.println("Computer selected: " + computerSelection);
        System.out.println("You selected: " + userSelection);
        
        // Determine the winner and display the result
        String result = determineWinner(userChoice, computerChoice);
        System.out.println("\n" + result);
        
        // Close scanner to free system resources
        input.close();
    }
    
    /*
     * Converts a numeric choice (1, 2, or 3) to its corresponding string name.
     * 
     * @param choice - The numeric choice (1=Rock, 2=Paper, 3=Scissors)
     * @return The string representation of the choice
     */
    public static String convertChoiceToString(int choice) {
        switch (choice) {
            case 1: return "Rock";
            case 2: return "Paper";
            case 3: return "Scissors";
            default: return "Unknown";  // This case should never occur with valid input
        }
    }
    
    /*
     * Determines the winner based on standard Rock-Paper-Scissors rules:
     * - Rock (1) beats Scissors (3)
     * - Paper (2) beats Rock (1)
     * - Scissors (3) beats Paper (2)
     * 
     * @param user - The user's numeric choice
     * @param computer - The computer's numeric choice
     * @return A string message indicating the result (tie, user win, or computer win)
     */
    public static String determineWinner(int user, int computer) {
        // Check for a tie - both players chose the same option
        if (user == computer) {
            return "It's a tie!";
        }
        
        // Check all scenarios where the user wins
        if ((user == 1 && computer == 3) ||  // Rock beats Scissors
            (user == 2 && computer == 1) ||  // Paper beats Rock
            (user == 3 && computer == 2)) {  // Scissors beats Paper
            return "You win! Congratulations!";
        }
        
        // If not a tie and user didn't win, computer wins
        return "Computer wins! Better luck next time!";
    }
}