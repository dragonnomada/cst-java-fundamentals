package learn;

import models.Reloj;

public class LearnInheritance_001 {

    public static void main(String[] args) {
        
        Reloj miReloj = new Reloj();
        
        System.out.println(miReloj.pantalla());
        
        for (int i = 0; i < 10000; i++) {
            miReloj.incrementaSegundos();
        }
        
        System.out.println(miReloj.pantalla());
        
    }
    
}
