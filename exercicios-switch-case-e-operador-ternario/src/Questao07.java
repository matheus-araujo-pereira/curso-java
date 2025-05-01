// Escreva um programa Java que simule um sistema de autenticação.
// Solicite ao usuário que digite um nome de usuário e uma senha.
// Utilize uma expressão booleana para verificar se o nome de usuário é "admin" e a senha é "1234".
// Em caso afirmativo, exiba uma mensagem de sucesso; caso contrário, exiba uma mensagem de erro.

import java.util.Scanner;

public class Questao07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome de usuário:");

        String usuario = sc.nextLine();

        System.out.println("Digite a sua senha:");

        String senha = sc.nextLine();

        if (usuario.equals("matheus") && senha.equals("matheus")) {
            System.out.println("Logado com sucesso!");
        } else {
            System.out.println("Usuário ou Senha incorretos!");
        }

        sc.close();
    }
}
