// Escreva um programa Java que calcule a soma dos dígitos de um número inteiro.

public class Questao06 {

    public static void main(String[] args) {

        int numero;
        int soma;

        numero = 12345;
        soma = 0;

        while (numero != 0) {
            soma += numero % 10;
            numero /= 10;
        }

        System.out.println(soma);
    }
}
