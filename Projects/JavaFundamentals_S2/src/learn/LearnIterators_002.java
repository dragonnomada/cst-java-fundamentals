package learn;

import java.util.ArrayList;

public class LearnIterators_002 {

    public static void main(String[] args) {
        
        // Iterador por elemento, recorre cada elemento
        // de una lista, un arreglo o en general cualquier cosa
        // iterable y permite trabajar sobre el elemento
        // dentro del bloque, olvidando el índice (este ya no importa)
        
        // FOR (<TIPO> <NOMBRE ELEMENTO> : <ITERABLE>) <BLOQUE>
        
        ArrayList<String> frutas = new ArrayList<>();
        
        frutas.add("Manzana");
        frutas.add("Pera");
        frutas.add("Mango");
        // ...
        frutas.add("Papaya");
        
        /*for (int i = 0; i < frutas.size(); i++) {
            System.out.printf("FRUTA: %s %n", frutas.get(i));
        }*/
        
        // PARA (VALOR : LISTA) BLOQUE(VALOR)
        
        for (String nombre : frutas) {
            
            System.out.printf("FRUTA: %s (%d) %n", nombre, nombre.length());
            
        }
        
    }
    
}
