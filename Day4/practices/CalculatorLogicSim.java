// Project: Simple Calculator and Logical Gate Simulator
// Project Description
// Create a Java program that combines the use of multiple operators to perform both arithmetic calculations and logical evaluations.

// Part 1: Simple Calculator
// Objective: Allow the user to input two numbers and choose an operation (add, subtract, multiply, divide, modulus).
// Implementation Steps:
// Accept two numbers from the user.
// Ask the user to select an operation using a menu system (e.g., 1 for Add, 2 for Subtract, etc.).
// Perform the selected operation using arithmetic and assignment operators.
// Print the result.

// Part 2: Logical Gate Simulator
// Objective: Simulate basic logical gates (AND, OR, NOT) for boolean inputs.
// Implementation Steps:
// Accept two boolean inputs (true or false) from the user.
// Ask the user to select a logical operation (AND, OR, NOT).
// Perform the operation using logical operators.
// Print the result.





import java.util.Scanner;

public class CalculatorLogicSim {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Part 1: Simple Calculator
        System.out.println("--- Simple Calculator ---");
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Choose an operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Modulus");
        System.out.print("Enter your choice: ");
        int calcChoice = scanner.nextInt();

        double calcResult = 0;
        switch (calcChoice) {
            case 1:
                calcResult = num1 + num2;
                System.out.println("Result: " + calcResult);
                break;
            case 2:
                calcResult = num1 - num2;
                System.out.println("Result: " + calcResult);
                break;
            case 3:
                calcResult = num1 * num2;
                System.out.println("Result: " + calcResult);
                break;
            case 4:
                if (num2 != 0) {
                    calcResult = num1 / num2;
                    System.out.println("Result: " + calcResult);
                } else {
                    System.out.println("Error: Division by zero.");
                }
                break;
            case 5:
                calcResult = num1 % num2;
                System.out.println("Result: " + calcResult);
                break;
            default:
                System.out.println("Invalid operation choice.");
        }

        // Part 2: Logical Gate Simulator
        System.out.println("\n--- Logical Gate Simulator ---");
        System.out.print("Enter first boolean value (true/false): ");
        boolean bool1 = scanner.nextBoolean();
        System.out.print("Enter second boolean value (true/false): ");
        boolean bool2 = scanner.nextBoolean();

        System.out.println("Choose a logical operation:");
        System.out.println("1. AND");
        System.out.println("2. OR");
        System.out.println("3. NOT (applies only to first input)");
        System.out.print("Enter your choice: ");
        int logicChoice = scanner.nextInt();

        boolean logicResult;
        switch (logicChoice) {
            case 1:
                logicResult = bool1 && bool2;
                System.out.println("Result: " + logicResult);
                break;
            case 2:
                logicResult = bool1 || bool2;
                System.out.println("Result: " + logicResult);
                break;
            case 3:
                logicResult = !bool1;
                System.out.println("Result: " + logicResult);
                break;
            default:
                System.out.println("Invalid logical operation choice.");
        }

        scanner.close();
    }
}
