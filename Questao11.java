/*Raissa Rodrigues - Sistemas de Informação
11. Muitas pessoas têm dúvida sobre qual o gasto com energia de determinados equipamentos que possuem. 
Crie um algoritmo que receba a potência do equipamento em Watts, a quantidade de horas que ele fica ligado por dia, 
e o valor do KW/h. O cálculo é feito multiplicando a potência pela quantidade de horas, depois, dividindo por mil. 
Ao final, apresente a quantidade de KWh consumidos pelo equipamento e qual será o valor pago por eles.*/

import java.util.Scanner;

public class Questao11
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    double potenciaEquipamento, horasPorDia, quantidadetotalHoras, valorKWh, consumoKWh, valorPago;
	    
	    
	    System.out.print("Informe a potência do equipamento (em Watts): ");
        potenciaEquipamento = scanner.nextDouble();

        System.out.print("Informe a quantidade de horas que o equipamento fica ligado por dia: ");
        horasPorDia = scanner.nextDouble();

        System.out.print("Informe o valor do KW/h (em reais): ");
        valorKWh = scanner.nextDouble();

        // Cálculo do consumo em KWh
        consumoKWh = (potenciaEquipamento * horasPorDia) / 1000.0;

        // Cálculo do valor pago
        valorPago = consumoKWh * valorKWh;

        System.out.printf("Consumo de energia: %.2f KWh%n", consumoKWh);
        System.out.printf("Valor a ser pago: R$ %.2f%n", valorPago);

        scanner.close();
    }
}
