package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class PracticeIterators_005 {

    public static void main(String[] args) {
        
        ArrayList<Double> calificaciones = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Número de calificaciones a ingresar: ");
        int n = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            
            System.out.printf("Calificación %d: ", i + 1);
            double calificacion = scanner.nextDouble();
            
            calificaciones.add(calificacion);
            
        }
        
        double calificaciones_suma = 0;
        
        for (int i = 0; i < calificaciones.size(); i++) {
            
            calificaciones_suma += calificaciones.get(i);
            
        }
        
        System.out.printf("SUMA: %.2f %n", calificaciones_suma);
        
        double calificaciones_promedio = calificaciones_suma / calificaciones.size();
        
        System.out.printf("PROMEDIO: %.2f %n", calificaciones_promedio);
        
    }
    
}
