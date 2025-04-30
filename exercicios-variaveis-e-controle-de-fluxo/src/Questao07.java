// Escreva um programa para ler o ano de nascimento de uma pessoa e escrever uma mensagem que diga se ela poderá ou não votar este ano.

import java.util.Scanner;

public class Questao07 {

    public static void main(String[] args) {

        int anoDeNascimento;
        int anoAtual;
        boolean podeVotar;

        Scanner input = new Scanner(System.in);

        anoDeNascimento = input.nextInt();
        anoAtual = 2025;

        podeVotar = ((anoAtual - anoDeNascimento) >= 18);

        if (podeVotar) {
            System.out.println("Você pode votar!");
        } else {
            System.out.println("Você não pode votar!");
        }

        input.close();
    }
}
