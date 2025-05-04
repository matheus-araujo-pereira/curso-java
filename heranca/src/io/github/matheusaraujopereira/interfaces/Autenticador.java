package io.github.matheusaraujopereira.interfaces;

public class Autenticador {

  public boolean autenticar(Autenticacao autenticacao) {
    if (autenticacao.isUsaSenha()) {
      return autenticacao.getId().equals("matheus@email.com") && autenticacao.getSenha().equals("1234");
    } else {
      return autenticacao.getId().equals("admin");
    }
  }
}
