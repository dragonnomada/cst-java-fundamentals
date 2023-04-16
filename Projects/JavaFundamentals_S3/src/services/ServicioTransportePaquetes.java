package services;

import java.util.ArrayList;
import stereotypes.IEmpaquetable;

public class ServicioTransportePaquetes {

    ArrayList<IEmpaquetable> paquetes;
    
    public ServicioTransportePaquetes() {
        paquetes = new ArrayList<>();
    }
    
    public void add(IEmpaquetable paquete) {
        
        if (paquete.getAlto() <= 40) {
            if (paquete.getAncho() <= 80) {
                if (paquete.getProfundidad() <= 20) {
                    
                    if (paquete.getPeso() <= 5) {
                        paquetes.add(paquete);
                    } else {
                        System.out.printf("EL PAQUETE %s ES PESADO %n", 
                                paquete.getDescripcion());
                        System.out.println("EL PAQUETE NO SERÁ AGREGADO");
                    }
                    
                } else {
                    System.out.printf("EL PAQUETE %s ES MUY PROFUNDO %n", 
                                paquete.getDescripcion());
                        System.out.println("EL PAQUETE NO SERÁ AGREGADO");
                }
            } else {
                System.out.printf("EL PAQUETE %s ES MUY ANCHO %n", 
                                paquete.getDescripcion());
                        System.out.println("EL PAQUETE NO SERÁ AGREGADO");
            }
        } else {
            System.out.printf("EL PAQUETE %s ES MUY ALTO %n", 
                                paquete.getDescripcion());
                        System.out.println("EL PAQUETE NO SERÁ AGREGADO");
        }
        
    }
    
    public void reportarPaquetesPorEnviar() {
        
        for (IEmpaquetable paquete : paquetes) {
            System.out.printf("%s %.1fx%.1fx%.1f (%.2f KG.) %n", 
                    paquete.getDescripcion(),
                    paquete.getAlto(),
                    paquete.getAncho(),
                    paquete.getProfundidad(),
                    paquete.getPeso());
        }
        
    }
    
}
