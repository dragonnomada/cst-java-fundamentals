package practice;

// El Scanner es un objeto que nos permite
// escanear (leer/extraer) datos sobre un flujo
// de datos (terminal, archivo, socket, ...)
import java.util.Scanner;

public class PracticeVariables_002 {

    public static void main(String[] args) {
        
        // 1. Crear una instancia (objeto) de tipo Scanner
        // <CLASE> <NOMBRE OBJETO> = new <CLASE>(<PARÁMETROS ...>);
        // System.in - Representa un flujo 
        //             desde la entrada estándar (terminal + teclado)
        Scanner scanner = new Scanner(System.in); 
        
        System.out.print("Dame tu estatura (en metros): ");
        
        // 2. Recuperar valores desde el éscaner
        // nextInt() - El siguiente entero escrito
        // nextFloat() - El siguiente decimal corto escrito
        // nextBoolean() - El siguiente valor lógico escrito
        // nextDouble() - El siguiente decimal largo escrito
        // nextLong() - El siguiente entero largo escrito
        // nextLine() - Toda la linea escrita
        // next() - El siguiente caracter escrito
        float estatura = scanner.nextFloat();
        
        System.out.printf("ESTATURA: %.2f m %n", estatura);
        
        System.out.print("Dame tu peso (en kilogramos): ");
        
        float peso = scanner.nextFloat();
        
        System.out.printf("PESO: %.2f kg %n", peso);
        
        float imc = peso / (estatura * estatura);
        
        System.out.println("---------------");
        System.out.printf("IMC: %.2f %n", imc);
        System.out.println("===============");
        System.out.println("IMC < 18.5: BAJO DE PESO");
        System.out.println("18.5 <= IMC < 25: PESO NORMAL");
        System.out.println("25 <= IMC: SOBREPESO");
        
        // Una vez que ya no se utilice se puede cerrar el escáner
        // * Hazlo una sola vez por flujo y preferente al final
        scanner.close();
        
    }
    
}
