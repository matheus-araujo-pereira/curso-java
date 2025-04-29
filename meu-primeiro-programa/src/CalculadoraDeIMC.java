public class CalculadoraDeIMC {

    public static void main(String[] args) {

        float massaCorporea = 100.0f;
        float altura = 1.78f;
        float imc = massaCorporea / (altura * altura);

        System.out.println("IMC: " + imc);
    }
}
