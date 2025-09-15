# 📖 Chapter 04 – Methods (Advanced) & Recursion

This chapter deepens your understanding of **methods** in Java. You will learn about **parameters**, **void return types**, **static methods**, **varArgs**, and **recursion**.

---

## 🎯 1. Parameters and Arguments

### **Parameters**

Variables that appear in a method’s declaration (definition).

### **Arguments**

Actual values passed to the method when it is called.

### Example:

```java
public class Main {
    static void greet(String name) {  // name = parameter
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
        greet("Alice");  // "Alice" = argument
        greet("Bob");
    }
}
```

🔑 **Key Point:**

* **Parameters** are placeholders
* **Arguments** are real data passed during method call

---

## 🏷 2. Void Return Type

If a method **does not return any value**, use the keyword `void`.

Example:

```java
static void printMessage() {
    System.out.println("This method returns nothing!");
}

public static void main(String[] args) {
    printMessage();
}
```

---

## 🧊 3. Static Methods

A `static` method belongs to the **class** rather than an **object**.
It can be called **without creating an object** of the class.

### Example:

```java
public class Main {
    static void display() {
        System.out.println("I am a static method!");
    }

    public static void main(String[] args) {
        display(); // No object required
    }
}
```

🔑 **Key Point:**

* `main()` itself is a **static method** because JVM calls it without creating an object.
* Static methods can only access **static variables** directly.

---

## 🔄 4. Method Overloading (Revisited)

Method overloading allows **multiple methods** with the **same name** but **different parameters** (type or number).

Example:

```java
static void display(String msg) {
    System.out.println("Message: " + msg);
}

static void display(int num) {
    System.out.println("Number: " + num);
}

public static void main(String[] args) {
    display("Hello");
    display(42);
}
```

---

## 📦 5. Variable Arguments (varArgs)

When you don’t know how many arguments will be passed, use **varArgs**.

Syntax:

```java
returnType methodName(type... variableName)
```

### Example:

```java
static int sum(int... numbers) {
    int result = 0;
    for (int n : numbers) {
        result += n;
    }
    return result;
}

public static void main(String[] args) {
    System.out.println(sum(10, 20));           // 30
    System.out.println(sum(5, 10, 15, 20));   // 50
}
```

🔑 **Rules for varArgs:**

* Only **one varArg** is allowed in a method.
* It **must be the last parameter** in the parameter list.

---

## 🔁 6. Recursion

**Recursion** is when a method **calls itself** to solve a problem.

### Example – Factorial:

```java
static int factorial(int n) {
    if (n == 0 || n == 1) {
        return 1; // Base case
    }
    return n * factorial(n - 1); // Recursive call
}

public static void main(String[] args) {
    System.out.println(factorial(5)); // 120
}
```

🔑 **Key Points:**

* Every recursion must have a **base case** to prevent infinite calls.
* Used in problems like **factorial, Fibonacci, tree traversal, backtracking**.

---

## ✅ Summary

* **Parameters** are placeholders; **arguments** are real data.
* `void` methods do not return a value.
* **Static methods** can be called without creating objects.
* **Method overloading** allows multiple versions of a method.
* **varArgs** lets you pass variable number of arguments.
* **Recursion** is powerful but must have a **base case** to avoid infinite loops.