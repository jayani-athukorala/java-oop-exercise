package se.lexicon;

import java.time.LocalDate;

public class Main {
    static void main() {

        IO.println("========== Exercise 1 ===========");
        //Create multiple BankAccount objects with different values.
        BankAccount account1 = new BankAccount("Jayani Athukorala", 10000.00);
//        account1.setAccountHolder("T A J S Athukorala");
        account1.withdraw(500);
        account1.deposit(1200);

        BankAccount account2 = new BankAccount("Kristy Heijenk", 15000.00);
        account2.withdraw(250);
        account2.withdraw(200);
        account2.deposit(5000);

        BankAccount account3 = new BankAccount("Fadi Alaraj", 25000.00);
        account3.deposit(2500);
        account3.deposit(2000);
        account3.withdraw(3000);

        IO.println(account1);
        IO.println(account2);
        IO.println("AccountHolder: "+account3.getAccountHolder()+", Balance: "+account3.getBalance());

        IO.println("========== Exercise 2 ===========");
        Customer customer1 = new Customer(111101, "Jayani Athukorala", "jayani@email.com");
        Customer customer2 = new Customer(111102, "Kristy Heijenk", "kristy@email.com");
        Customer customer3 = new Customer(111103, "Fadi Alaraj", "fadi@email.com");

        customer2.setEmail("kristy.new@email.com");

        IO.println(customer1);
        IO.println(customer2);
        IO.println("Customer{customerId=" + customer3.getCustomerId() + ", name='" + customer3.getName() + "', email='" + customer3.getEmail() + "'}");

        IO.println("========== Exercise 3 ===========");
        Student student1 = new Student(101, "Sakuni Satharasinghe", 20, "Computer Science");
        Student student2 = new Student(102, "Mazood Imitiyaz", 22, "Mathematics");
        Student student3 = new Student(102, "Kalhara Nipunsara", 22, "Computer Networking");

        student1.setMajor("Software Engineering");

        IO.println(student1);
        IO.println(student2);
        IO.println("Student{id=" + student3.getStudentId() + ", name='" + student3.getName() + "', age=" + student3.getAge() + ", major='" + student3.getMajor() + "'}");

        IO.println("========== Exercise 4 ===========");
        // Hair care products
        Product hc1 = new Product(101, "Shampoo", "HairCare", 199.99, 50);
        Product hc2 = new Product(102, "Conditioner", "HairCare", 190.49, 40);
        Product hc3 = new Product(103, "Hair Oil", "HairCare", 125.99, 30);

        // Skin care products
        Product sc1 = new Product(201, "Moisturizer", "SkinCare", 249.99, 60);
        Product sc2 = new Product(202, "Face Wash", "SkinCare", 155.99, 70);
        Product sc3 = new Product(203, "Sunscreen", "SkinCare", 229.49, 45);

        // Each object maintains its own state
        hc1.setStock(45); // update stock of Shampoo
        sc2.setPrice(7.99); // discount Face Wash

        // Print all products
        IO.println(hc1);
        IO.println(hc2);
        IO.println(hc3);
        IO.println(sc1);
        IO.println(sc2);
        IO.println(sc3);

        IO.println("========== Exercise 5 ===========");
        // Order 1 for Jayani
        Order order1 = new Order(1001, customer1, LocalDate.now(), "Delivered");
        order1.addProduct(hc1);
        order1.addProduct(sc1);

        // Order 2 for Kristy
        Order order2 = new Order(1002, customer2, LocalDate.now(), "Pending");
        order2.addProduct(hc2);
        order2.addProduct(sc2);
        order2.addProduct(sc1);
        order2.addProduct(sc3);

        // Remove a product from order2
        order2.removeProduct(sc2);

        // Display orders
        IO.println(order1); // total = hc1 + sc1 + sc3
        IO.println(order2); // total = hc2 + sc1
    }
}
