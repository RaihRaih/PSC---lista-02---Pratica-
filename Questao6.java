/*Raissa Rodrigues - Sistemas de informação
 * 6. Faça um programa para uma loja de cerâmica que ajuda no cálculo da quantidade de revestimento necessário para uma obra. 
 * A pessoa utilizadora deve informar as medidas de largura e comprimento da área que será revestida e da cerâmica escolhida.
 * Sempre arredonde o valor para cima, e acrescente dez por cento para o acabamento.
 */

import java.util.Scanner;

public class Questao6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double largura, comprimento, ceramicaLargura, ceramicaComprimento, area, areaCeramica, quantidadeCeramica;

        //dados da area
        System.out.println("Digite a largura da area: ");
        largura = scanner.nextDouble();

        System.out.println("Digite o comprimento da area: ");
        comprimento = scanner.nextDouble();

        //dados da ceramica
        System.out.println("Digite a largura da ceramica: ");
        ceramicaLargura = scanner.nextDouble();

        System.out.println("Digite o comprimento da ceramica: ");
        ceramicaComprimento = scanner.nextDouble();

        area = largura * comprimento;
        areaCeramica = ceramicaLargura * ceramicaComprimento;

        //funcao que arredonda os valores para cima  e adicionando 10% de acabamento- funcao math.ceil
        quantidadeCeramica = Math.ceil(area / areaCeramica * 0.10);

        System.out.println("\nQuantidade necessaria de ceramica + 10% de acabamento: " + quantidadeCeramica + " pecas");

        scanner.close();
    }
}
