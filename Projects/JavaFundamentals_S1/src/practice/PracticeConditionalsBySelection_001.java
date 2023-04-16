package practice;

import java.util.Scanner;

public class PracticeConditionalsBySelection_001 {

    public static void main(String[] args) {
        
        // Hay una brújula apuntando al norte, y un robot observando
        // otra dirección. Según los valores enteros codificados:
        // 1 = NORTE
        // 2 = SUR
        // 3 = ESTE
        // 4 = OESTE
        // 0 = DESCONOCIDA
        
        String direccion;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("DIRECCION MIRA EL ROBOT (NORTE, SUR, ESTE, OESTE): ");
        direccion = scanner.nextLine();
        
        int direccion_codificada;
        
        switch (direccion.toUpperCase().trim()) {
            
            case "NORTE":
                direccion_codificada = 1;
                System.out.println("EL ROBOT AL NORTE");
                break;
            case "SUR":
                direccion_codificada = 2;
                System.out.println("EL ROBOT AL SUR");
                break;
            case "ESTE":
                direccion_codificada = 3;
                System.out.println("EL ROBOT AL ESTE");
                break;
            case "OESTE":
                direccion_codificada = 4;
                System.out.println("EL ROBOT AL OESTE");
                break;
            default:
                direccion_codificada = 0;
                System.out.println("EL ROBOT A DESCONOCIDO");
                break;
            
        }
        
        int siguiente_direccion_codificada;
        
        switch (direccion_codificada) {
            
            case 1:
                siguiente_direccion_codificada = 3;
                break;
            case 2:
                siguiente_direccion_codificada = 4;
                break;
            case 3:
                siguiente_direccion_codificada = 2;
                break;
            case 4:
                siguiente_direccion_codificada = 1;
                break;
            default:
                siguiente_direccion_codificada = 0;
                break;
                
        }
        
        switch (siguiente_direccion_codificada) {
            
            case 1:
                System.out.println("EL ROBOT AHORA MIRA AL NORTE");
                break;
            case 2:
                System.out.println("EL ROBOT AHORA MIRA AL SUR");
                break;
            case 3:
                System.out.println("EL ROBOT AHORA MIRA AL ESTE");
                break;
            case 4:
                System.out.println("EL ROBOT AHORA MIRA AL OESTE");
                break;
            default:
                System.out.println("EL ROBOT AHORA MIRA A DESCONOCIDO");
                break;
                
        }
        
    }
    
}
