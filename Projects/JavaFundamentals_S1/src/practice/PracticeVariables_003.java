package practice;

import java.util.Scanner;

public class PracticeVariables_003 {

    public static void main(String[] args) {

        // Problema: Calcular la distancia euclidiana
        // entre dos puntos A:(x1, y1) <-> B:(x2, y2)
        // La distancia es: RAÍZ[ (x2 - x1)^2 + (y2 - y1)^2 ]
        double x1, y1, x2, y2;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Dame la coordena x1: ");
        x1 = scanner.nextDouble();

        System.out.print("Dame la coordena y1: ");
        y1 = scanner.nextDouble();

        System.out.print("Dame la coordena x2: ");
        x2 = scanner.nextDouble();

        System.out.print("Dame la coordena y2: ");
        y2 = scanner.nextDouble();

        double distancia = Math.sqrt(
                Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("------------------------");
        System.out.printf("La distancia de "
                + "(%.2f, %.2f) a (%.2f, %.2f) es: %.16f %n",
                x1, y1, x2, y2, distancia);
        System.out.println("------------------------");

    }

}
