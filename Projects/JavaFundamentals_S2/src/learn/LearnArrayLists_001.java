package learn;

import java.util.ArrayList;

public class LearnArrayLists_001 {

    public static void main(String[] args) {
        
        // ArrayList<TIPO> <NOMBRE LISTA> = new ArrayList<>()
        // CLASE<TIPO> -> Clase Genérica
        
        // TIPO PRIMITIVOS:
        // boolean, byte, short, int, long, float, double, char, ...
        // Generalmente están escritos en minúsculas
        // * NO SON SOPORTADOS COMO OBJETOS
        // * NO SON SOPORTADOS COMO TIPO GENÉRICOS
        
        // TIPO CLASE:
        // Boolean, Byte, Short, Integer, Long, Float, Double, Character, ...
        // Generalmente están escritos en notación PacalCase (alternando mayúsculas)
        // * SON SOPORTADOS COMO OBJETOS (se soportan como instancias)
        // * SON SOPORTADOS COMO TIPO GENÉRICOS
        
        // Una lista nueva siempre parte de cero elementos
        ArrayList<Integer> edades = new ArrayList<>();
        
        // Arreglos -> .length (constante)
        // Listas -> .size() (método)
        System.out.printf("EDADES: %d %n", edades.size());
        
        // AGREGAR ELEMENTOS A LA LISTA (AL FINAL)
        // <NOMBRE LISTA>.add(<VALOR>)
        
        edades.add(23);
        edades.add(45);
        edades.add(87);
        edades.add(12);
        
        System.out.printf("EDADES: %d %n", edades.size());
        
        edades.add(18);
        edades.add(34);
        edades.add(43);
        edades.add(17);
        
        // AGREGA Y DESPLAZA LOS ELEMENTOS DESPUÉS DEL ÍNDICE
        // * El nuevo elemento 0 (cero) ahora es 66 y los demás se recorren
        edades.add(0, 66);
        
        // * El nuevo elemento ANTEPENÚLTIMO (TAMAÑO - 2) ahora es 55 y los demás se recorren
        edades.add(edades.size() - 2, 55);
        
        System.out.printf("EDADES: %d %n", edades.size());
        
        // ACCEDER AL ELEMENTO EN LA POSICIÓN DE SU ÍNDICE (PARTIENDO DE CERO)
        // <NOMBRE LISTA>.get(<ÍNDICE>)
        
        System.out.printf("PRIMERO: %d %n", edades.get(0));
        System.out.printf("SEGUNDO: %d %n", edades.get(1));
        System.out.printf("TERCERO: %d %n", edades.get(2));
        System.out.println("------------------------");
        System.out.printf("ANTEPENÚLTIMO: %d %n", edades.get(edades.size() - 3));
        System.out.printf("PENÚLTIMO: %d %n", edades.get(edades.size() - 2));
        System.out.printf("ÚLTIMO: %d %n", edades.get(edades.size() - 1));
        
    }
    
}
