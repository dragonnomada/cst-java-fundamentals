package practice;

import java.util.ArrayList;

public class PracticeIterators_007 {

    public static void main(String[] main) {
        
        //double[] calificaciones = new double[] { 10, 8, 9, 6, 7 };
        
        ArrayList<Double> calificaciones = new ArrayList<>();
        
        calificaciones.add(10.0);
        calificaciones.add(8.0);
        calificaciones.add(9.0);
        calificaciones.add(6.0);
        calificaciones.add(4.0);
        
        double suma = 0;
        
        for (double elemento : calificaciones) {
            
            suma = suma + elemento;
            // suma = 0.0 + 10.0 = 10.0
            // suma = 10.0 + 8.0 = 18.0
            // suma = 18.0 + 9.0 = 27.0
            // suma = 27.0 + 6.0 = 33.0
            // suma = 33.0 + 7.0 = 40.0
            
        }
        
        System.out.printf("SUMA: %.2f %n", suma);
        
    }
    
}
