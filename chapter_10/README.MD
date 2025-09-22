# 📖 **Chapter 10 – Exception Handling**

Exception Handling is one of the most powerful features in Java.
It allows a program to deal with **runtime errors** gracefully without crashing.

---

## **1️⃣ Types of Errors**

In Java, errors can be classified into three main types:

* **Compile-time Errors**
  Occur when code violates Java syntax rules.
  Example: Missing semicolon, using undeclared variables.

  ```java
  int a = 10
  System.out.println(a);  // ❌ Missing semicolon (compile-time error)
  ```

* **Logical Errors**
  Program runs but gives wrong output due to incorrect logic.

  ```java
  int a = 5, b = 0;
  int result = a + b;  // ✅ Runs fine, but logic is wrong if we wanted multiplication
  ```

* **Runtime Errors (Exceptions)**
  Occur while program is running, cause abnormal termination if not handled.

  ```java
  int a = 10, b = 0;
  int c = a / b;  // ❌ ArithmeticException (runtime error)
  ```

---

## **2️⃣ try-catch Block**

The basic way to handle exceptions is using **try-catch**.

```java
try {
    int a = 10 / 0;  // risky code
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero!");
}
```

✅ Output: `Cannot divide by zero!` (Program does not crash)

---

## **3️⃣ Handling Specific Exceptions**

You can use **multiple catch blocks** for different exceptions.

```java
try {
    int arr[] = {1, 2, 3};
    System.out.println(arr[5]);
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Array index is invalid!");
} catch (Exception e) {
    System.out.println("Some other error occurred");
}
```

---

## **4️⃣ Nested try-catch**

You can place `try-catch` blocks inside each other to handle complex scenarios.

```java
try {
    try {
        int a = 10 / 0;
    } catch (ArithmeticException e) {
        System.out.println("Handled inside inner try");
    }
} catch (Exception e) {
    System.out.println("Outer catch handled");
}
```

---

## **5️⃣ Exception Class Hierarchy**

All exceptions in Java are objects derived from the **Throwable** class.

```
Throwable
 ├── Exception (Checked exceptions)
 │    └── RuntimeException (Unchecked exceptions)
 └── Error (Serious issues, e.g. OutOfMemoryError)
```

---

## **6️⃣ throw vs throws**

* **throw** → Used to explicitly throw an exception.
* **throws** → Declares that a method may throw an exception.

Example:

```java
void myMethod() throws IOException {
    throw new IOException("Device error");
}
```

---

## **7️⃣ finally Block**

The **finally block** is always executed, even if an exception occurs.

```java
try {
    int a = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Exception caught");
} finally {
    System.out.println("Finally block always runs");
}
```

✅ Output:

```
Exception caught
Finally block always runs
```

---

## **8️⃣ Why Exception Handling is Important**

* Prevents program crash
* Provides better user experience
* Helps debugging with detailed error messages
* Allows graceful recovery from unexpected situations

---

This makes your program **robust and production-ready** ✅

---