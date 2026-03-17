package se.lexicon;

public class Main {
    static void main() {

        IO.println("========== Exercise 1 ===========");
        //Create multiple BankAccount objects with different values.
        BankAccount account1 = new BankAccount("Jayani Athukorala", 10000.00);
        account1.setAccountHolder("T A J S Athukorala");
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
        IO.println("Customer{id=" + customer3.getCustomerId() + ", name='" + customer3.getName() + "', email='" + customer3.getEmail() + "'}");

    }
}
