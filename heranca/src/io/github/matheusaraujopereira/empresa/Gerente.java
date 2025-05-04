package io.github.matheusaraujopereira.empresa;

public class Gerente extends Funcionario {

  @Override
  public double calcularBonificacao() {
    return (getSalario() / 10) + 100;
  }

  @Override
  public double calcularBonificacaoAnual() {
    return (getSalario() * 3) + 200;
  }
}
