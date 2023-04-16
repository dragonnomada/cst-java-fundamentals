package practice;

import java.util.Scanner;

public class PracticeConditionals_001 {

    public static void main(String[] args) {
        
        double circulo_x, circulo_y, punto_x, punto_y, circulo_radio;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Dame el centro del círculo en x: ");
        circulo_x = scanner.nextDouble();
        
        System.out.print("Dame el centro del círculo en y: ");
        circulo_y = scanner.nextDouble();
        
        System.out.print("Dame el radio  del círculo: ");
        circulo_radio = scanner.nextDouble();
        
        System.out.print("Dame el punto en x: ");
        punto_x = scanner.nextDouble();
        
        System.out.print("Dame el punto en y: ");
        punto_y = scanner.nextDouble();
        
        double distancia = Math.sqrt(
                Math.pow(circulo_x - punto_x, 2) 
                        + Math.pow(circulo_y - punto_y, 2));
        
        if (distancia < circulo_radio) {
            System.out.println("DENTRO");
        } else {
            System.out.println("FUERA");
        }
        
    }
    
}
