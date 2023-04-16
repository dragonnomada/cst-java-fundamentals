// Los paquetes establecen un conjunto de códigos
// Sirven para permitir acceso entre códigos que compartan recursos
// y estén relacionados
package main;

// Las clases son diseñadas mediente class <NOMBRE>
// Los nombres de las clases se convienen como:
// - Usan la notación PascalCase dónde la primer letra es mayúscula
//   y en cambio de palabra se alterna a mayúscula y lo demás
//   en minúsculas y guiones bajos
//   Ejemplos: PagoTarjeta, App1, Robot29_dm_8, FacturaNomina
// - El nombre de la clase debe ser exactamente igual al
//   nombre del archivo .java
// - Un archivo .java sólo debe contener una clase, enumeración 
//   o interfaces
public class Main {

    // El punto de ejecución es un método estático
    // que no devuelve nada y recibe los argumentos
    // pasados por la terminal, y ejecuta inmediatamente
    // todo lo definido en su cuerpo (el cuerpo es { ... })
    // y todas las instrucciones dentro del cuerpo se llaman
    // sentencias (cada sentencia se separa por ; si
    // la sentencia no contine un cuerpo anidado)
    public static void main(String[] args) {
    
        // Declarar una variable
        // <TIPO> <NOMBRE>;
        int a;
        
        // Una variable almacena un valor según su tipo de dato
        // este valor puede cambiar durante el programa, si no
        // es un valor final
        
        a = 123; // 123 -> Literal entera (int literal)
        
        a = 100 + 20 + 3; // Expresión artimética con literales
        
        // Declarar y asignar una variable
        // <TIPO> <NOMBRE> = <VALOR>;
        int b = 456; // Literal
        
        int c = a + b; // Expresión aritmética con variables
        
        // System Out: Print Line
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    
    }
    
}
