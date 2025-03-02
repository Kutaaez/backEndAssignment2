package layers;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
//class for show how we use repository annotation
@Repository
public class ProductRepository {
    //map dlya hranenie id i nazvanie productsa
    private final Map<Integer, String> products = new HashMap<>();
    public ProductRepository() {
        products.put(1, "Haier Refrigerator");
        products.put(2, "Haier Washing Machine");
        products.put(3, "Haier Air Conditioner");
        products.put(4, "Haier Smart TV");
        products.put(5, "Haier Microwave Oven");
    }
    public String findProductById(int id) {
        return products.get(id);
    }
}
