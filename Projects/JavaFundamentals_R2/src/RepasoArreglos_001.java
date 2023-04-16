
public class RepasoArreglos_001 {

    public static void main(String[] args) {
        
        int[] edades = new int[] { 14, 18, 4, 23, 45, 17, 3, 11, 29, 8, 86 };
        
        int edad_min = edades[0];
        int edad_indice = 0;
        
        for (int i = 1; i < edades.length; i++) {
            
            if (edad_min > edades[i]) {
                edad_min = edades[i];
                edad_indice = i;
            }
            
        }
        
        System.out.printf("EDAD MIN: %d %n", edad_min);
        System.out.printf("ÍNDICE: %d %n", edad_indice);
        
    }
    
}
