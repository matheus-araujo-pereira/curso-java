// Escreva um programa Java que declare dois arrays de inteiros com o mesmo tamanho e calcule a soma dos elementos correspondentes em ambos os arrays, armazenando o resultado em um terceiro array.
// Em seguida, imprima o array resultante.

public class Questao07 {

    public static void main(String[] args) {

        int[] array1 = {1,2,3,4,5};
        int[] array2 = {6,7,8,9,10};
        int[] soma = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            soma[i] = array1[i] + array2[i];
        }

        System.out.println("Array resultante da soma:");

        for (int numero : soma) {
            System.out.println(numero + " ");
        }
    }
}
