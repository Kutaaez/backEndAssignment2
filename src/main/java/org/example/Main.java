package org.example;

import config.AppConfig;
import layers.ProductManager;
import layers.ProductRepository;
import layers.ShopService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        ShopService shopService = context.getBean(ShopService.class);
        shopService.buyProduct(1);
        shopService.buyProduct(3);
        shopService.buyProduct(10);
        ProductManager productManager = context.getBean(ProductManager.class);
        productManager.showProductFeature();


    }
}