package se.lexicon;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Order {
    private final int orderId;
    private Customer customer;
    private List<Product> products;
    private LocalDate orderDate;
    private double totalAmount;
    private String status;

    public Order(int orderId, Customer customer, LocalDate orderDate, String status) {
        this.orderId = orderId;
        setCustomer(customer);
        setOrderDate(orderDate);
        setStatus(status);
        this.products = new ArrayList<>(); // start with empty product list
        this.totalAmount = 0;
    }

    public int getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Add product to order
    public void addProduct(Product product){
        if(product != null && product.reduceStock(1)) {
            products.add(product);
            calculateTotal();
        }
    }

    // Remove product from order
    public void removeProduct(Product product){
        if(product != null && products.remove(product)) {
            product.increaseStock(1); // restore stock
            calculateTotal();
        }
    }

    // Recalculate total price
    public void calculateTotal(){
        totalAmount = products.stream()                 // create a stream from the product list to process elements
                .filter(Objects::nonNull)               // skip null entries to avoid NullPointerException
                .mapToDouble(Product::getPrice)         // extract each product's price as a double
                .sum();                                 // sum all prices and assign to totalAmount
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", customer=" + customer +
                ", products=" + products +
                ", orderDate=" + orderDate +
                ", totalAmount=" + totalAmount +
                ", status='" + status + '\'' +
                '}';
    }
}
