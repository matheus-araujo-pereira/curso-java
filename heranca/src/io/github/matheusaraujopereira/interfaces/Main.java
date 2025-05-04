package io.github.matheusaraujopereira.interfaces;

public class Main {

  public static void main(String[] args) {

    Autenticador autenticador = new Autenticador();

    Autenticacao email = new CredencialEmail("matheus@email.com", "1234");
    boolean isEmailAutenticado = autenticador.autenticar(email);
    System.out.println("Email autenticado: " + isEmailAutenticado);

    Autenticacao login = new CredencialLogin("admin", null);
    boolean isLoginAutenticado = autenticador.autenticar(login);
    System.out.println("Login autenticado: " + isLoginAutenticado);

    Autenticacao biometria = new CredencialBiometrica(new byte[] {});
    boolean isBiometriaAutenticada = autenticador.autenticar(biometria);
    System.out.println("Biometria autenticada: " + isBiometriaAutenticada);
  }
}
