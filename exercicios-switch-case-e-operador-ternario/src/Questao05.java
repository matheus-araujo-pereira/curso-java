// Escreva um programa Java que permita ao usuário digitar a idade de uma pessoa e utilize o operador ternário para determinar se a pessoa é maior ou menor de idade, exibindo uma mensagem correspondente.

import java.util.Scanner;

public class Questao05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua idade:");

        int idade = sc.nextInt();

        String mensagem = (idade >= 18) ? "Maior de idade" : "Menor de idade";

        System.out.println(mensagem);

        sc.close();
    }
}
