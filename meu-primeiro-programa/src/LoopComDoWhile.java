import java.util.Scanner;

public class LoopComDoWhile {

    public static void main(String[] args) {

        int numero;

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Digite um numero: ");
            numero = input.nextInt();
        } while(numero >= 1 && numero <= 10);

        System.out.println("O número digitado: " + numero);

        input.close();
    }
}
