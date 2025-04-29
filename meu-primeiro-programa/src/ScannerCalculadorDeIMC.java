import java.util.Scanner;

public class ScannerCalculadorDeIMC {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float massaCorporea = input.nextFloat();
        float altura = input.nextFloat();
        float imc = massaCorporea / (altura * altura);

        System.out.println("IMC: " + imc);

        input.close();
    }
}
