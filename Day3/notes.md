# Day 3:Types of Operators

This note provides an overview of the five types of operators in Java with examples, usage, and operator precedence.



## 1. Arithmetic Operators
Used for basic mathematical operations.

| Operator | Description            | Example |
|----------|------------------------|---------|
| +        | Addition               | a + b   |
| -        | Subtraction            | a - b   |
| *        | Multiplication         | a * b   |
| /        | Division               | a / b   |
| %        | Modulus (Remainder)    | a % b   |

**Example:**
```java
int a = 10, b = 3;
System.out.println(a + b); // 13
System.out.println(a % b); // 1
```

---

## 2. Relational Operators
Relational operators are used to compare two values, and they return a boolean result (`true` or `false`).

| Operator | Description               | Example  |
|----------|---------------------------|----------|
| `==`     | Equal to                  | `a == b` |
| `!=`     | Not equal to              | `a != b` |
| `>`      | Greater than              | `a > b`  |
| `<`      | Less than                 | `a < b`  |
| `>=`     | Greater than or equal to  | `a >= b` |
| `<=`     | Less than or equal to     | `a <= b` |

**Example:**
```java
int a = 10, b = 3;
System.out.println(a > b);   // true
System.out.println(a <= b);  // false
System.out.println(a != b);  // true
```

---

## 3. Logical Operators 

Logical operators are used to evaluate boolean expressions. They return `true` or `false` based on the logic applied to their operands.



### List of Logical Operators

| Operator | Name          | Description                                    | Example    |
|----------|---------------|------------------------------------------------|------------|
| `&&`     | Logical AND   | Returns `true` if both conditions are `true`.  | `a && b`   |
| `||`     | Logical OR    | Returns `true` if at least one condition is `true`. | `a || b`   |
| `!`      | Logical NOT   | Inverts the boolean value of the operand.      | `!a`       |




### Truth Table for Logical Operators

### Logical AND (`&&`):
| Operand 1 | Operand 2 | Result |
|-----------|-----------|--------|
| `true`    | `true`    | `true` |
| `true`    | `false`   | `false`|
| `false`   | `true`    | `false`|
| `false`   | `false`   | `false`|

### Logical OR (`||`):
| Operand 1 | Operand 2 | Result |
|-----------|-----------|--------|
| `true`    | `true`    | `true` |
| `true`    | `false`   | `true` |
| `false`   | `true`    | `true` |
| `false`   | `false`   | `false`|

### Logical NOT (`!`):
| Operand | Result |
|---------|--------|
| `true`  | `false`|
| `false` | `true` |



**Example:**


```java
boolean a = true;
boolean b = false;
System.out.println(a && b); // Output: false
```

---

## 4. Bitwise Operators

Bitwise operators are used to perform operations on binary representations of integers. These operators work at the bit level and are primarily used for low-level programming, such as manipulating data in memory or handling binary flags.



### List of Bitwise Operators

| Operator | Name                  | Description                                     | Example   |
|----------|-----------------------|-------------------------------------------------|-----------|
| `&`      | Bitwise AND           | Performs a logical AND operation on each bit.  | `a & b`   |
| `|`      | Bitwise OR            | Performs a logical OR operation on each bit.   | `a | b`   |
| `^`      | Bitwise XOR           | Performs a logical XOR operation on each bit.  | `a ^ b`   |
| `~`      | Bitwise Complement    | Inverts all the bits of the operand.           | `~a`      |
| `<<`     | Left Shift            | Shifts the bits of the number to the left.     | `a << 2`  |
| `>>`     | Right Shift           | Shifts the bits of the number to the right.    | `a >> 2`  |
| `>>>`    | Unsigned Right Shift  | Shifts the bits to the right with zero fill.   | `a >>> 2` |


**Example:**

```java
a = 5 (0101)
b = 3 (0011)
a & b => 1 (0001)
a | b => 7 (0111)
a ^ b => 6 (0110)
~a => -6 (inverts bits)
a << 1 => 10 (1010)
a >> 1 => 2 (0010)
```

---

## 5. Assignment Operators

Assignment operators are used to assign values to variables. They can also perform operations and assign the result in a single step.



### List of Assignment Operators

| Operator | Description              | Example        |
|----------|--------------------------|----------------|
| `=`      | Simple assignment        | `a = b`        |
| `+=`     | Add and assign           | `a += b`       |
| `-=`     | Subtract and assign      | `a -= b`       |
| `*=`     | Multiply and assign      | `a *= b`       |
| `/=`     | Divide and assign        | `a /= b`       |
| `%=`     | Modulus and assign       | `a %= b`       |
| `&=`     | Bitwise AND and assign   | `a &= b`       |
| `\|=`    | Bitwise OR and assign    | `a \|= b`      |
| `^=`     | Bitwise XOR and assign   | `a ^= b`       |
| `<<=`    | Left shift and assign    | `a <<= 2`      |
| `>>=`    | Right shift and assign   | `a >>= 2`      |
| `>>>=`   | Unsigned right shift and assign | `a >>>= 2` |


