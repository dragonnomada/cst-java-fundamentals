
import java.util.ArrayList;
import java.util.Scanner;


public class RepasoArreglos_004 {

    public static void main(String[] args) {
        
        ArrayList<Integer> edades = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);
        
        boolean continuar;
        
        do {
            System.out.print("Dame una edad: ");
            int edadCapturada = scanner.nextInt();
            scanner.nextLine();
            edades.add(edadCapturada);
            System.out.print("¿Desea continuar? [SI/NO]: ");
            continuar = scanner.nextLine().toUpperCase().equals("SI");
        } while (continuar);
        
        int edad_min = edades.get(0);
        
        for (int edad : edades) {
            if (edad_min > edad) {
                edad_min = edad;
            }
        }
        
        System.out.printf("EDAD MIN: %d %n", edad_min);
        
    }
    
}
