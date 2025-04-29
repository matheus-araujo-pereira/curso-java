import java.util.Scanner;

public class CalculadoraDeMedia {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float primeiraNota = sc.nextFloat();
        float segundaNota = sc.nextFloat();
        float terceiraNota = sc.nextFloat();
        float media = (primeiraNota + segundaNota + terceiraNota) / 3;

        System.out.println("Media: " + media);

        if (media >= 6) {
            System.out.println("Passou!");
        } else {
            System.out.println("Nao passou!");
        }

        sc.close();
    }
}
