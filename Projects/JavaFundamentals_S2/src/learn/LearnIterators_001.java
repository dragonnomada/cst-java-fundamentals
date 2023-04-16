package learn;

public class LearnIterators_001 {

    public static void main(String[] args) {
        
        // El iterador es una estructura de control (del bloque asociado)
        // que permite reptir un conjunto de sentencias (el bloque)
        // con una variable de control llamada el iterando (el iterador)
        // y está sujeta a un condición y un incremento determinados
        
        // FOR (<TIPO> <ITERADOR>; <CONDICIÓN: EXP. LÓGICA ITERADOR>; <INCREMENTO ITERADOR>) <BLOQUE>
        
        for (int i = 1; i <= 5; i = i + 1) {
            System.out.printf("ITERADOR: %d %n", i);
        }
        
        // i = 1     ? 1 <= 5 : SI -> BLOQUE(i=1)
        // i = 1 + 1 ? 2 <= 5 : SI -> BLOQUE(i=2)
        // i = 2 + 1 ? 3 <= 5 : SI -> BLOQUE(i=3)
        // i = 3 + 1 ? 4 <= 5 : SI -> BLOQUE(i=4)
        // i = 4 + 1 ? 5 <= 5 : SI -> BLOQUE(i=5)
        // i = 5 + 1 ? 6 <= 5 : NO
        
    }
    
}
