package practice;

import models.Elevador;

public class PracticeMethods_001 {
    
    public static void main(String[] args) {
        
        Elevador miElevador = new Elevador();
        
        miElevador.pulsarNivel("E");
        miElevador.pulsarNivel("PB");
        miElevador.pulsarNivel("N1");
        miElevador.pulsarNivel("N2");
        
        miElevador.describir();
        
        miElevador.irAlProximoNivel();
        
        miElevador.describir();
                
        // LAS PUERTAS TIENEN QUE CERRARSE
        miElevador.cerrarPuertas();
        miElevador.irAlProximoNivel();
        miElevador.describir();
        
        // LAS PUERTAS TIENEN QUE CERRARSE
        miElevador.cerrarPuertas();
        miElevador.irAlProximoNivel();
        miElevador.describir();
        
        // LAS PUERTAS TIENEN QUE CERRARSE
        miElevador.cerrarPuertas();
        miElevador.irAlProximoNivel();
        miElevador.describir();
        
        // LAS PUERTAS TIENEN QUE CERRARSE
        miElevador.cerrarPuertas();
        miElevador.irAlProximoNivel();
        miElevador.describir();
        
        miElevador.pulsarNivel("E");
        
        // LAS PUERTAS TIENEN QUE CERRARSE
        miElevador.cerrarPuertas();
        miElevador.irAlProximoNivel();
        miElevador.describir();
        
        // LAS PUERTAS TIENEN QUE CERRARSE
        miElevador.cerrarPuertas();
        miElevador.irAlProximoNivel();
        miElevador.describir();
        
        // LAS PUERTAS TIENEN QUE CERRARSE
        miElevador.cerrarPuertas();
        miElevador.irAlProximoNivel();
        miElevador.describir();
        
        // LAS PUERTAS TIENEN QUE CERRARSE
        miElevador.cerrarPuertas();
        miElevador.irAlProximoNivel();
        miElevador.describir();
        
    }
    
}
