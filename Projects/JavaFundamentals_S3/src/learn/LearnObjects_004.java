package learn;

import models.Matriz;

public class LearnObjects_004 {
    
    public static void main(String[] args) {
        
        Matriz miMatriz = new Matriz();
        
        // ERROR: La matriz no es utilizable todavía
        miMatriz.ajustar(1, 4, 123);
        miMatriz.describir();
        
        miMatriz.crear(4, 8);
        
        miMatriz.ajustar(3, 2, 100);
        miMatriz.ajustar(2, 1, 345);
        
        miMatriz.describir();
        
    }
    
}
