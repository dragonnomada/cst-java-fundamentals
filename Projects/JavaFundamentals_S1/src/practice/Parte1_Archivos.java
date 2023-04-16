package practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Parte1_Archivos {

    public static void main(String[] args) throws FileNotFoundException {
       
        // 1. Declarar las variables
       int a, b;
       
       // 2. Crear un éscaner con fuente el archivo
       File file = new File("C:\\data\\sum.txt");
       Scanner scanner = new Scanner(file);
       
       // 3. Escanear los valores (desde el archivo)
       a = scanner.nextInt();
       b = scanner.nextInt();
       
       // 4. Computar la suma en otra variable
       int c = a + b;
       
       // 5. Reportar la suma en una impresión con formato
       System.out.printf("Resultado: %d + %d = %d %n", a, b, c);
        
    }
    
}
