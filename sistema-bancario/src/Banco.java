public class Banco {

    void depositar(Conta conta, double valor) {
        double saldo = conta.saldo;
        conta.saldo = saldo + valor;
    }

    void sacar(Conta conta, double valor) {
        double saldo = conta.saldo;
        double novoSaldo = saldo - valor;

        if (novoSaldo < 0) {
            System.out.println("Saldo insuficiente");
        } else {
            conta.saldo = novoSaldo;
        }
    }

    void transferir(Conta contaOrigem, Conta contaDestino, double valor) {
        double saldoOrigem = contaOrigem.saldo;
        double novoSaldoOrigem = saldoOrigem - valor;

        if (novoSaldoOrigem < 0) {
            System.out.println("Saldo insuficiente");
        } else  {
            contaOrigem.saldo = novoSaldoOrigem;
            contaDestino.saldo = contaDestino.saldo + valor;
        }
    }
}
