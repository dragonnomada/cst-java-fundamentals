package learn;

public class LearnVariables {
    
    public static void main(String[] args) {
        
        // Tipos de datos:
        // boolean - 8bits Valor lógico true | false
        // char - 8bits Caracter
        // short - 16bits Entero corto -32,768 - +32,767
        // int - 32bits Entero entre -2,147,483,648 - +2,147,483,647
        // long - 64bits Entero largo
        // float - 32bits Decimal corto -1.y...y^-138 - +1.z...z^+138
        // double - 64bits Decimal largo -1.y...y^-1023 - +-1.z...z^-1022
        // String - <n>bits Texto corto y largo
        
        String nombre = "Gansito";
        double precio = 21.59;
        int existencias = 1000;
        float iva = 0.16f;
        float ieps = 0.03f;
        
        double impuestos = precio * iva + precio * ieps + iva * ieps;
        double precio_con_impuestos = (precio * (1 + iva)) * (1 + ieps);
        
        double ganacia_esperada = precio * existencias;
        
        // System Out: Print Format
        // (<FORMATO>, [<PARÁMETROS> ...])
        // %d -> entero
        // %f -> decimal
        // %s -> texto
        // %c -> caracter
        // %b -> valor lógico
        // %x -> entero en hexadecimal
        // %o -> entero en octal
        // %n -> salto de línea
        // %0Nd -> entero a N dígitos relleno de ceros
        // %.Mf -> decimal a M decimales
        //System.out.printf("Precio: $%.2f (Con impuestos $%.2f) %n", 
        //        precio, precio_con_impuestos);
     
        System.out.println("Reporte del producto");
        System.out.println("----------------------------------");
        System.out.printf("NOMBRE         : %17s %n", nombre);
        System.out.printf("PRECIO         :           $%6.2f %n", precio);
        System.out.printf("IMPUESTOS      :           $%6.2f %n", impuestos);
        System.out.printf("PRECIO+IVA+IEPS:           $%6.2f %n", precio_con_impuestos);
        System.out.println("----------------------------------");
        
    }
    
}
