# **Chapter 13 – Date & Time in Java**

Working with **dates and time** is very common in applications (e.g., timestamps, scheduling, logging, billing systems).
Java provides multiple APIs to handle date and time, from the **legacy `Date` and `Calendar` classes** to the **modern `java.time` API** introduced in Java 8.

---

## **1️⃣ Date Class (Legacy)**

* Part of `java.util` package.
* Represents a specific **instant in time** (date + time).
* Provides methods to get and set date/time values.

### **Example**

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date); // Current date & time
    }
}
```

⚠️ Limitations: Many methods are **deprecated** (old style), so mostly replaced by newer APIs.

---

## **2️⃣ Calendar Class**

* More powerful than `Date` — allows manipulation of dates (adding, subtracting days, months, years).
* Abstract class, use `Calendar.getInstance()` to create an object.

### **Example**

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println("Year: " + cal.get(Calendar.YEAR));
        System.out.println("Month: " + (cal.get(Calendar.MONTH) + 1));
        System.out.println("Day: " + cal.get(Calendar.DAY_OF_MONTH));
    }
}
```

---

## **3️⃣ java.time API (Java 8 – Modern Date/Time)**

Introduced in **Java 8**, inspired by **Joda-Time**.
Provides classes in `java.time` package → **immutable, thread-safe, easy to use**.

### **Key Classes**

* `LocalDate` → Date only (yyyy-MM-dd)
* `LocalTime` → Time only (HH\:mm\:ss)
* `LocalDateTime` → Both date & time
* `ZonedDateTime` → Date/time with timezone

### **Example**

```java
import java.time.*;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
        System.out.println("DateTime: " + dateTime);
    }
}
```

---

## **4️⃣ DateTimeFormatter**

Used for **formatting and parsing** date/time into custom patterns.

### **Example**

```java
import java.time.*;
import java.time.format.*;

public class Main {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatted = dt.format(formatter);

        System.out.println("Formatted DateTime: " + formatted);
    }
}
```

---

✅ **Quick Recap**

* **Date class** → Old, simple, but limited.
* **Calendar** → More powerful than Date, allows manipulation.
* **java.time API (Java 8)** → Modern, clean, immutable, thread-safe.
* **DateTimeFormatter** → Format and parse dates/times with custom patterns.

---