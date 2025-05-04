package io.github.matheusaraujopereira.empresa;

public class Main {

  public static void main(String[] args) {

    Tecnico tecnico = new Tecnico();
    tecnico.setNome("Matheus");
    tecnico.setCpf("123.456.789-00");
    tecnico.setSalario(5000);
    tecnico.setEspecialidade("Desenvolvedor Java");
    tecnico.imprimirRemuneracao();

    Gerente gerente = new Gerente();
    gerente.setNome("Ana");
    gerente.setCpf("987.654.321-00");
    gerente.setSalario(8000);
    gerente.imprimirRemuneracao();
  }
}
