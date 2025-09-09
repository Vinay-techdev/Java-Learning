# 📖 Chapter 01 – Java Basics

Welcome to **Chapter 01** of your Java learning journey! 🚀
This chapter introduces you to the **fundamentals of Java programming** – the building blocks you’ll need before diving deeper into object-oriented concepts and advanced topics.

---

## 🛠 1. Setup Eclipse

Eclipse is one of the most popular IDEs for Java development.

### Installation Steps:

1. Download Eclipse IDE from [eclipse.org](https://www.eclipse.org/downloads/).
2. Install and open Eclipse.
3. Select a **workspace folder** where all your projects will be saved.
4. Create a **new Java project**:

   * Go to **File → New → Java Project**
   * Give it a name (e.g., `learning`)
   * Click **Finish**
5. Create a **package** (optional but recommended):

   * Right-click `src` → **New → Package**
   * Name it `chapter_01`
6. Create a **Java class**:

   * Right-click the package → **New → Class**
   * Name it `Main` and check **public static void main(String\[] args)** option.

✅ You’re now ready to start coding!

---

## 🖥 2. Run First Program

Here’s a simple **Hello World** program:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

* `System.out.println()` → prints text to console.
* **Run** the program by clicking ▶ (Run button) or pressing `Ctrl + F11`.

---

## 💬 3. Comments in Java

Comments are ignored by the compiler and help make code readable.

* **Single-line comment**

```java
// This is a single-line comment
```

* **Multi-line comment**

```java
/* 
This is a multi-line comment
You can write multiple lines here
*/
```

* **Documentation comment**

```java
/**
 * This is a documentation comment
 * It is used to generate JavaDocs
 */
```

---

## 📦 4. Variables and Data Types

Variables store data in memory.

### Syntax:

```java
type variableName = value;
```

### Primitive Data Types:

| Type    | Size    | Example                     |
| ------- | ------- | --------------------------- |
| byte    | 1 byte  | `byte b = 100;`             |
| short   | 2 bytes | `short s = 30000;`          |
| int     | 4 bytes | `int age = 21;`             |
| long    | 8 bytes | `long bigNum = 123456789L;` |
| float   | 4 bytes | `float pi = 3.14f;`         |
| double  | 8 bytes | `double g = 9.81;`          |
| char    | 2 bytes | `char letter = 'A';`        |
| boolean | 1 bit   | `boolean isJavaFun = true;` |

---

## 🔢 5. Literals

Literals represent fixed values assigned to variables.

Examples:

```java
int x = 10;         // Integer literal
float y = 3.14f;    // Floating-point literal
char c = 'A';       // Character literal
boolean b = true;   // Boolean literal
String s = "Java";  // String literal
```

---

## 🧑‍💻 6. User Input

Java uses `Scanner` class to take input from user.

Example:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Hello " + name + ", you are " + age + " years old.");
    }
}
```

---

## ➕ 7. Operators and Expressions

Operators perform operations on variables and values.

| Operator Type | Example           | Description          |              |              |
| ------------- | ----------------- | -------------------- | ------------ | ------------ |
| Arithmetic    | `+ - * / %`       | Math operations      |              |              |
| Relational    | `== != > < >= <=` | Compare values       |              |              |
| Logical       | \`&&              |                      | !\`          | AND, OR, NOT |
| Assignment    | `= += -= *= /=`   | Assign values        |              |              |
| Unary         | `++ --`           | Increment, Decrement |              |              |
| Bitwise       | \`&               | ^ \~ << >>\`         | Work on bits |              |

Example:

```java
int a = 10, b = 20;
int sum = a + b; // 30
boolean check = a < b; // true
```

---

## 🔄 8. Associativity

Associativity defines **order of evaluation** for operators with the same precedence.

Example:

```java
int result = 10 + 5 * 2;  // Multiplication has higher precedence → result = 20
int x = 10, y = 5;
int z = x++ + ++y;  // Associativity of ++ is right-to-left
```

📌 **Important:**

* `* / %` have higher precedence than `+ -`.
* Assignment operators (`=, +=, -=`) are **right-associative**.

---

## ✅ Summary

* You learned how to set up Eclipse and run your first Java program.
* You understood variables, data types, literals, and operators.
* You learned to take user input and understood operator precedence.

This chapter sets a strong foundation for **Strings, Conditionals, and Loops** in the next chapter. 🚀