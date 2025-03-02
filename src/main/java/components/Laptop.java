package components;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
//added component with name "laptop" pointing for qualifier
@Component("Laptop")
@Lazy

public class Laptop extends Product{
    private int ram;

    public Laptop(int id, String name, double price, int ram) {
        super(id, name, price);
        this.ram = ram;
    }
    public Laptop() {
        super(1, "MacBook Pro", 1999.99);
        this.ram = 16;
        System.out.println("Laptop props is created.");

    }
    @Override
    public void specialFeature() {
        System.out.println(getProductName() + " has " + ram + "GB RAM.");
    }
}
