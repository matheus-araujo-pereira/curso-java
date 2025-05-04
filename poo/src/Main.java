public class Main {

    public static void main(String[] args) {

        Carro punto = new Carro();

        punto.cavalos = 100;
        punto.cor = "Preto";
        punto.transmissao = "Manual";
        punto.montadora = "Fiat";
        punto.capacidadeDoTanque = 100;
        punto.combustivel = 0;
        punto.kmPorLitro = 10;

        Carro civic = new Carro();

        civic.cavalos = 150;
        civic.cor = "Branco";
        civic.transmissao = "Automatica";
        civic.montadora = "Honda";
        civic.capacidadeDoTanque = 120;
        civic.combustivel = 0;
        civic.kmPorLitro = 8;

        System.out.println("Combustivel do Punto: " + punto.combustivel);
        System.out.println("Combustivel do Civic: " + civic.combustivel);

        punto.abastecer(110);
        civic.abastecer(150);

        System.out.println("Combustivel do Punto: " + punto.combustivel);
        System.out.println("Combustivel do Civic: " + civic.combustivel);

        System.out.println("Autonomia do Punto: " + punto.autonomiaCombustivel());
        System.out.println("Autonomia do Civic: " + civic.autonomiaCombustivel());
    }
}
