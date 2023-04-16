package models;

public class Reloj {

    int segundos;
    int minutos;
    int horas;
    
    public void incrementaSegundos() {
        segundos++;
        if (segundos % 60 == 0) {
            segundos = 0;
            incrementaMinutos();
        }
    }
    
    public void incrementaMinutos() {
        minutos++;
        if (minutos % 60 == 0) {
            minutos = 0;
            incrementaHoras();
        }
    }
    
    public void incrementaHoras() {
        horas++;
    }
    
    public String pantalla() {
        return String.format("%02d:%02d:%02d", 
                horas, minutos, segundos);
    }
    
}
