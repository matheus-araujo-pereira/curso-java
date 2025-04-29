import java.util.Scanner;

public class CalcularIdadeComCondicao {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int anoAtual = input.nextInt();
        int anoDeNascimento = input.nextInt();
        int idade = anoAtual -  anoDeNascimento;

        if (idade < 18) {
            System.out.println("Menor de idade!");
        } else if (idade >= 60) {
            System.out.println("Idoso(a)!");
        } else {
            System.out.println("Maior de idade!");
        }
    }
}
