# Java OOP Concepts Exercises : Answers

## 🛠  How to Run :
1. Clone the Repository
    ```bash
    git clone https://github.com/jayani-athukorala/java-oop-exercise.git
    ```
2. Open the project in preferred IDE.
3. Buld and Run ```Main.java```

---

## 📌 Exercise Document

You can find the exercise description here:

[Exercise Document](OOP1_Exercises.md)

---

## 🧱 UML Class Diagrams

### Exercise 1
```
+----------------------------------+
|          BankAccount             |
+----------------------------------+
| - accountHolder: String          |
| - balance: double                |
+----------------------------------+
| + BankAccount(String, double)    |
| + getAccountHolder(): String     |
| + setAccountHolder(String): void |
| + getBalance(): double           |
| + deposit(double): void          |
| + withdraw(double): void         |
| + toString(): String             |
+----------------------------------+
```

### Customer class UML

```mermaid
classDiagram
    class Customer {
        -int customerId
        -String name
        -String email
        +Customer(int, String, String)
        +getCustomerId() int
        +getName() String
        +getEmail() String
        +setName(String)
        +setEmail(String)
        +toString() String
    }
````
---
## ⚡ Expected Output :

```
========== Exercise 1 ===========
AccountHolder: T A J S Athukorala, Balance: 10700.0
AccountHolder: Kristy Heijenk, Balance: 19550.0
AccountHolder: Fadi Alaraj, Balance: 26500.0

========== Exercise 2 ===========
Customer{id=111101, name='Jayani Athukorala', email='jayani@email.com'}
Customer{id=111102, name='Kristy Heijenk', email='kristy.new@email.com'}
Customer{id=111103, name='Fadi Alaraj', email='fadi@email.com'}

```
---