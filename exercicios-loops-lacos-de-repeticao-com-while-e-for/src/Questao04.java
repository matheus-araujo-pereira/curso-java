// Escreva um programa Java que imprima os números primos entre 1 e 50 usando um loop for.

public class Questao04 {

    public static void main(String[] args) {

        boolean isPrimo;
        int contador;
        int divisor;

        for (contador = 2; contador <= 50; contador++) {

            isPrimo = true;

            for (divisor = 2; divisor <= Math.sqrt(contador); divisor++) {

                if (contador % divisor == 0) {
                    isPrimo = false;
                    break;
                }
            }

            if (isPrimo) {
                System.out.println(contador + " é primo!");
            }
        }
    }
}
