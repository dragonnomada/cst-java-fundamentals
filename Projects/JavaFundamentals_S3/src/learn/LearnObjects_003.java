package learn;

import models.Matriz;

public class LearnObjects_003 {
    
    public static void main(String[] args) {
        
        Matriz miMatriz = new Matriz();
        
        miMatriz.crear(4, 8);
        
        miMatriz.ajustar(3, 2, 100);
        miMatriz.ajustar(2, 1, 345);
        
        miMatriz.describir();
        
    }
    
}
