// Escreva um programa que declare uma variável do tipo double e calcule o quadrado desse número.

import java.util.Scanner;

public class Questao02 {

    public static void main(String[] args) {

        double numero;
        double quadradoDoNumero;

        Scanner numeroDigitado = new Scanner(System.in);

        numero = numeroDigitado.nextDouble();
        quadradoDoNumero = numero * numero;

        System.out.println("O quadrado de " + numero + " é " + quadradoDoNumero);

        numeroDigitado.close();
    }
}
