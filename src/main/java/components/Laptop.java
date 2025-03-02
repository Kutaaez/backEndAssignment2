package components;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
//added component with name "laptop" pointing for qualifier
@Component("Laptop")

@Primary
public class Laptop extends Product{
    private int ram;
    private static int counter = 0;
    private final int laptopId;

    public int getLaptopId() {
        return laptopId;
    }

    //    public Laptop(int id, String name, double price, int ram) {
//        super(id, name, price);
//        this.ram = ram;
//
//    }
    public Laptop() {
        super(1, "MacBook Pro", 1999.99);
        this.ram = 16;
        this.laptopId = ++counter;
        System.out.println("Laptop props is created.");

    }
    @Override
    public void specialFeature() {
        System.out.println(getProductName() + " has " + ram + "GB RAM.");
    }
}
