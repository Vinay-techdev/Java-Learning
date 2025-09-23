# 📖 **Chapter 11 – Collections Framework**

Collections Framework is one of the most powerful parts of Java.
It provides **ready-made classes and interfaces** for storing and manipulating groups of objects efficiently.

---

## **1️⃣ Why Do We Need Collections?**

Without collections, we have to rely on **arrays**, which have some limitations:

* Fixed size (cannot grow/shrink dynamically)
* No built-in methods for searching, sorting, or removing
* Need to manually manage data

✅ **Collections solve these problems** — they are **dynamic**, easy to use, and come with **many built-in methods**.

---

## **2️⃣ Collections Hierarchy**

📊 Collections Framework Hierarchy: 

```
                java.util.Collection (Interface)
                           |
        -------------------------------------------------
        |                        |                      |
      List                     Set                    Queue
        |                        |                      |
  ----------------       ----------------       ----------------
  |              |       |              |       |              |
ArrayList     LinkedList HashSet      SortedSet PriorityQueue ArrayDeque
Vector                 (TreeSet)                
```

### 🔑 Key Points:

* **List** → Maintains order, allows duplicates (ArrayList, LinkedList, Vector)
* **Set** → No duplicates, unordered (HashSet) or sorted (TreeSet)
* **Queue** → Follows FIFO, except PriorityQueue (sorted order)
* **Deque** → Double-ended queue (ArrayDeque) — allows add/remove at both ends

---

## **3️⃣ ArrayList**

### **Introduction**

* **ArrayList** is a **dynamic array** — grows/shrinks automatically.
* Allows duplicates, maintains insertion order.
* Very commonly used for storing data dynamically.

### **Example**

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Virat");
        list.add("Rohit");
        list.add("ABD");

        System.out.println(list); // [Virat, Rohit, ABD]
    }
}
```

---

### **ArrayList Common Methods**

| **Method**              | **Description**                    |
| ----------------------- | ---------------------------------- |
| `add(E e)`              | Adds element to list               |
| `add(int index, E e)`   | Adds element at specific index     |
| `get(int index)`        | Returns element at given index     |
| `set(int index, E e)`   | Replaces element at index          |
| `remove(int index)`     | Removes element at given index     |
| `remove(Object o)`      | Removes first occurrence of object |
| `size()`                | Returns number of elements         |
| `clear()`               | Removes all elements               |
| `contains(Object o)`    | Checks if element exists           |
| `isEmpty()`             | Checks if list is empty            |
| `indexOf(Object o)`     | Returns index of first occurrence  |
| `lastIndexOf(Object o)` | Returns index of last occurrence   |

---

## **4️⃣ LinkedList**

### **Introduction**

* **LinkedList** is a **doubly-linked list** implementation.
* Faster than ArrayList for insertion/deletion (especially in middle).
* Slower for random access compared to ArrayList.

### **Example**

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.addFirst(5);
        ll.addLast(20);

        System.out.println(ll); // [5, 10, 20]
    }
}
```

---

### **LinkedList Common Methods**

| **Method**           | **Description**            |
| -------------------- | -------------------------- |
| `add(E e)`           | Adds element to end        |
| `addFirst(E e)`      | Adds element at beginning  |
| `addLast(E e)`       | Adds element at end        |
| `remove()`           | Removes first element      |
| `removeFirst()`      | Removes first element      |
| `removeLast()`       | Removes last element       |
| `getFirst()`         | Returns first element      |
| `getLast()`          | Returns last element       |
| `size()`             | Returns number of elements |
| `clear()`            | Removes all elements       |
| `contains(Object o)` | Checks if element exists   |

---

✅ **Key Difference:**

* **ArrayList** → Better for **random access** (index-based get/set)
* **LinkedList** → Better for **frequent insert/delete** in middle of list

---