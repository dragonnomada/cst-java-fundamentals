
public class RepasoArreglos_002 {

    public static void main(String[] args) {
        
        int[] edades = new int[] { 14, 18, 4, 23, 45, 17, 3, 11, 29, 8, 86 };
        
        int edad_min = edades[0];
        
        for (int edad : edades) {
            if (edad_min > edad) {
                edad_min = edad;
            }
        }
        
        System.out.printf("EDAD MIN: %d %n", edad_min);
        
    }
    
}
