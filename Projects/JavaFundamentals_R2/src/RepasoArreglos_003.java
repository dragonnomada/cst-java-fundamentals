
import java.util.ArrayList;
import java.util.Scanner;


public class RepasoArreglos_003 {

    public static void main(String[] args) {
        
        ArrayList<Integer> edades = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);
        
        int edadCapturada;
        
        do {
            System.out.print("Dame una edad (cero o negativo para finalizar): ");
            edadCapturada = scanner.nextInt();
            if (edadCapturada > 0) {
                edades.add(edadCapturada);
            }
        } while (edadCapturada > 0);
        
        int edad_min = edades.get(0);
        
        for (int edad : edades) {
            if (edad_min > edad) {
                edad_min = edad;
            }
        }
        
        System.out.printf("EDAD MIN: %d %n", edad_min);
        
    }
    
}
