// Escreva um programa Java que verifique se um número é um número perfeito.
// Um número perfeito é aquele que é igual à soma de seus divisores próprios (excluindo ele mesmo).

public class Questao07 {

    public static void main(String[] args) {

        int numero = 1;
        int somaDivisores = 0;

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                somaDivisores += i;
            }
        }

        if (somaDivisores == numero) {
            System.out.println(numero + " é um número perfeito!");
        } else {
            System.out.println("Não é um número perfeito!");
        }
    }
}
