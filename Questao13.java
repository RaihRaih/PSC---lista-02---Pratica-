/*Raissa Rodrigues - Sistemas de Informação
 * 13. Escreva um programa que seja capaz de realizar a soma de duas frações, não é necessário simplificar.
 * As entradas serão o numerador e, o denominador da primeira fração, seguidos do numerador e, o denominador da segunda fração. 
 * O resultado também deverá ser exibido em formato de fração. e.g: ⅗ */

import java.util.Scanner;

public class Questao13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numerador1, denominador1, numerador2, denominador2, numeradorResultado, denominadorResultado;

        System.out.print("Informe primeiro numerador: ");
        numerador1 = scanner.nextDouble();

        System.out.print("Informe primeiro denominador: ");
        denominador1 = scanner.nextDouble();

        System.out.print("Informe segundo numerador: ");
        numerador2 = scanner.nextDouble();

        System.out.print("Informe segundo denominador: ");
        denominador2 = scanner.nextDouble();

        denominadorResultado = denominador1 * denominador2;
        numeradorResultado = (numerador1 * denominador2) + (numerador2 * denominador1);

        // Exibindo o resultado
        System.out.println("\nA soma das frações é: ");
        System.out.println("    " + numerador1 + "   " + numerador2 + "   " + numeradorResultado);
        System.out.println("    --- + --- = ---");
        System.out.println("    " + denominador1 + "   " + denominador2 + "   " + denominadorResultado);

        scanner.close();

    }
}
