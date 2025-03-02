package layers;

import components.Product;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
//class for show how use qualifier:
@Service("prodmanager")

public class ProductManager {
    private final Product product;
    //uncomment it for show how work lazy annotation
//    public ProductManager(@Qualifier("Smartphone") Product product){
//        this.product = product;
//    }
    //comment it for show how work lazy annotation
    public ProductManager( Product product){
        this.product = product;
    }

    public void showProductFeature(){
        product.specialFeature();
    }
}
