package practice;

public class PracticeArrays_002 {

    public static void main(String[] args) {
        
        String[] nombres = new String[5];
        
        nombres[0] = "Pepe El Toro";
        nombres[1] = "Bety";
        nombres[2] = "Paco";
        nombres[3] = "Kary";
        nombres[4] = "Fanny";
        //nombres[5] = "Carlos"; // ERROR: ÍNDICE FUERA DE RANGO
        
        System.out.printf("NOMBRE: %s (%d) %n", nombres[0], nombres[0].length());
        System.out.printf("NOMBRE: %s (%d) %n", nombres[1], nombres[1].length());
        System.out.printf("NOMBRE: %s (%d) %n", nombres[2], nombres[2].length());
        System.out.printf("NOMBRE: %s (%d) %n", nombres[3], nombres[3].length());
        System.out.printf("NOMBRE: %s (%d) %n", nombres[4], nombres[4].length());
    }
    
}
