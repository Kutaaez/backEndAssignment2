package org.example;

import components.Laptop;
import config.AppConfig;
import layers.ProductManager;
import layers.ProductRepository;
import layers.ShopService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println("Creating Show Manager...");

        ShopService shopService = context.getBean(ShopService.class);
        //check for prototype annotation
        shopService.buyProduct(1);
        shopService.buyProduct(3);
        shopService.buyProduct(10);
        shopService.buyProduct(2);
        //check for singletone annotation
        Laptop laptop1 = context.getBean(Laptop.class);
        Laptop laptop2 = context.getBean(Laptop.class);
        System.out.println("Singleton work:\nlaptop1 ID: " + laptop1.getLaptopId());
        System.out.println("laptop2 ID: " + laptop2.getLaptopId()+"\n");
        System.out.println("\nCreating Product Manager...");
        ProductManager productManager = context.getBean(ProductManager.class);
        productManager.showProductFeature();


    }
}