package components;

import org.springframework.stereotype.Component;
//added component with name "smartphone" pointing for qualifier
@Component("Smartphone")
public class Smartphone extends Product {
    private String camera;
    private int memory;

    public Smartphone(int id, String name, double price, String camera, int memory) {
        super(id, name, price);
        this.camera = camera;
        this.memory = memory;
    }
    public Smartphone() {
        super(2, "iPhone 15", 1299.99);
        this.camera = "48MP";
        this.memory = 128;
        System.out.println("Smartphone props is created.");
    }
    public void specialFeature() {
        System.out.println(getProductName() + " has a " + camera + " camera, memory is " + memory);
    }
}
