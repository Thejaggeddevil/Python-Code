import java.util.Scanner;
import java.util.Stack;

public class TwoStackGame {

    // Method to initialize stacks with random values
    private static Stack<Integer> initializeStack(int size) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 1; i <= size; i++) {
            stack.push(i);
        }
        return stack;
    }

    // Method to display current status of both stacks
    private static void displayStacks(Stack<Integer> stack1, Stack<Integer> stack2) {
        System.out.println("Stack 1: " + stack1);
        System.out.println("Stack 2: " + stack2);
    }

    // Method to check if both stacks are empty
    private static boolean bothStacksEmpty(Stack<Integer> stack1, Stack<Integer> stack2) {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize two stacks with some values
        Stack<Integer> stack1 = initializeStack(5); // Example size of 5
        Stack<Integer> stack2 = initializeStack(5); // Example size of 5

        int currentPlayer = 1; // Player 1 starts
        boolean gameWon = false;

        System.out.println("Welcome to the Two Stack Game!");
        displayStacks(stack1, stack2);

        while (!bothStacksEmpty(stack1, stack2)) {
            System.out.println("\nPlayer " + currentPlayer + "'s turn:");
            System.out.print("Choose a stack (1 or 2): ");
            int stackChoice = scanner.nextInt();

            if (stackChoice == 1 && !stack1.isEmpty()) {
                System.out.println("Player " + currentPlayer + " removes " + stack1.pop() + " from Stack 1.");
            } else if (stackChoice == 2 && !stack2.isEmpty()) {
                System.out.println("Player " + currentPlayer + " removes " + stack2.pop() + " from Stack 2.");
            } else {
                System.out.println("Invalid choice or empty stack. Try again.");
                continue; // Player gets another chance
            }

            displayStacks(stack1, stack2);

            // Check if the game is over
            if (bothStacksEmpty(stack1, stack2)) {
                System.out.println("\nPlayer " + currentPlayer + " wins by removing the last element!");
                gameWon = true;
                break;
            }

            // Switch to the next player
            currentPlayer = (currentPlayer == 1) ? 2 : 1;
        }

        if (!gameWon) {
            System.out.println("Game over. No moves left!");
        }

        scanner.close();
    }
}
