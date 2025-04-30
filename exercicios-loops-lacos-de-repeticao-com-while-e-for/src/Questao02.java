// Escreva um programa Java que calcule a soma dos números de 1 a 100 usando um loop while.

public class Questao02 {

    public static void main(String[] args) {

        int numero;
        int soma;

        numero = 0;
        soma = 0;

        while (numero < 100) {
            numero = numero + 1;
            soma = soma + numero;
        }

        System.out.println(soma);
    }
}
