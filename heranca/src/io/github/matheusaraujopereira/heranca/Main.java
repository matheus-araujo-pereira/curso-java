package io.github.matheusaraujopereira.heranca;

public class Main {

  public static void main(String[] args) {

    Panda panda = new Panda();
    panda.setNome("Panda");
    panda.setIdade(5);
    panda.setCorPrimaria("Preto");
    panda.setCorSecundaria("Branco");
    panda.andar();
    panda.comer();
    panda.dormir();
    panda.escalarArvore();
    panda.fazerBarulho();

    System.out.println("Nome: " + panda.getNome());
    System.out.println("Idade: " + panda.getIdade());
    System.out.println("Cor Primária: " + panda.getCorPrimaria());
    System.out.println("Cor Secundária: " + panda.getCorSecundaria());
    System.out.println("Fazendo barulho de panda...");

    panda.fazerBarulho();
    panda.comerBambu();
    panda.escalarArvore();
    panda.dormir();
    panda.andar();

    Hipopotamo hipopotamo = new Hipopotamo();
    hipopotamo.setNome("Hipopótamo");
    hipopotamo.setIdade(8);
    hipopotamo.setForcaDaMordida(2000);
    hipopotamo.andar();
    hipopotamo.comer();
    hipopotamo.dormir();
    hipopotamo.ficarNaAgua();

    System.out.println("Nome: " + hipopotamo.getNome());
    System.out.println("Idade: " + hipopotamo.getIdade());
    System.out.println("Força da Mordida: " + hipopotamo.getForcaDaMordida());
    System.out.println("Ficando na água...");

    hipopotamo.ficarNaAgua();
    hipopotamo.comer();
    hipopotamo.dormir();
    hipopotamo.andar();
    hipopotamo.fazerBarulho();
  }
}
