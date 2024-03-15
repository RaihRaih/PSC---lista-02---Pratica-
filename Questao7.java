/*Raissa Rodrigues - Sistemas de Informação
 * 7. Incremente o programa da questão 6, para informar o valor do metro quadrado da cerâmica 
 * escolhido e o valor total a ser pago. */

import java.util.Scanner;

public class Questao7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double largura, comprimento, ceramicaLargura, ceramicaComprimento, valorMetroQuadrado, area, areaCeramica, quantidadeCeramica, totalAPagar;

        //dados da area
        System.out.println("Digite a largura da area - em metros: ");
        largura = scanner.nextDouble();

        System.out.println("Digite o comprimento da area - em metros: ");
        comprimento = scanner.nextDouble();

        //dados da ceramica
        System.out.println("Digite a largura da ceramica - em metros: ");
        ceramicaLargura = scanner.nextDouble();

        System.out.println("Digite o comprimento da ceramica - em metros: ");
        ceramicaComprimento = scanner.nextDouble();

        System.out.print("\nInforme o valor do metro quadrado da cerâmica: ");
        valorMetroQuadrado = scanner.nextDouble();

        //calculos
        area = largura * comprimento;
        areaCeramica = ceramicaLargura * ceramicaComprimento;

        //funcao que arredonda os valores para cima  e adicionando 10% de acabamento- funcao math.ceil
        quantidadeCeramica = Math.ceil(area / areaCeramica * 0.10);
        totalAPagar = quantidadeCeramica * (valorMetroQuadrado * areaCeramica);

        System.out.println("\nQuantidade necessaria de ceramica: " + quantidadeCeramica + " pecas");
        System.out.println("Valor total a ser pago: R$" + totalAPagar);

        scanner.close();
    }
}
