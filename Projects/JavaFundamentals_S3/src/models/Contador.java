package models;

public class Contador {
    
    // El valor está encapsulado dentro de la clase
    // (es privado) y sólo se puede incrementar
    // o decrementar de 1 en 1
    private int valor = 0;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public void incrementar() {
        valor++;
    }
    
    public void decrementar() {
        valor--;
    }
    
    public void resetear() {
        valor = 0;
    }
    
}
