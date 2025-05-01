// Crie um programa Java que declare um array de strings com nomes de pessoas e imprima todos os nomes em ordem inversa.

public class Questao02 {

    public static void main(String[] args) {

        String[] nomes = {"Matheus", "Sophia", "Gustavo"};

        for (int i = nomes.length - 1; i >= 0; i--) {
            System.out.println(nomes[i]);
        }
    }
}
