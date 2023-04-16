package repaso;

public class RepasoVariables_001 {

    public static void main(String[] args) {
        
        String texto = "";
        
        // <VARIABLE> = <VARIABLE*> + <VALOR>;
        // => <VARIABLE> += <VALOR>
        texto += "Reporte Ventas\n";
        texto += "------------------------\n";
        
        double ganancias = 1800.32;
        
        texto += "Ganancias: $" + ganancias + "\n";
        
        texto += "------------------------\n";
        
        System.out.println(texto);
        
    }
    
}
