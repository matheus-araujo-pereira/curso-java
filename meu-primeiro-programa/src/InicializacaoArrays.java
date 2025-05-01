import java.util.Arrays;

public class InicializacaoArrays {

    public static void main(String[] args) {
        
        int idade = 23;
        String nome = "Matheus Araujo Pereira";
        String telefone = "(79) 99998-4882";
        String[] filhos = {"Filho Um", "Filho Dois", "Filho Tres", "Filho Quatro"};
        int[] impares = {1, 3, 5, 7, 9};
        int[] pares = {0, 2, 4, 6, 8};

        System.out.println(idade);
        System.out.println(nome);
        System.out.println(telefone);
        System.out.println(Arrays.toString(filhos));
        System.out.println(Arrays.toString(impares));
        System.out.println(Arrays.toString(pares));

        String[] nomes = new String[10];

        nomes[0] = "Juan";
        nomes[1] = "Maria";
        nomes[2] = "Pedro";
        nomes[3] = "Juan";
        nomes[4] = "Maria";
        nomes[5] = "Pedro";
        nomes[6] = "Juan";
        nomes[7] = "Pedro";
        nomes[8] = "Juan";
        nomes[9] = "Pedro";

        System.out.println(nomes[0]);
        System.out.println(nomes[1]);
        System.out.println(nomes[2]);
        System.out.println(nomes[3]);
        System.out.println(nomes[4]);
        System.out.println(nomes[5]);
        System.out.println(nomes[6]);
        System.out.println(nomes[7]);
        System.out.println(nomes[8]);
        System.out.println(nomes[9]);
    }
}
