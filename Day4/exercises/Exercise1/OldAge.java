// Write a Java program to check if someone is eligible to apply for receiving old age allowance. Please complete the following requirements:
// 1. Create a new class named OldAge
// 2. Create a void type method that takes age as the parameter.
// 3. Check condition where if the age is equal to or greater than 70, then old age allowance is permitted. But if it is not, then allowance is not permitted.
// 4. Optional: Add another condition to check if the person is of Nepali nationality or not by adding a parameter of type String named nationality. Now if the age and nationality condition both satisfy, allowance is permitted or else not.
// 5. Use main method to execute the method that you created.




public class OldAge {

    // Method to check eligibility for old age allowance
    public void checkEligibility(int age, String nationality) {
        // Check age and nationality conditions
        if (age >= 70 && nationality.equalsIgnoreCase("Nepali")) {
            System.out.println("Allowance permitted.");
        } else {
            System.out.println("Allowance not permitted.");
        }
    }

    public static void main(String[] args) {
        // Create an instance of OldAge class
        OldAge oldAge = new OldAge();

        // Test cases
        oldAge.checkEligibility(75, "Nepali"); // Eligible
        oldAge.checkEligibility(65, "Nepali"); // Not eligible (age)
        oldAge.checkEligibility(75, "Indian"); // Not eligible (nationality)
    }
}
