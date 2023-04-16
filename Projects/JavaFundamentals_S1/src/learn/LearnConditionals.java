package learn;

public class LearnConditionals {

    public static void main(String[] args) {
        
        // Condicional: Es una estructura que
        //              permite evaluar una expresión
        //              para determinar si un bloque
        //              de sentencias es ejecutado
        
        double peso = 48;
        double estatura = 1.36;
        
        double imc = peso / Math.pow(estatura, 2);
        
        // IF (EXP. LÓGICA) BLOQUE
        // BLOQUE -> { SENTENCIA1; SENTECIA2; ... }
        
        /*if (imc < 18.5) {
            System.out.println("BAJO DE PESO");
        }*/
        
        // IF (EXP. LÓGICA) BLOQUE_V ELSE BLOQUE_F 
        
        /*if (imc < 18.5) {
            System.out.println("BAJO DE PESO");
        } else {
            System.out.println("NO BAJO DE PESO");
        }*/
        
        // IF (EXP. LÓGICA_1) BLOQUE_1 
        // ELSE IF (EXP. LÓGICA 2) BLOQUE_2
        // ELSE IF (EXP. LÓGICA 3) BLOQUE_3
        // ...
        // ELSE BLOQUE_X
        
        if (imc < 18.5) {
            System.out.println("BAJO DE PESO");
        } else if (imc < 25) {
            System.out.println("PESO NORMAL");
        } else if (imc < 30) {
            System.out.println("ALTO PESO");
        } else {
            System.out.println("PESO EXTREMADAMENTE ALTO");
        }
        
    }
    
}