**Example:**

```java
a = 10
b = 5
a += b => a = 15
a -= b => a = 10
a *= b => a = 50
a /= b => a = 10
a %= b => a = 0
```

---

## Operator Precedence
Operator precedence defines the order in which operators are evaluated. Operators with
higher precedence are evaluated before those with lower precedence. The following table shows the operators in Java in order of precedence, from highest to lowest. Operators on the same line have the same precedence.

| Precedence Level | Operator(s)                         | Description                                       |
|-------------------|-------------------------------------|--------------------------------------------------|
| 1 (Highest)       | `()`                               | Parentheses for grouping                         |
| 2                 | `[]`, `.`, `::`                   | Array access, member access, method reference    |
| 3                 | `++`, `--`                        | Postfix increment and decrement                 |
| 4                 | `++`, `--`, `+`, `-`, `~`, `!`    | Prefix increment, decrement, unary plus/minus, logical NOT, bitwise NOT |
| 5                 | `(type)`                          | Type cast                                       |
| 6                 | `*`, `/`, `%`                     | Multiplication, division, modulus               |
| 7                 | `+`, `-`                          | Addition, subtraction                           |
| 8                 | `<<`, `>>`, `>>>`                 | Bitwise shift operators                         |
| 9                 | `<`, `<=`, `>`, `>=`, `instanceof` | Relational operators and type comparison        |
| 10                | `==`, `!=`                        | Equality and inequality                         |
| 11                | `&`                               | Bitwise AND                                     |
| 12                | `^`                               | Bitwise XOR                                     |
| 13                | `|`                               | Bitwise OR                                      |
| 14                | `&&`                              | Logical AND                                     |
| 15                | `||`                              | Logical OR                                      |
| 16                | `?:`                              | Ternary conditional operator                   |
| 17                | `=`, `+=`, `-=`, `*=`, `/=`, etc. | Assignment operators                           |


**Example:**
```java
int a = 5, b = 2, c = 3;
int result = a + b * c;  // Multiplication (*) has higher precedence than addition (+)
System.out.println(result); // Output: 11
```


---

## Operator Associativity

Associativity determines the direction of evaluation when two operators of the same precedence appear in an expression. Operators can be **left-to-right** or **right-to-left** associative.

| Operator(s)                    | Associativity  | Example                                       |
|--------------------------------|----------------|-----------------------------------------------|
| `++`, `--` (Postfix)           | Left-to-right  | `a++ + b--` is evaluated left to right.       |
| `++`, `--`, `+`, `-`, `~`, `!` | Right-to-left  | `++a + --b` is evaluated right to left.       |
| `*`, `/`, `%`                  | Left-to-right  | `a * b / c` evaluates as `(a * b) / c`.       |
| `+`, `-`                       | Left-to-right  | `a + b - c` evaluates as `(a + b) - c`.       |
| `<<`, `>>`, `>>>`              | Left-to-right  | `a << b >> c` evaluates as `(a << b) >> c`.   |
| `<`, `<=`, `>`, `>=`, `instanceof` | Left-to-right | `a < b > c` is invalid but evaluates leftward. |
| `==`, `!=`                     | Left-to-right  | `a == b != c` is invalid but evaluates leftward. |
| `&`, `^`, `|`                  | Left-to-right  | Bitwise AND, XOR, OR follow leftward order.   |
| `&&`, `||`                     | Left-to-right  | `a && b || c` evaluates as `(a && b) || c`.   |
| `?:`                           | Right-to-left  | `a ? b : c ? d : e` evaluates right to left.  |
| `=`, `+=`, `-=`, etc.          | Right-to-left  | `a = b += c` evaluates right to left.         |

---

**Example:**
```java
int a = 10, b = 5, c = 2;
int result = a - b - c;  // Subtraction is left-to-right associative
// Equivalent to: (a - b) - c
System.out.println(result); // Output: 3

```

## Key Points to Remember
- Operators with higher precedence are evaluated before those with lower precedence.
- Operators with the same precedence are evaluated according to their associativity.
- Use parentheses to explicitly control the order of evaluation when needed.

---

## Conclusion
Understanding the different types of operators in Java is crucial for effective programming.Each operator serves a unique purpose, and knowing how to use them can significantly enhance your coding skills.This document has provided a detailed overview of arithmetic, relational, logical, bitwise, and assignment operators, complete with diagrams and tables for clarity.


