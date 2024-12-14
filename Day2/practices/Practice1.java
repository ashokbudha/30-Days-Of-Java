// Write a program that implement a static method and variable, then call them without creating an instance of the class.

public class Practice1 {

    // Static variable to keep track of the count
    public static int count = 0;

    // Static method to increment the count
    public static void incrementCount() {
        count++;
    }

    // Static method to get the current count value
    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        // Call the static method without creating an instance
        Practice1.incrementCount();
        Practice1.incrementCount();

        // Print the current count using the static method
        System.out.println("Current count: " + Practice1.getCount());
    }
}
