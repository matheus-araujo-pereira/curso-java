package io.github.matheusaraujopereira.empresa;

public abstract class Funcionario {

  private String nome;
  private String cpf;
  private double salario;

  public double calcularBonificacao() {
    return (salario / 10) + 50;
  }

  public void imprimirRemuneracao() {
    double remuneracao = salario + this.calcularBonificacao();
    System.out.println("O/A funcionário(a) " + nome + " possui uma remuneração de " + remuneracao);
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }
}
