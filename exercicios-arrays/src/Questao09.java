// Crie um programa Java que preencha um array de inteiros com valores aleatórios entre 1 e 50 e, em seguida, imprima a média dos valores maiores que 25.

import java.util.Random;

public class Questao09 {

    public static void main(String[] args) {

        int[] numeros = new int[10];
        Random random = new Random();
        double soma = 0;
        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(50) + 1;

            if (numeros[i] > 25) {
                soma += numeros[i];
                contador++;
            }
        }

        if (contador > 0) {
            double media = soma / contador;

            System.out.println(media);
        } else {
            System.out.println("Não tem valores maiores que 25 no array.");
        }
    }
}
