// Write a program that demonstrate the use of class variable, instance variable and local varibale.

public class Exercise2 {

    // Class variable (static)
    public static String classVariable = "I am a class variable, shared among all instances.";

    // Instance variable
    public String instanceVariable;

    // Constructor to initialize instance variable
    public Exercise2(String instanceValue) {
        this.instanceVariable = instanceValue;
    }

    // Method demonstrating a local variable
    public void demonstrateLocalVariable() {
        // Local variable
        String localVariable = "I am a local variable, accessible only within this method.";
        System.out.println(localVariable);
    }

    public static void main(String[] args) {
        // Accessing class variable
        System.out.println(Exercise2.classVariable);

        // Creating instances with different instance variable values
        Exercise2 instance1 = new Exercise2("Instance 1 value");
        Exercise2 instance2 = new Exercise2("Instance 2 value");

        // Accessing instance variables
        System.out.println(instance1.instanceVariable);
        System.out.println(instance2.instanceVariable);

        // Demonstrating local variable
        instance1.demonstrateLocalVariable();
    }
}
