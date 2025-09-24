# **Chapter 12 – Advanced Collections**

In this chapter, we explore **Deque, ArrayDeque, and Hashing-based collections (HashSet, TreeSet)**, which are crucial for both **DSA** and **real-world Java applications**.

---

## **1️⃣ Deque (Double Ended Queue)**

* **Deque** = "Double Ended Queue"
* Allows insertion & deletion from **both ends**.
* Implemented by **ArrayDeque** and **LinkedList**.

👉 Commonly used in **sliding window problems, LRU cache, palindrome checking, etc.**

---

## **2️⃣ ArrayDeque**

* **Resizable array implementation** of **Deque interface**.
* **Faster than Stack & LinkedList** for stack/queue operations.
* **No null elements allowed**.

### **Example**

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        dq.addFirst(10);
        dq.addLast(20);
        dq.addFirst(5);

        System.out.println(dq); // [5, 10, 20]
    }
}
```

---

### **Deque vs ArrayDeque**

| **Aspect**         | **Deque (Interface)**          | **ArrayDeque (Class)**              |
| ------------------ | ------------------------------ | ----------------------------------- |
| **Type**           | Interface                      | Concrete implementation             |
| **Implementation** | Can be ArrayDeque / LinkedList | Uses **resizable array**            |
| **Null allowed?**  | Depends on implementation      | ❌ No null elements                  |
| **Performance**    | Depends on implementation      | ✅ Faster for queue/stack            |
| **Use Case**       | General contract               | Practical, efficient implementation |

---

### ArrayDeque – Methods Table

| **Method**        | **Description**                                          |
| ----------------- | -------------------------------------------------------- |
| `add(E e)`        | Adds element at tail (throws exception if capacity full) |
| `offer(E e)`      | Adds element at tail (returns false if capacity full)    |
| `addFirst(E e)`   | Inserts element at head                                  |
| `addLast(E e)`    | Inserts element at tail                                  |
| `offerFirst(E e)` | Inserts at head, returns false if fails                  |
| `offerLast(E e)`  | Inserts at tail, returns false if fails                  |
| `remove()`        | Removes and returns head (throws exception if empty)     |
| `poll()`          | Removes and returns head (returns null if empty)         |
| `removeFirst()`   | Removes first element                                    |
| `removeLast()`    | Removes last element                                     |
| `pollFirst()`     | Removes first element, returns null if empty             |
| `pollLast()`      | Removes last element, returns null if empty              |
| `getFirst()`      | Returns first element (throws exception if empty)        |
| `getLast()`       | Returns last element (throws exception if empty)         |
| `peek()`          | Returns head without removing (null if empty)            |
| `peekFirst()`     | Returns first element without removing                   |
| `peekLast()`      | Returns last element without removing                    |
| `size()`          | Returns number of elements                               |
| `clear()`         | Removes all elements                                     |

---

## **3️⃣ Hashing Technique**

* **Hashing** = Converting an object into an integer (hash code) for efficient searching/storage.
* Used in **HashSet, HashMap, HashTable**.
* Operations like `add`, `remove`, `contains` are **O(1) average case**.

👉 Example: Storing student roll numbers in a `HashSet`.

---

## **4️⃣ HashSet**

* Implements **Set** interface (no duplicates, unordered).
* Uses **Hashing** for storage.
* Allows **null element** (only one).

### **Example**

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("Virat");
        set.add("Rohit");
        set.add("Virat"); // duplicate ignored

        System.out.println(set); // [Rohit, Virat] (order not guaranteed)
    }
}
```

---

### HashSet – Methods Table

| **Method**           | **Description**                             |
| -------------------- | ------------------------------------------- |
| `add(E e)`           | Adds element (ignores if already exists)    |
| `remove(Object o)`   | Removes element if present                  |
| `contains(Object o)` | Checks if element exists                    |
| `isEmpty()`          | Checks if set is empty                      |
| `size()`             | Returns number of elements                  |
| `clear()`            | Removes all elements                        |
| `iterator()`         | Returns iterator over elements              |
| `toArray()`          | Converts set to array                       |
| `clone()`            | Creates a shallow copy of set               |
| `spliterator()`      | Creates Spliterator for parallel processing |
 
 ---

## **5️⃣ TreeSet**

* Implements **Set interface** using a **Tree (Red-Black Tree)**.
* Stores elements in **sorted (ascending) order**.
* No duplicates allowed.

### **Example**

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(20);
        ts.add(5);
        ts.add(15);

        System.out.println(ts); // [5, 15, 20]
    }
}
```

---

### **TreeSet Common Methods (Table)**

| **Method**           | **Description**                        |
| -------------------- | -------------------------------------- |
| `add(E e)`           | Adds element (sorted order maintained) |
| `remove(Object o)`   | Removes element                        |
| `first()`            | Returns first (smallest) element       |
| `last()`             | Returns last (largest) element         |
| `ceiling(E e)`       | Returns least element ≥ given value    |
| `floor(E e)`         | Returns greatest element ≤ given value |
| `higher(E e)`        | Returns least element > given value    |
| `lower(E e)`         | Returns greatest element < given value |
| `size()`             | Returns number of elements             |
| `clear()`            | Removes all elements                   |
| `contains(Object o)` | Checks if element exists               |

---

✅ **Quick Recap**:

* **Deque/ArrayDeque** → Double-ended operations, faster alternative to Stack/Queue.
* **HashSet** → Unique, unordered elements (O(1) operations).
* **TreeSet** → Unique, **sorted elements** with navigation methods.

---