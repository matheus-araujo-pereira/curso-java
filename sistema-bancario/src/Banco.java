public class Banco {

    void depositar(Conta conta, double valor) {
        double saldo = conta.getSaldo();
        conta.setSaldo((int) (saldo + valor));
    }

    void sacar(Conta conta, double valor) {
        double saldo = conta.getSaldo();
        double novoSaldo = saldo - valor;

        if (novoSaldo < 0) {
            System.out.println("Saldo insuficiente");
        } else {
            conta.setSaldo((int) novoSaldo);
        }
    }

    void transferir(Conta contaOrigem, Conta contaDestino, double valor) {
        double saldoOrigem = contaOrigem.getSaldo();
        double novoSaldoOrigem = saldoOrigem - valor;

        if (novoSaldoOrigem < 0) {
            System.out.println("Saldo insuficiente");
        } else  {
            contaOrigem.setSaldo((int) novoSaldoOrigem);
            contaDestino.setSaldo((int) (contaDestino.getSaldo() + valor));
        }
    }
}
