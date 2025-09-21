### 📖 **Chapter 09 – Multithreading in Java**

Multithreading allows Java programs to perform **multiple tasks simultaneously**, improving performance and responsiveness.

---

### **1️⃣ What is Multithreading?**

* **Multithreading** is the ability of a program to execute multiple parts (threads) concurrently.
* Each **thread** is a lightweight sub-process with its own execution path.
* Used in games, servers, chat apps, and real-time systems.

---

### **2️⃣ Creating Threads**

There are **two main ways** to create threads in Java:

#### **a) Extending the Thread class**

```java
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();  // Start thread
    }
}
```

#### **b) Implementing the Runnable interface**

```java
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable thread running...");
    }
}

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable());
        t1.start();
    }
}
```

✅ **Runnable is preferred** in real-world projects since Java supports **multiple interface implementation** but not multiple class inheritance.

---

### **3️⃣ Basic Thread Methods**

* `start()` → starts a new thread
* `run()` → contains the thread’s task (called internally by start)
* `sleep(ms)` → pauses thread for given milliseconds
* `join()` → waits for a thread to finish before continuing
* `getName()` & `setName()` → get/set thread name
* `getPriority()` & `setPriority()` → manage thread priority
* `isAlive()` → check if thread is running

---

### **4️⃣ Thread Life Cycle**

1. **New** → Thread object is created
2. **Runnable** → Thread is ready to run (after calling `start()`)
3. **Running** → Thread is actually executing
4. **Waiting/Timed Waiting** → Thread is paused
5. **Terminated** → Thread execution completed

---

### **5️⃣ Thread Priority**

* Each thread has a **priority** (range: 1 to 10).
* `Thread.MIN_PRIORITY` (1) → Lowest
* `Thread.NORM_PRIORITY` (5) → Default
* `Thread.MAX_PRIORITY` (10) → Highest

Threads with higher priority are **more likely** to be executed first (but not guaranteed).

---

### **6️⃣ Example Program**

```java
class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " → " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("Thread-1");
        t2.setName("Thread-2");

        t1.start();
        t2.start();

        t1.join(); // wait for t1 to finish
        t2.join(); // wait for t2 to finish

        System.out.println("Main thread finished.");
    }
}
```

---


## ✅ Summary

* **Multithreading** → Allows a program to run multiple tasks (threads) at the same time.
* **Creating Threads** →
  1️⃣ Extending `Thread` class
  2️⃣ Implementing `Runnable` interface (preferred)
* **Thread Methods** → `start()`, `run()`, `sleep()`, `join()`, `isAlive()`, `setName()`, `setPriority()`
* **Thread Life Cycle** → New → Runnable → Running → Waiting/Timed Waiting → Terminated
* **Thread Priority** → Controls which thread gets more CPU time (`MIN_PRIORITY = 1`, `NORM_PRIORITY = 5`, `MAX_PRIORITY = 10`)

---