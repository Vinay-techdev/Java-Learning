# 📖 Chapter 06 – Inheritance & Polymorphism

In this chapter, we explore **Inheritance** and **Polymorphism**, which allow code reusability and flexibility. You’ll also learn how constructors work in inheritance, how to use `super` and `this`, and how **dynamic method dispatch** works in Java.

---

## 🧬 1. Inheritance

Inheritance allows one class (child/subclass) to **acquire properties and methods** of another class (parent/superclass).
It promotes **code reusability** and **modularity**.

### Syntax:

```java
class Parent {
    void display() {
        System.out.println("I am Parent");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("I am Child");
    }
}

public class Main {
    public static void main(String[] args) {
        Child c = new Child();
        c.display(); // inherited from Parent
        c.show();    // defined in Child
    }
}
```

---

## 🏗 2. Constructors in Inheritance

* When you create a **child object**, the **parent constructor is called first**.
* If no constructor is explicitly written in the parent, Java provides a **default constructor**.

Example:

```java
class Parent {
    Parent() {
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Child Constructor");
    }
}

public class Main {
    public static void main(String[] args) {
        Child c = new Child();
    }
}
```

**Output:**

```
Parent Constructor
Child Constructor
```

---

## 🆚 3. `super` and `this`

### `super` Keyword

Used to:

1. Call **parent class constructor**
2. Access **parent class methods/variables**

Example:

```java
class Parent {
    int x = 10;
    Parent() {
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent {
    int x = 20;

    Child() {
        super(); // calls Parent constructor (optional if parent has default constructor)
        System.out.println("Child Constructor");
    }

    void display() {
        System.out.println("Child x = " + x);
        System.out.println("Parent x = " + super.x); // Access parent variable
    }
}

public class Main {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}
```

---

### `this` Keyword

Used to:

1. Refer to **current object**
2. Call another constructor in the **same class**

Example:

```java
class Student {
    String name;
    int age;

    Student() {
        this("Unknown", 0); // Calls parameterized constructor
    }

    Student(String name, int age) {
        this.name = name;  // Refers to current object
        this.age = age;
    }

    void display() {
        System.out.println(name + " - " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Alice", 22);

        s1.display();
        s2.display();
    }
}
```

---

## 🔄 4. Method Overriding

Method overriding allows a **subclass** to provide its **own implementation** of a method already defined in the **parent class**.

### Rules:

* Same **method name**
* Same **return type** (or covariant type)
* Same **parameter list**
* Cannot have **lower access level** than parent method

Example:

```java
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound(); // Dog barks
    }
}
```

---

## 🔀 5. Dynamic Method Dispatch

Also known as **Runtime Polymorphism**.
It occurs when a **parent class reference** points to a **child class object**, and the **overridden method** that gets executed is determined **at runtime**.

Example:

```java
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a;  // Parent reference
        a = new Dog();
        a.sound(); // Dog barks

        a = new Cat();
        a.sound(); // Cat meows
    }
}
```

🔑 **Key Takeaway:**

* Method call is resolved **at runtime**, not compile time.
* This is how **polymorphism** works in Java.

---

## ✅ Summary

* **Inheritance** allows sharing attributes/methods between classes.
* **Parent constructor** is always called before child constructor.
* **super** is used for parent access, **this** is for current object.
* **Method overriding** lets subclasses redefine parent methods.
* **Dynamic method dispatch** enables **runtime polymorphism**.