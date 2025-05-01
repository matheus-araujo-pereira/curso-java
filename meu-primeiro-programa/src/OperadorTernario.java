public class OperadorTernario {

    public static void main(String[] args) {

        int idade = 20;
        int idadeMinima = 18;
        int anoNascimento = 2000;
        boolean variavel = idade > idadeMinima && anoNascimento >= 2000 && idadeMinima < 20;

        if (variavel) {
            System.out.println("BLA BLA BLA");
        }

        String deMaior = idade >= 18 ? "SIM!" : "NÃO!";

        System.out.println(deMaior);
    }
}
