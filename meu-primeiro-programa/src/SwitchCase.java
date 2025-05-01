import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("Digite uma opção do menu:");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("3 - Excluir");
            System.out.println("0 - Sair");

            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Cadastrar");
                    break;
                case  2:
                    System.out.println("Listar");
                    break;
                case 3:
                    System.out.println("Excluir");
                    break;
                case 0:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Escolha uma opcao valida");
            }
        } while (opcao != 0);

        input.close();
    }
}
