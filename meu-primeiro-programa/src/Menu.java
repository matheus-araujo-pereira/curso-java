import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("Digite uma opção do menu:");
            System.out.println("1 - Sanduiche");
            System.out.println("2 - Pizza");
            System.out.println("3 - Sorvete");
            System.out.println("0 - Sair");

            opcao = input.nextInt();

            if (opcao == 0) {
                System.out.println("Saiu do menu");
            } else if (opcao == 1) {
                System.out.println("Um sanduiche é bom demais!");
            } else if (opcao == 2) {
                System.out.println("Uma pizza é bom demais!");
            } else {
                System.out.println("Um sorvete é bom demais!");
            }

        } while (opcao != 0);

        input.close();
    }
}
