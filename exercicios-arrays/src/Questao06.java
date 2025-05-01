// Crie um programa Java que solicite ao usuário que insira o tamanho de um array de inteiros e, em seguida, preencha o array com números fornecidos pelo usuário.
// Por fim, imprima o array.

import java.util.Scanner;

public class Questao06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho do ARRAY:");

        int tamanho = sc.nextInt();
        int[] numeros = new int[tamanho];

        System.out.println("Digite os números do ARRAY:");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }

        System.out.println("Array inserido:");

        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        sc.close();
    }
}
