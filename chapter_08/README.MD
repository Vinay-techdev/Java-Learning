# 📖 Chapter 08 – Compiler, Interpreter & Packages

This chapter covers **how Java runs programs** and how to organize your code using **packages**.

---

## 🖥 1. Java Compiler & Interpreter

Java uses both a **compiler** and an **interpreter** – this is why it’s called a **compiled + interpreted language**.

### 🔧 Process:

1. **Compilation**

   * `javac MyProgram.java` → Converts `.java` file into **bytecode** (`.class` file).
   * Bytecode is **platform-independent** – you can run it on any machine with JVM.

2. **Interpretation**

   * `java MyProgram` → **JVM interprets bytecode** (or uses JIT compiler for faster execution) and runs it on your OS.

📌 **In short:**
Java is **Write Once, Run Anywhere (WORA)** because the JVM makes bytecode work on any platform.

---

## 📦 2. Packages

A **package** is a way to **group related classes** together.
It’s like folders on your computer — helps organize code, avoid name conflicts, and reuse classes.

---

### 🔹 Built-in Packages

Java already has many built-in packages:

| Package     | Purpose                              |
| ----------- | ------------------------------------ |
| `java.util` | Utility classes (Scanner, ArrayList) |
| `java.io`   | Input/Output (File handling)         |
| `java.sql`  | Database operations                  |
| `java.time` | Date & Time API                      |
| `java.net`  | Networking                           |

Example:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name);
    }
}
```

---

### 🔹 User-Defined Packages

You can **create your own package**.

---

### 🛠 Steps to Create & Run Package

#### **Folder Structure**

Suppose you are in `chapter_08` folder:

```
chapter_08/
 └── cricket/
      ├── Virat.java
      ├── ABD.java
      └── Hardik.java
```

---

### **1️⃣ Write Classes with Package Statement**

Example – `Virat.java`:

```java
package cricket;

public class Virat {
    public void stats() {
        System.out.println("Virat: 80 centuries");
    }
}
```

Similarly for `ABD.java` and `Hardik.java` (same `package cricket;` line at top).

---

### **2️⃣ Compile Classes**

Navigate to `chapter_08` in terminal and run:

```bash
javac -d . cricket/*.java
```

✅ **What happens?**

* `-d .` → tells compiler to put `.class` files inside correct package folder.
* A new `cricket` folder will be created (inside `chapter_08` if not already present).

---

### **3️⃣ Delete Old Package Folder Before Running Again**

📝 **IMPORTANT NOTE:**
If your folder already has `chapter_08/cricket/cricket/` (nested cricket folder), **delete the inner one** before running the above command — otherwise you’ll get **duplicate cricket folder** (like `cricket/cricket/`) and imports will break.

---

### **4️⃣ Create Main Class to Use Package**

`Main.java` (outside `cricket` folder):

```java
import cricket.Virat;
import cricket.ABD;

public class Main {
    public static void main(String[] args) {
        Virat v = new Virat();
        v.stats();

        ABD a = new ABD();
        a.stats();
    }
}
```

---

### **5️⃣ Run Program**

```bash
javac Main.java
java Main
```

You should see output from both classes.

---

### 🏆 Advantages of Packages

✅ Better **code organization**
✅ Avoids **name conflicts**
✅ Easier to **maintain & reuse** code
✅ Makes projects more **scalable**

---

## ✅ Summary

* **Java Compiler (javac)** → converts source code into platform-independent bytecode.
* **JVM Interpreter** → runs bytecode on any OS.
* **Packages** organize code into folders and allow reusability.
* Use `javac -d . *.java` to generate class files inside package folder.
* Delete old package folder before recompiling to avoid duplicates.