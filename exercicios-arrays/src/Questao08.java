// Crie um programa Java que declare um array de inteiros e verifique se ele está ordenado de forma crescente.

public class Questao08 {

    public static void main(String[] args) {

        int[] numeros = {1,2,3,4,9};
        boolean ordenado = true;

        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i] > numeros[i + 1]) {
                ordenado = false;
                break;
            }
        }

        if (ordenado) {
            System.out.println("Ordenado de forma crescente!");
        } else {
            System.out.println("Não está ordenado de forma crescente!");
        }
    }
}
