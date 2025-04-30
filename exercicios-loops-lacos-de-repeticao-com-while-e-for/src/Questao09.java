// Faça um programa que verifica se um ano fornecido pelo usuário é bissexto.

import java.util.Scanner;

public class Questao09 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int ano = sc.nextInt();

        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
            System.out.println("Ano Bissexto!");
        } else {
            System.out.println("Ano Normal!");
        }

        sc.close();
    }
}
