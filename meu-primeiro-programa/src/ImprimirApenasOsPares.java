public class ImprimirApenasOsPares {

    public static void main(String[] args) {

        int contador;
        int valor;

        contador = 100;
        valor = 0;

        while (valor <= contador){

            if (valor % 2 == 0){
                System.out.println("Valor: " + valor + " é par!");
            }

            valor++;
        }
    }
}
