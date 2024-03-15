/*Raissa Rodrigues - Sistemas de Informação
10. A organização mundial da saúde recomenda que sejam ingeridos 35 ml de água por dia, 
para cada quilograma de peso. Crie um algoritmo que recebe o peso de uma pessoa e informe a 
quantidade recomendada de água em litros.*/

import java.util.Scanner;

public class Questao10
{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        double litrosAgua, pesoAtual, converteMlParaLitro;
        
        System.out.print("Digite o peso Atual (em Kg): ");
        pesoAtual = scanner.nextFloat();

        
        litrosAgua = pesoAtual * 37;
        converteMlParaLitro = litrosAgua / 1000;
        
        System.out.printf(" Voce deve tomar  %.2f", converteMlParaLitro , "  Litros de agua por dia.");

        scanner.close();
    }
}
