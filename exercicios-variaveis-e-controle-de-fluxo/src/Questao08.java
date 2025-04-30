// Dado que existe um mercado onde as maçãs custam R$ 0,30 cada se forem compradas menos do que uma dúzia, e R$ 0,25 se forem compradas pelo menos doze.
// Escreva um programa que leia o número de maçãs compradas, calcule e escreva o valor total da compra.

import java.util.Scanner;

public class Questao08 {

    public static void main(String[] args) {

        double valorDaMaca;
        int quantidadeDeMacas;
        double valorTotalDaCompra;

        Scanner input = new Scanner(System.in);

        quantidadeDeMacas = input.nextInt();

        if (quantidadeDeMacas > 0 && quantidadeDeMacas < 12) {
            valorDaMaca = 0.3;
            valorTotalDaCompra = valorDaMaca * quantidadeDeMacas;
            System.out.println(valorTotalDaCompra);
        } else if (quantidadeDeMacas >= 12) {
            valorDaMaca = 0.25;
            valorTotalDaCompra = valorDaMaca * quantidadeDeMacas;
            System.out.println(valorTotalDaCompra);
        } else {
            System.out.println("Nenhuma maça será comprada.");
        }

        input.close();
    }
}
