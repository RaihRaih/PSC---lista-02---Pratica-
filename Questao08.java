/*Raissa Rodrigues - Sistemas de Informação
8. Faça um programa que calcule o tempo necessário para o download de um arquivo
qualquer da internet. Deve-se informar o tamanho do arquivo em MB, a velocidade do 
link em Mbps e, retornar o tempo total em minutos.*/

import java.util.Scanner;

public class Questao08
{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        float tamanhoArquivo, velocidadeLink, tamanhoArquivoMb, tempoSegundos,tempoMinutos;
        System.out.print("Tamanho do arquivo (em MB): ");
        tamanhoArquivo = scanner.nextFloat();

        System.out.print("Velocidade do link (em Mbps): ");
        velocidadeLink = scanner.nextFloat();

        // 1 MB (Megabyte) tem 8 Mbps (Megabit)
        // Convertendo o tamanho do arquivo para Mb
        tamanhoArquivoMb = tamanhoArquivo * 8;

        // Calculando o tempo em segundos
        tempoSegundos = tamanhoArquivoMb / velocidadeLink;

        // Convertendo o tempo para minutos
        tempoMinutos = tempoSegundos / 60;

        System.out.println("Tempo de Download (minutos): " + tempoMinutos);

        scanner.close();
    }
}
