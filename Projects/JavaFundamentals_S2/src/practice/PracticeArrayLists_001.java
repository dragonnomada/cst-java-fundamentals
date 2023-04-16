package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class PracticeArrayLists_001 {

    static ArrayList<String> frutas = new ArrayList<>();
    
    static void mostrarMenu() {
        
        System.out.println("Selecciona una opción:");
        System.out.println("----------------------");
        System.out.println("1. Mostrar las frutas");
        System.out.println("2. Agregar fruta");
        System.out.println("3. Salir");
        System.out.println("----------------------");
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();
        
        switch (opcion) {
            
            case 1:
                mostrarFrutas();
                break;
            
            case 2:
                agregarFruta();
                break;
                
            case 3:
                System.out.println("Adiós");
                break;
                
            default:
                System.out.println("La opción no es válida");
                mostrarMenu();
                break;
            
        }
        
    }
    
    static void mostrarFrutas() {
        
        System.out.println("FRUTAS:");
        System.out.println("----------------------");
        System.out.printf("TOTAL: %d %n", frutas.size());
        System.out.println("----------------------");
        if (frutas.size() >= 1) {
            System.out.printf("PRIMERA: %s %n", frutas.get(0));
        }
        if (frutas.size() >= 2) {
            System.out.printf("SEGUNDA: %s %n", frutas.get(1));
        }
        if (frutas.size() >= 3) {
            System.out.printf("TERCERA: %s %n", frutas.get(2));
        }
        
        if (frutas.size() >= 6) {
            System.out.printf("ANTEPENÚLTIMA: %s %n", frutas.get(frutas.size() - 3));
        }
        if (frutas.size() >= 5) {
            System.out.printf("PENÚLTIMA: %s %n", frutas.get(frutas.size() - 2));
        }
        if (frutas.size() >= 4) {
            System.out.printf("ÚLTIMA: %s %n", frutas.get(frutas.size() - 1));
            System.out.println("----------------------");
        } else {
            System.out.println("----------------------");
        }
        
        mostrarMenu();
        
    }
    
    static void agregarFruta() {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Dame el nombre de la fruta: ");
        String nombre = scanner.nextLine();
        
        frutas.add(nombre);
        
        mostrarMenu();
        
    }
    
    public static void main(String[] args) {
        
        mostrarMenu();
        
    }
    
}
