package practice;

public class PracticeVariables_001 {

    public static void main(String[] args) {
        
        float estatura = 1.55f;
        float peso = 46.2f;
        
        float imc = peso / (estatura * estatura);
        
        System.out.printf("ESTATURA: %.2f m %n", estatura);
        System.out.printf("PESO: %.2f kg %n", peso);
        System.out.println("---------------");
        System.out.printf("IMC: %.2f %n", imc);
        System.out.println("===============");
        System.out.println("IMC < 18.5: BAJO DE PESO");
        System.out.println("18.5 <= IMC < 25: PESO NORMAL");
        System.out.println("25 <= IMC: SOBREPESO");
        
    }
    
}
