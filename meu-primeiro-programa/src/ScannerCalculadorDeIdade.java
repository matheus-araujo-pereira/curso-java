import java.util.Scanner;

public class ScannerCalculadorDeIdade {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int anoAtual = input.nextInt();
        int anoDeNascimento = input.nextInt();
        int idade = anoAtual -  anoDeNascimento;

        System.out.println("Idade: " + idade);

        input.close();
    }
}
