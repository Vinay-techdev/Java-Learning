# 📖 Chapter 03 – Arrays & Methods

In this chapter, we explore **arrays**, how to **store and access multiple values**, and understand **methods** and **method overloading** in Java.

---

## 🗂 1. Arrays

An **array** is a container that holds **multiple values of the same type**.

### Syntax:

```java
type[] arrayName = new type[size];
```

### Example:

```java
int[] numbers = new int[5]; // array of size 5
numbers[0] = 10;
numbers[1] = 20;
numbers[2] = 30;
numbers[3] = 40;
numbers[4] = 50;

System.out.println(numbers[0]); // 10
```

You can also initialize directly:

```java
int[] numbers = {10, 20, 30, 40, 50};
```

---

## 👀 2. Displaying Arrays

### **Using for loop**

```java
int[] numbers = {10, 20, 30, 40, 50};
for (int i = 0; i < numbers.length; i++) {
    System.out.println("Element at index " + i + ": " + numbers[i]);
}
```

### **Using for-each loop**

```java
int[] numbers = {10, 20, 30, 40, 50};
for (int num : numbers) {
    System.out.println(num);
}
```

---

## 🌐 3. Multidimensional Arrays

Arrays can have **more than one dimension**. The most common is a **2D array**.

### Syntax:

```java
type[][] arrayName = new type[rows][columns];
```

### Example:

```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}
```

### **Using for-each loop**

```java
for (int[] row : matrix) {
    for (int value : row) {
        System.out.print(value + " ");
    }
    System.out.println();
}
```

---

## 🛠 4. Methods

A **method** is a block of code that performs a specific task. Methods **avoid repetition** and make code modular.

### Syntax:

```java
returnType methodName(parameters) {
    // method body
    return value; // if returnType is not void
}
```

### Example:

```java
public class Main {
    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int sum = add(5, 10);
        System.out.println("Sum: " + sum);
    }
}
```

---

## 🔄 5. Method Overloading

**Method overloading** allows multiple methods to have the **same name** but **different parameters** (number or type).

### Example:

```java
public class Main {
    static int multiply(int a, int b) {
        return a * b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        System.out.println(multiply(5, 10));     // calls int version
        System.out.println(multiply(2.5, 4.0));  // calls double version
    }
}
```

🔑 **Rules:**

* Same method name
* Different number or type of parameters
* Return type can be same or different

---

## ✅ Summary

* Arrays store multiple values of the same type and can be **single or multidimensional**.
* **for** and **for-each loops** help traverse arrays efficiently.
* Methods help in **modular programming** and **reusability**.
* **Method overloading** allows defining **multiple versions** of a method with the same name but different parameters.

---