# Day 4: Java Conditional Statements

## 1. Introduction to Conditional Statements

Conditional statements in Java allow developers to execute specific blocks of code based on certain conditions. The two primary types of conditional statements are:

- **if-else statements**
- **switch statements**

Understanding these constructs is essential for controlling the flow of a Java program.

---

## 2. If-Else Statements

### 2.1 Syntax

```java
if (condition) {
    // code to be executed if condition is true
} else {
    // code to be executed if condition is false
}
```

### 2.2 Example

This example checks if a number is positive, negative, or zero:

```java
public class NumberCheck {
    public static void main(String[] args) {
        int number = -5;

        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
```

### 2.3 Diagram

```
+-------------------+
| Start Program     |
+-------------------+
        |
        v
+-------------------+
| Check Number      |
+-------------------+
        |
+--- Is number > 0? --- Yes ---> Print "Positive"
        |
+--- Is number < 0? --- Yes ---> Print "Negative"
        |
+--- Else ---------------------> Print "Zero"
```

### 2.4 Use Cases

1. **User Authentication**: Checking if the username and password match.
2. **Grade Calculation**: Determining letter grades based on numeric scores.
3. **Discount Application**: Applying discounts based on customer membership status.

---

## 3. Switch Case Statements

### 3.1 Syntax

```java
switch (expression) {
    case value1:
        // code to be executed if expression equals value1
        break;
    case value2:
        // code to be executed if expression equals value2
        break;
    default:
        // code to be executed if expression doesn't match any case
}
```

### 3.2 Example

This example determines the day of the week:

```java
public class DayOfWeek {
    public static void main(String[] args) {
        int day = 3; // 1 = Sunday, 2 = Monday, ..., 7 = Saturday

        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
```

### 3.3 Diagram

```
+-------------------+
| Start Program     |
+-------------------+
        |
        v
+-------------------+
| Check Day         |
+-------------------+
        |
+--- Day == 1? --- Yes ---> Print "Sunday"
        |
+--- Day == 2? --- Yes ---> Print "Monday"
        |
+--- Day == 3? --- Yes ---> Print "Tuesday"
        |
+--- Day == 4? --- Yes ---> Print "Wednesday"
        |
+--- Day == 5? --- Yes ---> Print "Thursday"
        |
+--- Day == 6? --- Yes ---> Print "Friday"
        |
+--- Day == 7? --- Yes ---> Print "Saturday"
        |
+--- Else ---------------------> Print "Invalid day"
```

### 3.4 Use Cases

1. **Menu Selection**: Allowing users to choose options from a menu.
2. **Game Level Selection**: Switching between different levels based on user input.
3. **Error Handling**: Handling different types of exceptions based on error codes.

---

## 4. Break and Continue Statements

### 4.1 Break Statement

The `break` statement is used to exit a loop or switch statement prematurely.

#### Example:

```java
public class BreakExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println("Number: " + i);
        }
    }
}
```

**Output:**

```
Number: 1
Number: 2
```

### 4.2 Continue Statement

The `continue` statement skips the current iteration of a loop and proceeds to the next iteration.

#### Example:

```java
public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println("Number: " + i);
        }
    }
}
```

**Output:**

```
Number: 1
Number: 2
Number: 4
Number: 5
```

---

## 5. Conclusion

Conditional statements are fundamental for controlling the flow of execution in Java programs. The if-else and switch case statements provide powerful tools for decision-making in code. Additionally, break and continue statements allow for precise control over loops, enhancing program flexibility and efficiency. By understanding and applying these constructs, developers can create more dynamic and responsive applications.

