package io.github.matheusaraujopereira.interfaces;

public class CredencialBiometrica implements Autenticacao {

  private byte[] fotoRosto;

  public CredencialBiometrica(byte[] fotoRosto) {
    this.fotoRosto = fotoRosto;
  }

  @Override
  public String getId() {
    return new String(this.fotoRosto);
  }

  @Override
  public String getSenha() {
    return null;
  }

  @Override
  public boolean isUsaSenha() {
    return false;
  }

}
