package learn;

import models.Product;

public class LearnObjects_001 {
    
    public static void main(String[] args) {
        
        Product myProduct = new Product();
        
        // Las propiedades fueron marcadas como privadas
        // por lo que no pueden ser modificadas fuera de su clase
        //myProduct.name = "CHOCO HACK";
        //myProduct.price = -1000;
        
        myProduct.setName("Coca Cola");
        myProduct.setPrice(-1000);
        
    }
    
}
