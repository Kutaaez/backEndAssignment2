package components;

import org.springframework.stereotype.Component;

@Component
public abstract class Product {
    private int productId;
    private String productName;
    private double productPrice;

    public Product() {
    }

    public Product(int id, String name, double price) {
        this.productId = id;
        this.productName = name;
        this.productPrice = price;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }
    public abstract void specialFeature();
}
