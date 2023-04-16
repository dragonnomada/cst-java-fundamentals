package models;

// LA HERENCIA SE BASA EN EXTENDER CLASES EXISTENTES
// EN NUEVAS CLASES PARA AUMENTAR O REEMPLAZAR LA FUNCIONALIDAD

public class RelojPro extends Reloj {
    
    // + RELOJ (segundos, minutos, horas, pantalla(), ...)
    
    // NUEVO
    int dias;
    // NUEVO
    int semanas;
    
    // REEMPLAZA
    @Override
    public void incrementaHoras() {
        horas++;
        if (horas % 24 == 0) {
            horas = 0;
            incrementaDias();
        }
    }
    
    // NUEVO
    public void incrementaDias() {
        dias++;
        if (dias % 7 == 0) {
            //dias = 0;
            incrementaSemanas();
        }
    }
    
    // NUEVO
    public void incrementaSemanas() {
        semanas++;
    }
    
    // REEMPLAZA
    @Override
    public String pantalla() {
        return String.format("W[%d] D[%d] %s", 
                semanas, dias, super.pantalla());
    }
    
}
