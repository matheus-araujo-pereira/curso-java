// Escreva um programa que leia as medidas dos lados de um triângulo e escreva se ele é Equilátero, Isósceles ou Escaleno.

import java.util.Scanner;

public class Questao09 {

    public static void main(String[] args) {

        double primeiroLado;
        double segundoLado;
        double terceiroLado;
        boolean condicaoParaEquilatero;
        boolean primeiraCondicaoParaIsosceles;
        boolean segundaCondicaoParaIsosceles;
        boolean terceiraCondicaoParaIsosceles;
        boolean condicaoParaEscaleno;

        Scanner sc = new Scanner(System.in);

        primeiroLado = sc.nextDouble();
        segundoLado = sc.nextDouble();
        terceiroLado = sc.nextDouble();

        condicaoParaEquilatero = (primeiroLado == segundoLado && primeiroLado == terceiroLado);

        primeiraCondicaoParaIsosceles = (primeiroLado == segundoLado && primeiroLado != terceiroLado);
        segundaCondicaoParaIsosceles = (primeiroLado != segundoLado && primeiroLado == terceiroLado);
        terceiraCondicaoParaIsosceles = (segundoLado != primeiroLado && segundoLado == terceiroLado);

        condicaoParaEscaleno = (primeiroLado != segundoLado && primeiroLado != terceiroLado && segundoLado != terceiroLado);

        if (condicaoParaEquilatero) {
            System.out.println("Triângulo Equilátero");
        }

        if (primeiraCondicaoParaIsosceles || segundaCondicaoParaIsosceles || terceiraCondicaoParaIsosceles) {
            System.out.println("Triângulo Isósceles");
        }

        if (condicaoParaEscaleno) {
            System.out.println("Triângulo Escaleno");
        }

        sc.close();
    }
}
