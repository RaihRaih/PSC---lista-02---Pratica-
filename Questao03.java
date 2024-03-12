/*Raissa Rodrigues - Sistemas de Informação
 *3. Escreva um programa que calcule o teorema de Pitágoras, representado pela expressão: c =a^2+b^2 */ 

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double a, b, c, raiz;

        System.out.println("Digite o valor de a: ");
        a = scanner.nextDouble();
        
        System.out.println("Digite o valor de b: ");
        b = scanner.nextDouble();

        c = (a*a) + (b*b);

        raiz =  Math.sqrt(c);

        System.out.println("Valor de C: "+ raiz);


    }
}
