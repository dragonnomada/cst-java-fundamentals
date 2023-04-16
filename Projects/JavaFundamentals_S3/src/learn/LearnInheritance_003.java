package learn;

import models.Reloj;
import models.RelojPro;

public class LearnInheritance_003 {

    public static void main(String[] args) {
        
        //RelojPro miReloj = new RelojPro();
        Reloj miReloj = new RelojPro();
        
        // PODEMOS USAR UNA CLASE DERIVADA
        // COMO UNA CLASE SUPERIOR
        // PERO LIMITANDO A LA CLASE DERIVADA
        // A SÓLO LA FUNCIONALIDAD DE LA CLASE SUPERIOR
        //miReloj.incrementaSemanas();
        
        System.out.println(miReloj.pantalla());
        
        for (int i = 0; i < 1000000; i++) {
            miReloj.incrementaSegundos();
        }
        
        System.out.println(miReloj.pantalla());
        
    }
    
}
