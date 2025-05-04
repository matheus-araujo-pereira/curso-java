package io.github.matheusaraujopereira.empresa;

public class Main {

  public static void main(String[] args) {

    Tecnico tecnico = new Tecnico();
    tecnico.setNome("Matheus");
    tecnico.setCpf("123.456.789-00");
    tecnico.setSalario(5000);
    tecnico.setEspecialidade("Desenvolvedor Java");
    tecnico.imprimirRemuneracao();
    tecnico.calcularBonificacao();
    tecnico.calcularBonificacaoAnual();

    System.out.println("A bonificação do técnico " + tecnico.getNome() + " é de: " + tecnico.calcularBonificacao());
    System.out.println(
        "A bonificação anual do técnico " + tecnico.getNome() + " é de: " + tecnico.calcularBonificacaoAnual());

    Gerente gerente = new Gerente();
    gerente.setNome("Ana");
    gerente.setCpf("987.654.321-00");
    gerente.setSalario(8000);
    gerente.imprimirRemuneracao();
    gerente.calcularBonificacao();
    gerente.calcularBonificacaoAnual();

    System.out.println("A bonificação do gerente " + gerente.getNome() + " é de: " + gerente.calcularBonificacao());
    System.out.println(
        "A bonificação anual do gerente " + gerente.getNome() + " é de: " + gerente.calcularBonificacaoAnual());
  }
}
