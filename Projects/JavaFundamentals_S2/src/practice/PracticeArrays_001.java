package practice;

public class PracticeArrays_001 {
    
    public static void main(String[] args) {
        
        double[] calificaciones = new double[10];
        
        calificaciones[0] = 9.5; // Primero
        calificaciones[1] = 6.2; // Segundo
        calificaciones[2] = 4.5; // Tercero
        calificaciones[3] = 8.8; // Cuarto
        calificaciones[4] = 7.2; // Quinto
        calificaciones[5] = 9.1; // Sexto
        calificaciones[6] = 7.8; // Séptimo
        calificaciones[7] = 8.1; // Octavo
        calificaciones[8] = 9.4; // Noveno
        calificaciones[9] = 10; // Décimo
        
        System.out.println("Calificaciones:");
        System.out.println("---------------------");
        System.out.printf("TOTAL: %d %n", calificaciones.length);
        System.out.println("---------------------");
        System.out.printf("PRIMERO: %.1f %n", calificaciones[0]);
        System.out.printf("SEGUNDO: %.1f %n", calificaciones[1]);
        System.out.printf("PRIMERO: %.1f %n", calificaciones[2]);
        System.out.println("---------------------");
        System.out.printf("ANTEPENÚLTIMO: %.1f %n", calificaciones[calificaciones.length - 3]);
        System.out.printf("PENÚLTIMO: %.1f %n", calificaciones[calificaciones.length - 2]);
        System.out.printf("ÚLTIMO: %.1f %n", calificaciones[calificaciones.length - 1]);
        System.out.println("---------------------");
        
    }
    
}
