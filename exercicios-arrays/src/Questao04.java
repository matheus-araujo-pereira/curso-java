// Crie um programa Java que declare um array contendo 5 números double (ex: 10.5, 20.7, 15.3, 40.2, 8.9) e encontre o maior elemento no array.

public class Questao04 {

    public static void main(String[] args) {

        double[] numeros = {10.5, 20.7, 15.3, 40.2, 8.9};
        double maior = numeros[0];

        for (double numero : numeros) {
            if (numero > maior) {
                maior = numero;
            }
        }

        System.out.println(maior);
    }
}
