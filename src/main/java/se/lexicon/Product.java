package se.lexicon;

public class Product {
    private final int productId;
    private String name;
    private String category;
    private double price;
    private int stock;

    public Product(int productId, String name, String category, double price, int stock) {
        this.productId = productId;
        setName(name);
        setCategory(category);
        setPrice(price);
        setStock(stock);
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null && !name.isBlank()) {
            this.name = name;
        }
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        if(category != null && !category.isBlank()) {
            this.category = category;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price >= 0) {
            this.price = price;
        }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if(stock >= 0) {
            this.stock = stock;
        }
    }

    public boolean reduceStock(int quantity) {
        if (quantity > 0 && stock >= quantity) {
            stock -= quantity;
            return true;
        }
        return false;
    }

    public void increaseStock(int quantity) {
        if (quantity > 0) {
            stock += quantity;
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                "}\n";
    }
}
