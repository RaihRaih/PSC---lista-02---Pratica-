/* Raissa Rodrigues- Sistemas de Informação
 * Escreva um algoritmo que recebe dois pontos no plano cartesiano, P1=(x1,y1) e P2=(x2,y2)e calcula a distância entre 
 * eles, dada por d(P1,P2)=(x1-x2)2+(y1-y2)2 .

 */

import java.util.Scanner;

public class Questao14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x1, y1, x2, y2, p1, p2, distancia;
        System.out.print("Informe X de P1: ");
        x1 = scanner.nextDouble();

        System.out.print("Informe Y de P1: ");
        y1 = scanner.nextDouble();

        System.out.print("Informe X de P2:: ");
        x2 = scanner.nextDouble();

        System.out.print("Informe Y de P2:: ");
        y2 = scanner.nextDouble();

        distancia = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));

        System.out.printf("\nA distância entre os pontos P1 e P2 é: %.2f%n", distancia);
        scanner.close();
    }
}
