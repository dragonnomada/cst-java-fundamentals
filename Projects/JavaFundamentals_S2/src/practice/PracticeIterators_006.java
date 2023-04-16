package practice;

public class PracticeIterators_006 {

    public static void main(String[] main) {
        
        double[] calificaciones = new double[] { 10, 8, 9, 6, 7 };
        
        double suma = 0;
        
        for (double valor : calificaciones) {
            
            suma = suma + valor;
            // suma = 0.0 + 10.0 = 10.0
            // suma = 10.0 + 8.0 = 18.0
            // suma = 18.0 + 9.0 = 27.0
            // suma = 27.0 + 6.0 = 33.0
            // suma = 33.0 + 7.0 = 40.0
            
        }
        
        System.out.printf("SUMA: %.2f %n", suma);
        
    }
    
}
