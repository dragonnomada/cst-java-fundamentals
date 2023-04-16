package models;

// Un constructor es un método especial llamado igual que la clase
// que no especifica valor de retorno
// * Un método tradicional dice: <RETORNO> <NOMBRE>(<PARÁMETROS...>)
// * Un método contructor dice: <NOMBRE CLASE>(<PARÁMETROS>)

// El constructor sirve para solicitar parámetros
// obligatorios para poder inicializar los atributos/propiedades/estados
// que deberán tener un valor específico antes de que otros
// métodos puedan utilizarlos

public class MatrizPro {
    
    int[][] dato; // NO INICIALIZADO (VALE NULL)
    
    // Con esto evitamos un método contructor adicional
    // y usamos el método constructor del lenguaje
    public MatrizPro(int filas, int columnas) {
        // AL CREAR EL OBJETO, SE INICIALIZA EL DATO
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
