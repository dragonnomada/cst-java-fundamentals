package repaso;

import java.util.Scanner;

public class RepasoCondicionales_001 {

    static void mostrarMenu() {
        System.out.println("Selecciona una opcion:");
        System.out.println("----------------------");
        System.out.println("1. Di Hola mundo");
        System.out.println("2. Suma 1 + 2");
        System.out.println("3. Salir");
        System.out.println("----------------------");
        
        leerOpcion();
    }
    
    static void leerOpcion() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Opcion: ");
        int opcion = scanner.nextInt();
        
        procesarOpcion(opcion);
    }
    
    static void procesarOpcion(int opcion) {
        
        switch (opcion) {
            
            case 1:
                System.out.println("> Hola mundo!");
                mostrarMenu();
                break;
                
            case 2:
                System.out.printf("> 1 + 2 = %d %n", 1 + 2);
                mostrarMenu();
                break;
                
            case 3:
                System.out.println("> ADIOS!!!");
                break;
            
            default:
                System.out.println("> La opción no es válida");
                mostrarMenu();
                break;
                
        }
        
    }
    
    public static void main(String[] args) {
        
        mostrarMenu();
        
        // <BLOQUE> :: { SENTENCIA_1; SENTENCIA_2; SENTENCIA_3; ... }
        
        // IF (EXP. LÓGICA 1) <BLOQUE_1>
        //*ELSE IF (EXP. LÓGICA 2) <BLOQUE_2>
        //*ELSE IF (EXP. LÓGICA 3) <BLOQUE_3>
        // ...
        //*ELSE <BLOQUE_NEGACIÓN>
        
        // SWITCH (VALOR_OBJETIVO) { 
        //    CASE VALOR_1: SENTENCIAS...; BREAK;
        //    CASE VALOR_2: SENTENCIAS...; BREAK;
        //    CASE VALOR_3: SENTENCIAS...; BREAK;
        //    ...
        //    DEFAULT: SENTENCIAS...; BREAK;
        // }
        
    }
    
}
