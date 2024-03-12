/*Raissa Rodrigues - Sistemas de Informação
 * 1. Crie um algoritmo que leia um valor de hora (HH:MM) e informe (calcule) quantos minutos se passaram desde o início do dia (00:00).*/

 import java.util.Scanner;

 public class Questao01 {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hora, minutos, tempoPassado;
    
        System.out.println("Digite as Horas: ");
        hora = scanner.nextInt();

        System.out.println("Digite os Minutos: ");
        minutos = scanner.nextInt();

        tempoPassado = hora * 60 + minutos;
        
        System.out.println("Se passaram  "+ tempoPassado + "  minutos desde o inicio do dia (00:00)");
          
    
    
    }
 }
