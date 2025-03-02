package components;

public class Order {
    private int orderId;
    private Product product;
    private double orderPrice;
    public Order(int orderId, Product product, double orderPrice) {
        this.orderId = orderId;
        this.product = product;
        this.orderPrice = orderPrice;
    }

    public int getOrderId() { return orderId; }
    public Product getProduct() { return product; }
    public double getOrderPrice() { return orderPrice; }
}
