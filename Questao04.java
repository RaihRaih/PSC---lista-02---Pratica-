/*Raissa Rodrigues - Sistemas de Informação
 * 4. Crie um programa para calcular a regra de três.
 */

 import java.util.Scanner;
 public class Questao04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double w, x, y, z; //as letras representam os numeros
        
        System.out.println("Digite o primeiro valor: ");
        w = scanner.nextDouble();

        System.out.println("Digite o segundo valor: ");
        x = scanner.nextDouble();
        
        System.out.println("Digite o terceiro valor: ");
        y = scanner.nextDouble();

        z = (w * x) / y ;
        
        System.out.println("Valor total da regra de tres: " + z);
        
    }
 }
