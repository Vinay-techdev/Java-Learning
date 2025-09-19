# 📖 Chapter 07 – Abstract Classes & Interfaces

This chapter covers **abstraction in depth**, including **abstract classes, interfaces, default methods, and polymorphism using interfaces**. These are key tools to design **flexible and scalable applications**.

---

## 🏛 1. Abstract Class & Methods

An **abstract class** is a class that **cannot be instantiated**.
It can have **abstract methods** (without body) and **non-abstract methods** (with body).

### Syntax:

```java
abstract class Shape {
    abstract void draw();  // abstract method
    void info() {          // concrete method
        System.out.println("This is a shape");
    }
}
```

### Example:

```java
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape s = new Circle(); // Parent reference, child object
        s.draw();
    }
}
```

🔑 **Key Points:**

* You **cannot create objects** of an abstract class.
* You **must override** abstract methods in the subclass.
* Abstract class can have **constructors, variables, and concrete methods** too.

---

## 🔗 2. Interfaces

An **interface** is like a **contract** — it defines methods that a class must implement.

### Syntax:

```java
interface Animal {
    void sound();  // implicitly public & abstract
}
```

### Example:

```java
interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
    }
}
```

🔑 **Key Points:**

* All methods in interface are **public & abstract** by default.
* A class uses `implements` to implement an interface.
* A class can **implement multiple interfaces** (solves multiple inheritance issue).

---

## ⚖ 3. Interfaces vs Abstract Classes

| Feature          | Abstract Class                                     | Interface                                          |
| ---------------- | -------------------------------------------------- | -------------------------------------------------- |
| **Methods**      | Can have abstract + concrete methods               | All methods are abstract (till Java 7)             |
| **Constructors** | Can have constructors                              | Cannot have constructors                           |
| **Variables**    | Can have instance variables                        | Only `public static final` (constants)             |
| **Inheritance**  | A class can extend only 1 abstract class           | A class can implement multiple interfaces          |
| **Use Case**     | When you want **partial abstraction** + code reuse | When you want **100% abstraction** (behavior-only) |

---

## ⚙ 4. Default Methods in Interface (Java 8+)

Interfaces can have **default methods** with implementation.
This helps avoid breaking existing code when new methods are added to an interface.

Example:

```java
interface Animal {
    void sound();

    default void info() {
        System.out.println("This is an animal");
    }
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.info(); // default method from interface
    }
}
```

---

## 🔄 5. Inheritance in Interface

An interface can **extend** another interface.

Example:

```java
interface Animal {
    void sound();
}

interface Pet extends Animal {
    void play();
}

class Dog implements Pet {
    public void sound() {
        System.out.println("Dog barks");
    }

    public void play() {
        System.out.println("Dog plays fetch");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.play();
    }
}
```

---

## 🎭 6. Polymorphism with Interfaces

You can use **interface references** to achieve **runtime polymorphism**.

Example:

```java
interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat implements Animal {
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a; // Interface reference

        a = new Dog();
        a.sound(); // Dog barks

        a = new Cat();
        a.sound(); // Cat meows
    }
}
```

🔑 **Key Point:**

* This is similar to **dynamic method dispatch** with classes, but uses interfaces.
* Very useful for writing **flexible, extensible code** (e.g., strategy pattern).

---

## ✅ Summary

* **Abstract classes** provide partial abstraction (can have both abstract and concrete methods).
* **Interfaces** provide full abstraction and support **multiple inheritance**.
* **Default methods** allow interfaces to evolve without breaking existing code.
* Interfaces can **extend other interfaces** and be used for **polymorphism**.