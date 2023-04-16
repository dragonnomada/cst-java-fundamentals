package learn;

import models.MatrizPro;

public class LearnObjects_005 {
    
    public static void main(String[] args) {
        
        // Desde la creación del objeto
        // se obliga a pasar los parámetros
        // del constructor
        // y no hay forma de brincarlos,
        // es decir, el objeto ya estará
        // inicializado desde su instanciación
        MatrizPro miMatriz = new MatrizPro(10, 15);
        
        miMatriz.describir();
        
        miMatriz.ajustar(1, 4, 123);
        miMatriz.describir();
        
        miMatriz.ajustar(3, 2, 100);
        miMatriz.ajustar(2, 1, 345);
        
        miMatriz.describir();
        
    }
    
}
