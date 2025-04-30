public class ContagemDeLetras {

    public static void main(String[] args) {

        String nome;
        int quantidadeDeLetras;
        int indice;
        boolean isLetra;
        char letra;

        nome = "Matheus Araujo Pereira";
        quantidadeDeLetras = 0;

        for (indice = 0; indice < nome.length(); indice++) {
            letra = nome.charAt(indice);
            isLetra = Character.isLetter(letra);

            if (isLetra) {
                System.out.println("Letra " + letra);
                quantidadeDeLetras++;
            }
        }

        System.out.println("Quantidade de letras: " + quantidadeDeLetras);
    }
}
