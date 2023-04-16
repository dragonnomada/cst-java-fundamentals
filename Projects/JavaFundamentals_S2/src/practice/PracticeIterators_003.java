package practice;

import java.util.Scanner;

public class PracticeIterators_003 {

    public static void main(String[] args) {
        
        double[] calificaciones = new double[5];
        
        //calificaciones[0] = ...;
        //calificaciones[1] = ...;
        //...
        //calificaciones[4] = ...;
    
        // BLOQUE:
        // System.out.printf("Dame la calificación %d: ", i);
        // calificaciones[i] = scanner.nextDouble();
        
        Scanner scanner = new Scanner(System.in);
        
        // LEEMO LAS 5 CALIFICACIONES
        for (int i = 0; i < calificaciones.length; i++) {
            
            System.out.printf("Dame la calificación %d: ", i + 1);
            calificaciones[i] = scanner.nextDouble();
            
        }
        
        // BLOQUE: System.out.printf("CALIFICACIÓN %d: %.1f", i, calificaciones[i]);
        
        // IMPRIMIR LAS 5 CALIFICACIONES
        for (int i = 0; i < calificaciones.length; i++) {
            
            System.out.printf("CALIFICACIÓN %d: %.1f %n", i + 1, calificaciones[i]);
            
        }
        
    }
    
}
