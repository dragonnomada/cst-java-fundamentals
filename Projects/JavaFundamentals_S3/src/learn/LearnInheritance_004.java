package learn;

import models.Product;
import models.ProductReporter;
import models.ProductStock;

public class LearnInheritance_004 {

    public static void main(String[] args) {
        
        Product product_1 = new Product("Coca Cola", 17.5);
        
        ProductStock product_2 = new ProductStock("Maquinita Gym", 123.456, -89.012, "Pepsi", 17.5);
        
        ProductReporter reporter = new ProductReporter();
        
        reporter.addProduct(product_1);
        reporter.addProduct(product_2);
        
        System.out.println(reporter.reportAll());
        
    }
    
}
