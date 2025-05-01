// Escreva um programa Java que preencha um array de inteiros com valores aleatórios entre 1 e 100 e, em seguida, imprima o índice do primeiro elemento par encontrado no array.

import java.util.Random;

public class Questao05 {

    public static void main(String[] args) {

        int[] numeros = new int[10];

        Random gerador = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = gerador.nextInt(100) + 1;
        }

        int indicePar = -1;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                indicePar = i;
                break;
            }
        }

        if (indicePar != -1) {
            System.out.println(indicePar);
        } else {
            System.out.println("Sem elementos pares no ARRAY!");
        }
    }
}
