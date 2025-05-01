// Escreva um programa Java que utilize o operador ternário para determinar se um número fornecido pelo usuário é par ou ímpar, exibindo uma mensagem correspondente.

import java.util.Scanner;

public class Questao02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número:");

        int numero = sc.nextInt();
        String resultado = (numero % 2 == 0) ? "par" : "impar";

        System.out.println("O número é " + resultado);

        sc.close();
    }
}
