package io.github.matheusaraujopereira.heranca;

public class Panda extends Animal {

  private String corPrimaria;
  private String corSecundaria;

  public Panda(int idade, String corPrimaria, String corSecundaria) {
    super("Panda", idade);
    this.corPrimaria = corPrimaria;
    this.corSecundaria = corSecundaria;
  }

  public String getCorPrimaria() {
    return corPrimaria;
  }

  public void setCorPrimaria(String corPrimaria) {
    this.corPrimaria = corPrimaria;
  }

  public String getCorSecundaria() {
    return corSecundaria;
  }

  public void setCorSecundaria(String corSecundaria) {
    this.corSecundaria = corSecundaria;
  }

  public void escalarArvore() {
    System.out.println("Escalando árvore...");
  }

  public void comerBambu() {
    System.out.println("Comendo bambu...");
  }
}
