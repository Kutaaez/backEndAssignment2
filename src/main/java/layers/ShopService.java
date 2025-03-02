package layers;

import components.Order;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service("shopservice")
//class for show how we use service annotation
public class ShopService {
    private final ProductRepository productRepository;
    private final ApplicationContext context;
    public ShopService(ProductRepository productRepository, ApplicationContext context) {
        this.productRepository = productRepository;
        this.context = context;
    }
    public void buyProduct(int id) {
        String product = productRepository.findProductById(id);
        if (product != null) {
            Order newOrder = context.getBean(Order.class);
            System.out.println("Buying : " + product +"\n######");
        } else {
            System.out.println("\nXXXXX\nOrder is not created, because selected item is not available. \nXXXXX");
        }
    }
}
