package models;

import java.util.ArrayList;

public class ProductReporter {
    
    ArrayList<Product> products;
    
    public ProductReporter() {
        products = new ArrayList<>();
    }
    
    public ProductReporter(ArrayList<Product> products) {
        this.products = products;
    }
    
    public void addProduct(String name, double price) {
        products.add(new Product(name, price));
    }
    
    public void addProduct(Product product) {
        products.add(product);
    }
    
    public Product productWithMinPrice() {
        double minPrice = Double.POSITIVE_INFINITY;
        
        Product productFound = null;
        
        for (Product product : products) {
            if (minPrice > product.getPrice()) {
                minPrice = product.getPrice();
                productFound = product;
            }
        }
        
        return productFound;
    }
    
    public double minPrice() {
        return productWithMinPrice().getPrice();
    }
    
    public Product productWithMaxPrice() {
        double maxPrice = Double.NEGATIVE_INFINITY;
        
        Product productFound = null;
        
        for (Product product : products) {
            if (maxPrice < product.getPrice()) {
                maxPrice = product.getPrice();
                productFound = product;
            }
        }
        
        return productFound;
    }
    
    public double maxPrice() {
        return productWithMaxPrice().getPrice();
    }
    
    public int countProducts() {
        return products.size();
    }
    
    public double sumPrices() {
        double sum = 0.0;
        
        for (Product product : products) {
            sum += product.getPrice();
        }
        
        return sum;
    }
    
    public double averagePrices() {
        return sumPrices() / countProducts();
    }
    
    public ArrayList<Product> productsInPriceRange(double minPrice, double maxPrice) {
        
        ArrayList<Product> productsGroup = new ArrayList<>();
        
        for (Product product : products) {
            if (product.getPrice() >= minPrice 
                    && product.getPrice() <= maxPrice) {
                productsGroup.add(product);
            }
        }
        
        return productsGroup;
        
    }
    
    public ArrayList<Product> productPriceNeighbors(Product product, double epsilon) {
        return (ArrayList<Product>) productsInPriceRange(product.getPrice() - epsilon, 
                product.getPrice() + epsilon);
    }
    
    public String reportTotalProducts() {
        return String.format("TOTAL: %d", countProducts());
    }
    
    public String reportMinPrice() {
        return String.format("MIN PRICE: $%.2f", minPrice());
    }
    
    public String reportProductMinPrice() {
        Product productMin = productWithMinPrice();
        return String.format("PRODUCT WITH MIN PRICE: %s ($%.2f)", 
                productMin.getName(), productMin.getPrice());
    }
    
    public String reportMaxPrice() {
        return String.format("MAX PRICE: $%.2f", maxPrice());
    }
    
    public String reportProductMaxPrice() {
        Product productMax = productWithMaxPrice();
        return String.format("PRODUCT WITH MAX PRICE: %s ($%.2f)", 
                productMax.getName(), productMax.getPrice());
    }
    
    public String reportPricesSum() {
        return String.format("SUM OF PRICES: $%.2f", 
                sumPrices());
    }
    
    public String reportPricesAverage() {
        return String.format("AVERAGE OF PRICES: $%.2f", 
                averagePrices());
    }
    
    public String reportProductsInPriceRange(double minPrice, double maxPrice) {
        String report = "";
        
        report += String.format("PRODUCTS IN PRICE RANGE ($%.2f - $%.2f) %n",
                minPrice, maxPrice);
        report += "--------------------------------\n";
        for (Product product : productsInPriceRange(minPrice, maxPrice)) {
            report += String.format("%s ($%.2f) %n", 
                    product.getName(), product.getPrice());
        }
        report += "--------------------------------";
        
        return report;
    }
    
    public String reportProductsPriceNeighbors(Product productTarget, double epsilon) {
        String report = "";
        
        report += String.format("PRODUCTS NEGHBORS OF %s ($%.2f) %n",
                productTarget.getName(), productTarget.getPrice());
        report += "--------------------------------\n";
        for (Product product : productPriceNeighbors(productTarget, epsilon)) {
            report += String.format("%s ($%.2f) %n", 
                    product.getName(), product.getPrice());
        }
        report += "--------------------------------";
        
        return report;
    }
    
    public String reportAll() {
        return reportTotalProducts() + "\n" 
                + reportMinPrice() + "\n"
                + reportProductMinPrice() + "\n"
                + reportProductsPriceNeighbors(productWithMinPrice(), 5) + "\n"
                + reportMaxPrice() + "\n"
                + reportProductMaxPrice() + "\n"
                + reportProductsPriceNeighbors(productWithMaxPrice(), 5) + "\n"
                + reportPricesSum() + "\n"
                + reportPricesAverage() + "\n"
                + reportProductsInPriceRange(0, 20) + "\n"
                + reportProductsInPriceRange(0, 100);
    }
    
}
