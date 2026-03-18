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

### Exercise 1 : 'BankAccount' Class UML

```mermaid
classDiagram
    class Customer {
        - accountHolder String
        - balance double
        + BankAccount(String, double)
        + getAccountHolder() String
        + setAccountHolder(String) void
        + getBalance() double
        + deposit(double) void
        + withdraw(double) void 
        + toString() String 
    }
```

### Exercise 2 : 'Customer' class UML

```mermaid
classDiagram
    class Customer {
        -customerId int
        -name String
        -email String
        +Customer(int, String, String)
        +getCustomerId() int
        +getName() String
        +getEmail() String
        +setName(String)
        +setEmail(String)
        +toString() String
    }
```

### Exercise 3 : 'Student' class UML

```mermaid
classDiagram
    class Student {
        -studentId int
        -name String
        -age int
        -major String
        +Student(int, String, int, String)
        +getStudentId() int
        +getName() String
        +getAge() int
        +getMajor() String
        +setName(String) void
        +setAge(int) void
        +setMajor(String) void
        +toString() String
    }
```

### Exercise 4 : 'Product' class UML

```mermaid
classDiagram
    class Product {
        -productId int
        -name String
        -category String
        -price double
        -stock int
        +Product(int, String, String, double, int)
        +getProductId() int
        +getName() String
        +getCategory() String
        +getPrice() double
        +getStock() int
        +setName(String) void
        +setCategory(String) void
        +setPrice(double) void
        +setStock(int) void
        +increaseStock(int) void
        +reduceStock(int) void
        +toString() String
    }
```

### Exercise 5 : 'Order' class UML

```mermaid
classDiagram
    class Customer {
        -customerId int
        -name String
        -email String
        +Customer(int, String, String)
        +getCustomerId() int
        +getName() String
        +getEmail() String
        +setName(String)
        +setEmail(String)
        +toString() String
    }

    class Order {
      - orderId int
      - customer Customer
      - products List~Product~
      - orderDate LocalDate
      - totalAmount double
      - status String
    
      + Order(int orderId, Customer customer, LocalDate orderDate, String status)
      + getOrderId() int
      + getCustomer() Customer
      + getProducts() List~Product~
      + getOrderDate() LocalDate
      + getTotalAmount() double
      + getStatus() String
    
      + setCustomer(Customer customer) void
      + setProducts(List~Product~ products) void
      + setOrderDate(LocalDate orderDate) void
      + setTotalAmount(double totalAmount) void
      + setStatus(String status) void
          
      + addProduct(Product product) void
      + removeProduct(Product product) void
      + calculateTotal() void
    }

    class Product {
        -productId int
        -name String
        -category String
        -price double
        -stock int
        +Product(int, String, String, double, int)
        +getProductId() int
        +getName() String
        +getCategory() String
        +getPrice() double
        +getStock() int
        +setName(String) void
        +setCategory(String) void
        +setPrice(double) void
        +setStock(int) void
        +increaseStock(int) void
        +reduceStock(int) void
        +toString() String
    }

    %% Relationships
    Customer "1" --> "0..*" Order : places
    Order "1" --> "0..*" Product : contains
```

---
## ⚡ Expected Output :

```
========== Exercise 1 ===========
BankAccount{accountHolder='Jayani Athukorala', balance=10700.0}
BankAccount{accountHolder='Kristy Heijenk', balance=19550.0}
AccountHolder: Fadi Alaraj, Balance: 26500.0

========== Exercise 2 ===========
Customer{customerId=111101, name='Jayani Athukorala', email='jayani@email.com'}
Customer{customerId=111102, name='Kristy Heijenk', email='kristy.new@email.com'}
Customer{customerId=111103, name='Fadi Alaraj', email='fadi@email.com'}

========== Exercise 3 ===========
Student{studentId=101, name='Sakuni Satharasinghe', age=20, major='Software Engineering'}
Student{studentId=102, name='Mazood Imitiyaz', age=22, major='Mathematics'}
Student{studentId=102, name='Kalhara Nipunsara', age=22, major='Computer Networking'}

========== Exercise 4 ===========
Product{productId=101, name='Shampoo', category='HairCare', price=199.99, stock=45}
Product{productId=102, name='Conditioner', category='HairCare', price=190.49, stock=40}
Product{productId=103, name='Hair Oil', category='HairCare', price=125.99, stock=30}
Product{productId=201, name='Moisturizer', category='SkinCare', price=249.99, stock=60}
Product{productId=202, name='Face Wash', category='SkinCare', price=7.99, stock=70}
Product{productId=203, name='Sunscreen', category='SkinCare', price=229.49, stock=45}

========== Exercise 5 ===========
Order{orderId=1001, customer=Customer{customerId=111101, name='Jayani Athukorala', email='jayani@email.com'}
, products=[Product{productId=101, name='Shampoo', category='HairCare', price=199.99, stock=44}
, Product{productId=201, name='Moisturizer', category='SkinCare', price=249.99, stock=58}
], orderDate=2026-03-18, totalAmount=449.98, status='Delivered'}
Order{orderId=1002, customer=Customer{customerId=111102, name='Kristy Heijenk', email='kristy.new@email.com'}
, products=[Product{productId=102, name='Conditioner', category='HairCare', price=190.49, stock=39}
, Product{productId=201, name='Moisturizer', category='SkinCare', price=249.99, stock=58}
, Product{productId=203, name='Sunscreen', category='SkinCare', price=229.49, stock=44}
], orderDate=2026-03-18, totalAmount=669.97, status='Pending'}

```
---