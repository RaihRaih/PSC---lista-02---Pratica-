/*Raissa Rodrigues - Sistemas de Informação
 * Crie um programa que calcule a área, o perímetro e a diagonal de um retângulo. O resultado deve 
 * aparecer de maneira organizada e clara para a pessoa utilizadora. */
import java.util.Scanner;

public class Questao05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double area, perimetro, diagonal, largura, altura;

        System.out.println("Digite a largura do retângulo:");
        largura = scanner.nextDouble();

        System.out.println("Digite a altura do retângulo:");
        altura = scanner.nextDouble();

        // Calculando área - area= largura * altura
        area = largura * altura;

        // Calculando perímetro - perimetro = 2 * area
        perimetro = 2 * (largura + altura)

        // Calculando diagonal - diagonal^2 = largura^2 + altura^2
        diagonal = Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));

        System.out.println("Resultados:\nÁrea: " + area + "\nPerímetro: " + perimetro + "\nDiagonal: " + diagonal);

        scanner.close();
    }
}
