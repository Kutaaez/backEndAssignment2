package layers;

import org.springframework.stereotype.Service;

@Service
//class for show how we use service annotation
public class ShopService {
    private final ProductRepository productRepository;

    public ShopService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public void buyProduct(int id) {
        String product = productRepository.findProductById(id);
        if (product != null) {
            System.out.println("Buying : " + product);
        } else {
            System.out.println("Empty.");
        }
    }
}
