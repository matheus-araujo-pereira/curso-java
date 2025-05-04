package io.github.matheusaraujopereira.heranca;

public class Hipopotamo extends Animal {

  private int forcaDaMordida;

  public Hipopotamo(int idade, int forcaDaMordida) {
    super("Hipopótamo", idade);
    this.forcaDaMordida = forcaDaMordida;
  }

  public int getForcaDaMordida() {
    return forcaDaMordida;
  }

  public void setForcaDaMordida(int forcaDaMordida) {
    this.forcaDaMordida = forcaDaMordida;
  }

  public void ficarNaAgua() {
    System.out.println("Ficando na água...");
  }
}
