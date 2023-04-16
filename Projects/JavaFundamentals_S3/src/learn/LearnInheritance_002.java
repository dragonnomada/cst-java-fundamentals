package learn;

import models.RelojPro;

public class LearnInheritance_002 {

    public static void main(String[] args) {
        
        RelojPro miReloj = new RelojPro();
        
        //miReloj.incrementaSemanas();
        
        System.out.println(miReloj.pantalla());
        
        for (int i = 0; i < 1000000; i++) {
            miReloj.incrementaSegundos();
        }
        
        System.out.println(miReloj.pantalla());
        
    }
    
}
