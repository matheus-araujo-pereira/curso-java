public class Carro {

    int cavalos;
    int capacidadeDoTanque;
    int combustivel;
    int kmPorLitro;
    String cor;
    String transmissao;
    String montadora;

    void abastecer (int litros) {
        int soma = combustivel + litros;

        if (soma > capacidadeDoTanque) {
            combustivel = capacidadeDoTanque;
            System.out.println("Sobrou " + (soma - capacidadeDoTanque));
        } else  {
            combustivel = soma;
        }
    }

    int autonomiaCombustivel () {
        int autonomia = kmPorLitro * combustivel;
        return autonomia;
    }
}
