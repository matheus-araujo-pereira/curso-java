package io.github.matheusaraujopereira.interfaces;

public class CredencialLogin implements Autenticacao {

  private String login;
  private String senha;

  public CredencialLogin(String login, String senha) {
    this.login = login;
    this.senha = senha;
  }

  @Override
  public String getId() {
    return this.login;
  }

  @Override
  public String getSenha() {
    return this.senha;
  }

  @Override
  public boolean isUsaSenha() {
    return true;
  }

}
