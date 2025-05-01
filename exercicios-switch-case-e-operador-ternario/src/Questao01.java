// Escreva um programa Java que utilize a estrutura de controle switch-case para determinar o dia da semana com base em um número fornecido pelo usuário (1 para Domingo, 2 para Segunda-feira, etc.), exibindo uma mensagem correspondente.

import java.util.Scanner;

public class Questao01 {

    public static void main(String[] args) {

        String diaDaSemana;
        int numeroDoDiaDaSemana;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um N° de 1 a 7:");

        numeroDoDiaDaSemana = sc.nextInt();

        switch (numeroDoDiaDaSemana) {
            case 1:
                diaDaSemana = "Domingo";
                break;
            case 2:
                diaDaSemana = "Segunda";
                break;
            case 3:
                diaDaSemana = "Terça";
                break;
            case 4:
                diaDaSemana = "Quarta";
                break;
            case 5:
                diaDaSemana = "Quinta";
                break;
            case 6:
                diaDaSemana = "Sexta";
                break;
            case 7:
                diaDaSemana = "Sábado";
                break;
            default:
                diaDaSemana = "Dia inválido!";
                break;
        }

        System.out.println("O dia da semana é " +  diaDaSemana);

        sc.close();
    }
}
