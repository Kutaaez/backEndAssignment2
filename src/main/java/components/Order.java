package components;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")

public class Order {
    private static int counter = 0;
    private final int orderId;

    public Order() {
        this.orderId = ++counter;
        System.out.println("\n######\nnew order is created, id #" + orderId);
    }

    public int getOrderId() {
        return orderId;
    }
}
