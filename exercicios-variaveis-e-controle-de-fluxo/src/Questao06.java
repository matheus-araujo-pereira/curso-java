// Escreva um programa que calcule o perímetro e a área de um retângulo.

public class Questao06 {

    public static void main(String[] args) {

        double larguraDoRetangulo;
        double alturaDoRetangulo;
        double perimetroDoRetangulo;
        double areaDoRetangulo;

        larguraDoRetangulo = 10;
        alturaDoRetangulo = 5;

        perimetroDoRetangulo = (2 * larguraDoRetangulo) + (2 * alturaDoRetangulo);
        areaDoRetangulo = (larguraDoRetangulo * alturaDoRetangulo) / 2;

        System.out.println(perimetroDoRetangulo);
        System.out.println(areaDoRetangulo);
    }
}
