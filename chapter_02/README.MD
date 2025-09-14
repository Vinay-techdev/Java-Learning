# 📖 Chapter 02 – Strings, Conditionals & Loops

In this chapter, we dive deeper into **strings**, learn how to control the **flow of execution** using conditionals, and repeat tasks using **loops**.

---

## 🧵 1. Strings & Immutability

A **String** in Java is a sequence of characters.
Strings are **immutable**, meaning once created, they **cannot be changed**.

Example:

```java
public class Main {
    public static void main(String[] args) {
        String s1 = "Java";
        s1.concat(" Programming"); // This does NOT change s1
        System.out.println(s1);    // Output: Java

        s1 = s1.concat(" Programming"); // Now we reassign it
        System.out.println(s1);    // Output: Java Programming
    }
}
```

🔑 **Key point:** Any modification (like `concat`, `replace`) creates a **new String object**.

---

## 🛠 2. Common String Methods

| Method               | Example                           | Result   |
| -------------------- | --------------------------------- | -------- |
| `length()`           | `"Java".length()`                 | `4`      |
| `charAt(i)`          | `"Java".charAt(1)`                | `'a'`    |
| `substring(a,b)`     | `"Java".substring(1,3)`           | `"av"`   |
| `toUpperCase()`      | `"Java".toUpperCase()`            | `"JAVA"` |
| `toLowerCase()`      | `"Java".toLowerCase()`            | `"java"` |
| `equals()`           | `"Java".equals("java")`           | `false`  |
| `equalsIgnoreCase()` | `"Java".equalsIgnoreCase("java")` | `true`   |
| `contains()`         | `"Java".contains("va")`           | `true`   |
| `startsWith()`       | `"Java".startsWith("Ja")`         | `true`   |
| `endsWith()`         | `"Java".endsWith("va")`           | `true`   |
| `trim()`             | `"  Java  ".trim()`               | `"Java"` |
| `replace()`          | `"Java".replace('a','o')`         | `"Jovo"` |

---

## 🔡 3. Escape Sequences

Escape sequences allow you to include special characters in strings.

| Escape | Meaning      | Example                                |
| ------ | ------------ | -------------------------------------- |
| `\n`   | New line     | `"Hello\nWorld"` → prints on two lines |
| `\t`   | Tab space    | `"Hello\tWorld"`                       |
| `\\`   | Backslash    | `"C:\\Program Files"`                  |
| `\"`   | Double Quote | `"He said \"Java is fun\""`            |
| `\'`   | Single Quote | `"It\'s Java"`                         |

---

## 🔀 4. Conditional Statements

Conditionals allow decisions based on conditions.

### **if-else Statement**

```java
int age = 20;
if (age >= 18) {
    System.out.println("You are an adult");
} else {
    System.out.println("You are a minor");
}
```

### **if-else-if Ladder**

```java
int marks = 85;
if (marks >= 90) {
    System.out.println("Grade: A+");
} else if (marks >= 75) {
    System.out.println("Grade: A");
} else {
    System.out.println("Grade: B");
}
```

### **switch-case Statement**

```java
int day = 3;
switch (day) {
    case 1: System.out.println("Monday"); break;
    case 2: System.out.println("Tuesday"); break;
    case 3: System.out.println("Wednesday"); break;
    default: System.out.println("Invalid day");
}
```

---

## 🔁 5. Loops

Loops are used to **repeat tasks** until a condition is false.

### **for Loop**

```java
for (int i = 1; i <= 5; i++) {
    System.out.println("Count: " + i);
}
```

### **while Loop**

```java
int i = 1;
while (i <= 5) {
    System.out.println("Count: " + i);
    i++;
}
```

### **do-while Loop**

```java
int i = 1;
do {
    System.out.println("Count: " + i);
    i++;
} while (i <= 5);
```

🔑 **Difference:**

* `while` → condition is checked **before** loop body executes.
* `do-while` → loop body executes **at least once** before checking condition.

---

## ✅ Summary

* Strings are **immutable**; methods return a **new object**.
* You learned **String methods** for manipulating text.
* You understood **escape sequences** for formatting.
* You learned **if-else**, **switch**, and all types of **loops** to control flow.

Next chapter will cover **functions (methods), arrays, and OOP basics**. 🚀

---