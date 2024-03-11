/*Raissa Rodrigues - Sistemas de Informação
 * 19 .Escreva um programa que calcule os quadrados e cubos dos números 
 de 0 a 10 e imprima os valores resultantes em formato de tabela como a seguir:*/

 import java.util.Scanner;

 public class LerValorHora {
 
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