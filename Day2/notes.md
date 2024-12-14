# Day 2: Key Concepts and Fundamentals of Java

## 1. Significance of the Main Method

The `main` method is the entry point for any standalone Java application. It is where the program begins execution.

```java
public static void main(String[] args)
```


- **`public`**: Accessible from anywhere.
- **`static`**: Can be called without creating an instance of the class.
- **`void`**: Does not return any value.
- **`String[] args`**: Accepts command-line arguments as an array of strings.


### Components of the Main Method:
- **`Command-line Arguments`**: The method's capability to accept external inputs.
- **`Accessibility`**: The method's visibility and access level.
- **`Static Nature`**: The ability to call the method without an instance.
- **`Void Return Type`**: The method's lack of return value.


---

## 2. Access Modifiers Introduction

Access modifiers determine the visibility of classes, methods, and variables.The Four Main access modifiers in java are:

| Modifier   | Accessibility                        |
|------------|--------------------------------------|
| `public`   | Accessible from any other class.     |
| `protected`| Accessible within the same package and subclasses. |
| `default`  | Accessible only within the same package. |
| `private`  | Accessible only within the same class. |

![Java Access Modifiers](https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcQT8NcmhqoEcOrvmKloCTR4EQ14y25G1lO1iHAF8PhNqibM_Yyb)


---

## 3. Variables

### Types of Variables in Java:

#### Class Variables (Static Variables):
Declared with the `static` keyword and shared among all instances of a class.

```java
static int classVariable = 10;
```

| Pros             | Cons                   |
|------------------|------------------------|
| Shared State     |Global State Risks      |
| Memory Efficiency| Thread Safety issues   |
| Ease Access      | Testing difficulties   |


#### Local Variables:
Declared within a method or block; accessible only within that scope.

```java
void method() {
    int localVariable = 5;
}
```

| Pros               | Cons                      |
|--------------------|---------------------------|
| Limited Scope      |Limited accessibility      |
| Memory Management  | Potential for redundancy  |
| Encapsulation      |                           |


#### Instance Variables:
Declared within a class but outside any method. Each instance has its own copy.

```java
int instanceVariable;
```



---

## 4. Data Types

Java data types are categorized into two main types:

### Primitive Data Types:
- `int`, `char`, `boolean`, `float`, `double`, `byte`, `short`, `long`

![Java Primitive Data Types](https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcThNvgz4L6BbinC-K_eimcfzetWN4R6g6tVzQ&s)

### Wrapper Classes:
- `Integer`, `Character`, `Boolean`, `Float`, `Double`, `Byte`, `Short`, `Long`

![Java Wrapper Classes](https://avaldes.com/wp-content/uploads/2015/03/java_wrapper_hierarchy.png)

---

## 5. Static Keyword

Used for memory management and applicable to variables, methods, blocks, and nested classes.

- **Static Variables**: Shared across all instances.
- **Static Methods**: Can be called without creating an instance.

```java
static void staticMethod() {
    // code
}
```


---

## 6. Final Keyword

The `final` keyword is used to declare constants. Once declared, its value cannot be changed.

### Examples:
- **Final Variables**: Cannot be reassigned.

```java
final int CONSTANT = 100;
```

- **Final Methods**: Cannot be overridden in subclasses.

```java
final void finalMethod() {
    // code
}
```


---

## 7. Return Type

Specifies what type of value the method will return. If a method does not return a value, its return type is `void`.

```java
int add(int a, int b) {
    return a + b;
}
```

---

## 8. Method Signature and Parameters

The method signature consists of the method's name and its parameter list, uniquely identifying it within a class.

### Example:

```java
void display(String message) {
    System.out.println(message);
}
```

### Method Execution Sequence:
1. **Method Invocation**: The method is called with arguments.
2. **Parameter Assignment**: Arguments are assigned to parameters.
3. **Execution**: Code inside the method is executed.
4. **Return**: A result is returned if applicable.

