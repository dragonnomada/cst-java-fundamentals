package learn;

public class LearnArrays_001 {

    public static void main(String[] args) {
        
        // Un arreglo es una secuencia fija de datos
        // Se establece un tamaño o número de repeticiones
        // Y se logra repetir un tipo de dato varias veces
        // Todos pueden ser accedidos en forma de variable
        // Pero utilizando índices que parten del 0 (cero)
        // Hasta el número de repeticiones (tamaño del arreglo)
        // MENOS 1 (menos uno).
        
        double x = 1.8, y = 2.5, z = -1.2; // tres variables
        
        double p_x = 1.8, p_y = 2.5, p_z = -1.2; // tres variables más nemónicas
        
        // DECLARACIÓN: <TIPO>[] <NOMBRE ARREGLO>;
        // ASIGNACIÓN : <NOMBRE ARREGLO> = new <TIPO>[<TAMAÑO>];
        
        double[] punto = new double[3]; // 3-double indexados (arreglo)
        
        // punto -> arreglo (similar a una variable simple)
        
        // ASIGNAR EN LA MEMORIA 0 (cero)
        // <NOMBRE ARREGLO>[0] = <VALOR>
        // ASIGNAR EN LA MEMORIA 1 (uno)
        // <NOMBRE ARREGLO>[1] = <VALOR>
        // ASIGNAR EN LA MEMORIA 2 (dos)
        // <NOMBRE ARREGLO>[2] = <VALOR>
        // ASIGNAR EN LA MEMORIA 3 (tres)
        // <NOMBRE ARREGLO>[3] = <VALOR> !!!! ERROR: ÍNDICE FUERA DE RANGO
        
        punto[0] = 1.8;
        punto[1] = 2.5;
        punto[2] = -1.2;
        // punto[3] = 100; // ERROR: Index out range
        
        System.out.println(x + y + z);
        System.out.println(p_x + p_y + p_z);
        
        // ACCEDER A LA MEMORIA 0 (cero)
        // punto[0]
        // ACCEDER A LA MEMORIA 1 (uno)
        // punto[1]
        // ACCEDER A LA MEMORIA 2 (dos)
        // punto[2]
        // ACCEDER A LA MEMORIA 3 (tres)
        // punto[3] !!!! ERROR: ÍNDICE FUERA DE RANGO
        // ACCEDER A LA MEMORIA -1 (menos uno)
        // punto[-1] !!!! ERROR: ÍNDICE FUERA DE RANGO
        
        System.out.println(punto[0] + punto[1] + punto[2]);
        
        System.out.println(punto[0] + punto[0] + punto[0]);
        
    }
    
}
