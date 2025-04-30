// Tendo como entrada a altura e o sexo (codificado da seguinte forma: digitando 1:feminino e digitando 2:masculino) de uma pessoa, construa um programa que calcule e imprima seu peso ideal, utilizando as seguintes fórmulas:
// para homens: (72.7 * Altura) – 58
// para mulheres: (62.1 * Altura) – 44.7

import java.util.Scanner;

public class Questao10 {

    private static final String MENSAGEM_ALTURA = "Digite a sua altura em centímetros:";
    private static final String MENSAGEM_SEXO = "Digite 1 se o sexo for feminino e 2 se for masculino:";

    public static void main(String[] args) {

        double altura;
        int sexo;
        double pesoIdeal;

        Scanner ler = new Scanner(System.in);

        System.out.println(MENSAGEM_ALTURA);
        altura = ler.nextDouble();

        System.out.println(MENSAGEM_SEXO);
        sexo = ler.nextInt();

        if (sexo == 1) {
            pesoIdeal = (62.1 * altura) - 44.7;
            System.out.println(pesoIdeal);
        } else if (sexo == 2) {
            pesoIdeal = (72.7 * altura) - 58;
            System.out.println(pesoIdeal);
        } else {
            System.out.println("Lá ele!");
        }

        ler.close();
    }
}
