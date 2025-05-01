// Escreva um programa Java que solicite ao usuário que insira 5 números inteiros e armazene-os em um array.
// Em seguida, calcule e imprima a média dos números.

import java.util.Scanner;

public class Questao03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];

        System.out.println("Digite 5 números inteiros para calcular a média:");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }

        int soma = 0;

        for (int numero : numeros) {
            soma = soma + numero;
        }

        double media = (double) soma / numeros.length;

        System.out.println(media);

        sc.close();
    }
}
