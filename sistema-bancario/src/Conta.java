public class Conta {

    private Cliente titular;
    private int numero;
    private double saldo;

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

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSaldo(int saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

    void visualizarSaldo() {
        System.out.println(this.saldo);
    }
}
