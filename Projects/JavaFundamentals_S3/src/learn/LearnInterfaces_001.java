package learn;

import models.Fruta;
import models.Libro;
import services.ServicioTransportePaquetes;

public class LearnInterfaces_001 {

    public static void main(String[] args) {
        
        ServicioTransportePaquetes servicio = new ServicioTransportePaquetes();
        
        servicio.add(new Libro("Soy Pepe", "Pepe", 2023));
        servicio.add(new Libro("Soy Paco", "Paco", 2023));
        servicio.add(new Fruta("Manzana", 0.56, "Rojo"));
        servicio.add(new Fruta("Piña", 6.0, "Amarillo"));
        
        servicio.reportarPaquetesPorEnviar();
        
    }
    
}
