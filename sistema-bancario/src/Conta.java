public class Conta {

    Cliente titular;
    int numero;
    double saldo;

    Conta(Cliente titular, int numero, double saldo) {

        if (titular == null) {
            System.out.println("Você não pode construir um cliente com o nome nulo!");
        }

        this.titular = titular;
        this.numero = numero;

        if (saldo >= 0) {
            this.saldo = saldo;
        }
    }

    void visualizarSaldo() {
        System.out.println(this.saldo);
    }
}
