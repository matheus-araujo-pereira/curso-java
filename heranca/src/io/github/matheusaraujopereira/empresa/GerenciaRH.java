package io.github.matheusaraujopereira.empresa;

public class GerenciaRH {

  private ConexaoBancaria conexaoBancaria;

  public GerenciaRH(ConexaoBancaria conexaoBancaria) {
    this.conexaoBancaria = conexaoBancaria;
  }

  public void pagarBonificacaoAnual(Funcionario funcionario) {
    double bonificacaoAnual = funcionario.calcularBonificacaoAnual();
    conexaoBancaria.enviarPagamento(funcionario.getCpf(), bonificacaoAnual);
    System.out.println(
        "Pagamento de bonificação anual de " + bonificacaoAnual + " enviado para o CPF: " + funcionario.getCpf());
    enviarEmail();
  }

  public void enviarEmail() {
    System.out.println("Email enviado com sucesso!");
  }
}
