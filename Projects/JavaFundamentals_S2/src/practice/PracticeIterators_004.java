package practice;

import java.util.Scanner;

public class PracticeIterators_004 {

    public static void main(String[] args) {
        
        double[] calificaciones = new double[5];
        
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < calificaciones.length; i++) {
            
            System.out.printf("Dame la calificación %d: ", i + 1);
            
            calificaciones[i] = scanner.nextDouble();
            
        }
        
        double calificaciones_suma = 0;
        
        for (int i = 0; i < calificaciones.length; i++) {
            
            calificaciones_suma += calificaciones[i];
            
        }
        
        System.out.printf("SUMA: %.2f %n", calificaciones_suma);
        
        double calificaciones_promedio = calificaciones_suma / calificaciones.length;
        
        System.out.printf("PROMEDIO: %.2f %n", calificaciones_promedio);
        
    }
    
}
