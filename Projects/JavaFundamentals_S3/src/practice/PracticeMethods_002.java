package practice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import models.ProductReporter;


public class PracticeMethods_002 {

    public static void main(String[] args) throws IOException {
        
        ProductReporter reporter = new ProductReporter();
        
        reporter.addProduct("Coca Cola", 17.5);
        reporter.addProduct("Galletas Marías", 15.5);
        reporter.addProduct("Gansito", 21.5);
        reporter.addProduct("Redbull", 65.99);
        reporter.addProduct("Fanta", 13.5);
        reporter.addProduct("Chocorroll", 23.99);
        
        System.out.println(reporter.reportTotalProducts());
        System.out.println(reporter.reportMinPrice());
        System.out.println(reporter.reportProductMinPrice());
        System.out.println(reporter.reportMaxPrice());
        System.out.println(reporter.reportProductMaxPrice());
        System.out.println(reporter.reportPricesSum());
        System.out.println(reporter.reportPricesAverage());
        System.out.println(reporter.reportProductsInPriceRange(10, 20));
        System.out.println(reporter.reportProductsPriceNeighbors(reporter.productWithMinPrice(), 3));
        
        File file = new File("D:\\data\\products_report.txt");
        FileWriter fileWriter = new FileWriter(file);
        
        fileWriter.write(reporter.reportAll());
        
        fileWriter.close();
        
    }
    
}
