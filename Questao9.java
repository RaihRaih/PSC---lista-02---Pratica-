/*Raissa Rodrigues - Sistemas de Informação
9. Crie um programa para calcular o IMC de uma pessoa. Ele deve receber o peso atual em quilogramas e a altura,
em centímetros, e exibir o peso ideal e o peso ideal ajustado. Dica: https://eurofarma.com.br/calculadoras/calculadora-de-peso-ideal 
Utilize este como referência para seus testes. Obs. O IMC é apenas uma referência, um médico deve ser 
consultado para entender as necessidades de cada indivíduo.*/

import java.util.Scanner;

public class Questao9
{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        double imc, pesoAtual, altura;
        String sexo;
        char pessoa;
        
        System.out.print("Digite o peso Atual (em Kg): ");
        pesoAtual = scanner.nextFloat();
        
        System.out.print("Digite a Altura (em Cm): ");
        altura = scanner.nextFloat();
        
        imc = pesoAtual/Math.pow(altura , 2);
        
        
        System.out.print("Se você for uma mulher biológica, digite [m]"+"\nSe voce for um homem biologico, digite [h]: ");
        sexo = scanner.next();
        pessoa = sexo.charAt(0);
                
        if (pessoa == 'm' || pessoa == 'M') {
        System.out.printf("IMC: %.2f%n", imc);

            if (imc > 24) {
                System.out.println("Está com Obesidade!");
                
            } else if (imc < 19) {
                System.out.println("Está Abaixo do Normal!");
                
            } else {
                System.out.println("Está Normal!");
            }
            
        } else if (pessoa == 'h' || pessoa == 'H') {
            System.out.printf("IMC: %.2f%n", imc);
            if (imc > 29.9) {
                System.out.println("Está com Obesidade!");
                
            } else if (imc < 20 ) {
                System.out.println("Está Abaixo do Normal!");
                
            } else {
                System.out.println("Está Normal!");
            }
        } else {
            System.out.println("Opção inválida. Digite 'm' ou 'h'.");
        }

       
        scanner.close();
    }
}
