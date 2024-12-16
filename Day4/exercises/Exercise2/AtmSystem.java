// Imagine that you are developing a simple ATM system. The system allows the user to perform basic banking operations like checking balance, withdrawing cash and depositing funds. You should programmatically perform the following actions:
// 1. Validate user's pin (use if-else condition and check if the pin is 1234. If it is 1234, continue the remaining process else display an error message and exit program)
// 2. If the validation succeeds, the user can perform one of the given actions. Use switch case where 1-> Check Balance 2-> Withdraw cash 3->Deposit funds. For each of these cases, just print a message saying, “Successfully performed this action”. Replace “this” with actual action name.
// 3. Optional: Take user input for fetching pin and selecting menu items.(Hint: use Scanner)
// 4. If you cannot take in user input, set the value for pin and user selection for preferred actions at the top of the class as class variables and use that static value.
// 5. Be mindful that the switch case conditional evaluation must only begin if the pin validation is successful.
// 6. Any creative thinking utilizing this scenario will be appreciated.




import java.util.Scanner;

public class AtmSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Validate PIN
        System.out.print("Enter your PIN: ");
        int pin = scanner.nextInt();

        if (pin != 1234) {
            System.out.println("Invalid PIN. Exiting system.");
            return;
        }

        // Step 2: Menu options
        System.out.println("\nWelcome to the ATM System.");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw Cash");
        System.out.println("3. Deposit Funds");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        // Step 3: Perform selected action
        switch (choice) {
            case 1:
                System.out.println("Successfully performed Check Balance action.");
                break;
            case 2:
                System.out.println("Successfully performed Withdraw Cash action.");
                break;
            case 3:
                System.out.println("Successfully performed Deposit Funds action.");
                break;
            default:
                System.out.println("Invalid choice. Exiting system.");
        }

        scanner.close();
    }
}
