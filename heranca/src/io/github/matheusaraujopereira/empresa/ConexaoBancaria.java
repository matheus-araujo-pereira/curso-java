package io.github.matheusaraujopereira.empresa;

public class ConexaoBancaria {

  public void enviarPagamento(String cpf, double valor) {
    System.out.println("Pagamento de " + valor + " enviado para o CPF: " + cpf);
  }
}
