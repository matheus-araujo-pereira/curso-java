package io.github.matheusaraujopereira.empresa;

public class Gerente extends Funcionario {

  @Override
  public double calcularBonificacao() {
    return (getSalario() / 10) + 100;
  }
}
