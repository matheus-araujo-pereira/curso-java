// Crie um programa Java que simule uma calculadora de impostos.
// Solicite ao usuário que informe o salário bruto e utilize uma expressão booleana para determinar se o salário está sujeito ao imposto de renda (acima de R$ 2000,00).
// Se estiver, calcule e imprima o valor do imposto (15% sobre o excedente).

import java.util.Scanner;

public class Questao04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu salário bruto:");

        double salarioBruto = sc.nextDouble();

        if (salarioBruto > 2000.0) {

            double imposto = (salarioBruto - 2000.0) * 0.15;

            System.out.println("Imposto a ser pago: R$ " + imposto);
        } else {
            System.out.println("Isento de imposto de renda!");
        }

        sc.close();
    }
}
