// Escreva um programa Java que imprima os números de 1 a 100, substituindo os múltiplos de 3 por "Fizz" e os múltiplos de 5 por "Buzz".
// Para os números que são múltiplos de ambos, imprima "FizzBuzz".
// Pode utilizar qualquer laço de repetição (while ou for).

public class Questao05 {

    public static void main(String[] args) {

        int contador;

        contador = 0;

        while (contador <= 100) {
            contador = contador + 1;

            if (contador % 3 == 0 && contador % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (contador % 3 == 0) {
                System.out.println("Fizz");
            } else if (contador % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(contador);
            }
        }
    }
}
