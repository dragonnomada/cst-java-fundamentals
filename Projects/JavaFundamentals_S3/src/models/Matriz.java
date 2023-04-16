package models;

public class Matriz {

    private int[][] dato; // Se inicializa en "null"
    
    public void crear(int filas, int columnas) {
        
        // Se solicita nueva memoria
        // para un arreglo matricial
        // de tantas filas por columnas
        dato = new int[filas][columnas];
        
    }
    
    public void ajustar(int fila, int columna, int valor) {
        dato[fila][columna] = valor;
    }
    
    public int obtener(int fila, int columna) {
        return dato[fila][columna];
    }
    
    public int contarFilas() {
        return dato.length;
    }
    public int contarColumnas() {
        return dato[0].length;
    }
    
    public void describir() {
        
        System.out.printf("MATRIZ %dx%d %n", 
                contarFilas(), contarColumnas());
        
        System.out.println("------------------------");
        
        for (int i = 0; i < contarFilas(); i++) {
            for (int j = 0; j < contarColumnas(); j++) {
                
                System.out.printf("%3d ", obtener(i, j));
                
            }
            
            System.out.println();
        }
        
        System.out.println("------------------------");
        
    }
    
}
