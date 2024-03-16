import java.util.Scanner;

public class Questao12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double potenciaEquipamento, horasPorDia, valorMensal, valorKWh, consumoKWhMes, consumoKWhDia, valorDia;
        int diasPorMes = 30;

        System.out.print("Informe a potência do equipamento (em Watts): ");
        potenciaEquipamento = scanner.nextDouble();

        System.out.print("Informe a quantidade de horas que o equipamento fica ligado por dia: ");
        horasPorDia = scanner.nextDouble();

        System.out.print("Informe o valor do KW/h (em reais): ");
        valorKWh = scanner.nextDouble();

        // Cálculo do consumo em KWh por dia
        consumoKWhDia = (potenciaEquipamento * horasPorDia) / 1000.0;

        // Cálculo do valor pago por dia
        valorDia = consumoKWhDia * valorKWh;

        // Cálculo do consumo em KWh por mês
        consumoKWhMes = consumoKWhDia * diasPorMes;

        // Cálculo do valor pago por mês
        valorMensal = valorDia * diasPorMes;

        System.out.printf("Consumo de energia por dia: %.2f KWh\n", consumoKWhDia);
        System.out.printf("Valor a ser pago por dia: R$ %.2f\n", valorDia);
        System.out.printf("Consumo de energia por mês: %.2f KWh\n", consumoKWhMes);
        System.out.printf("Valor a ser pago por mês: R$ %.2f\n", valorMensal);

        scanner.close();
    }
}
