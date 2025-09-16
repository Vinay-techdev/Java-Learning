# 📖 Chapter 05 – Object-Oriented Programming (OOP)

This chapter introduces **Object-Oriented Programming (OOP)** – the heart of Java. You’ll learn about **classes, objects, constructors, access modifiers, and key OOP principles**.

---

## 🏗 1. Classes and Objects

### **Class**

A **class** is a blueprint that defines **attributes** (variables) and **methods** (functions).

### **Object**

An **object** is an instance of a class. It represents **real-world entities**.

---

### Example: Creating a Class & Object

```java
class Student {
    // Attributes (fields)
    String name;
    int age;

    // Method
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        // Object creation
        Student s1 = new Student();
        s1.name = "Alice";
        s1.age = 20;
        s1.displayInfo();

        Student s2 = new Student();
        s2.name = "Bob";
        s2.age = 22;
        s2.displayInfo();
    }
}
```

---

## 📚 2. OOP Terminology Overview

| Concept           | Meaning                                                                                           | Example                                                                                     |
| ----------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| **Abstraction**   | Hiding internal implementation, showing only functionality.                                       | Using `Scanner sc = new Scanner(System.in);` – you don’t know how input is read internally. |
| **Encapsulation** | Wrapping data (attributes) and methods in a single unit (class) & restricting direct access.      | Using **private variables** with getters/setters.                                           |
| **Inheritance**   | One class can **acquire properties & methods** of another class using `extends`.                  | `class Dog extends Animal {}`                                                               |
| **Polymorphism**  | Ability to take many forms – method **overloading** (compile-time) and **overriding** (run-time). | Same method name but different behavior.                                                    |

---

## 🔐 3. Access Modifiers

Access modifiers control **visibility** of variables and methods.

| Modifier    | Visible To                | Example                    |
| ----------- | ------------------------- | -------------------------- |
| `public`    | Everywhere                | Accessible from any class  |
| `private`   | Within same class only    | Used for **encapsulation** |
| `protected` | Same package + subclasses | Used in inheritance        |
| *(default)* | Same package only         | No keyword needed          |

---

### Getters and Setters (Encapsulation)

```java
class Employee {
    private int id;         // private attribute
    private String name;

    // Getter
    public int getId() {
        return id;
    }

    // Setter
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setId(101);
        e.setName("Alice");

        System.out.println("ID: " + e.getId());
        System.out.println("Name: " + e.getName());
    }
}
```

✅ **Why use Getters & Setters?**

* Provide **controlled access** to private data
* Can perform validation before assigning values

---

## 🏗 4. Constructors

A **constructor** is a special method that initializes objects.

### Key Points:

* Same name as the class
* No return type (not even `void`)
* Called **automatically** when object is created

Example:

```java
class Student {
    String name;
    int age;

    // Constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 20);  // Constructor is called
        s1.display();
    }
}
```

---

## 🌀 5. Constructor Overloading

Like methods, **constructors can be overloaded** by changing the number or type of parameters.

Example:

```java
class Student {
    String name;
    int age;

    // Constructor 1
    Student() {
        name = "Unknown";
        age = 0;
    }

    // Constructor 2
    Student(String n) {
        name = n;
        age = 18; // default age
    }

    // Constructor 3
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Alice");
        Student s3 = new Student("Bob", 22);

        s1.display();
        s2.display();
        s3.display();
    }
}
```

---

## ✅ Summary

* **Classes** define attributes & methods, **objects** are instances.
* Learned key OOP principles: **Abstraction, Encapsulation, Inheritance, Polymorphism**.
* **Access modifiers** control visibility of variables/methods.
* **Getters/Setters** provide controlled access to private data.
* **Constructors** initialize objects automatically and can be **overloaded**.