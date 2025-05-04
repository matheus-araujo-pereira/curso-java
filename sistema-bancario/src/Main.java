public class Main {

    public static void main(String[] args) {

        Cliente matheus  = new Cliente();
        matheus.nome = "Matheus";
        matheus.cpf = "063.189.135-80";

        Cliente tahiane = new Cliente();
        tahiane.nome = "Tahiane";
        tahiane.cpf = "063.189.135-81";

        Conta contaMatheus = new Conta();
        contaMatheus.titular = matheus;
        contaMatheus.numero = 1;
        contaMatheus.saldo = 1500;

        Conta contaTahiane = new Conta();
        contaTahiane.titular = tahiane;
        contaTahiane.numero = 2;
        contaTahiane.saldo = 20000;

        Banco sistema = new Banco();

        contaMatheus.visualizarSaldo();
        contaTahiane.visualizarSaldo();

        sistema.depositar(contaMatheus, 250);
        sistema.depositar(contaTahiane, 330);

        contaMatheus.visualizarSaldo();
        contaTahiane.visualizarSaldo();

        sistema.sacar(contaMatheus, 210);
        sistema.sacar(contaTahiane, 410);

        contaMatheus.visualizarSaldo();
        contaTahiane.visualizarSaldo();

        sistema.transferir(contaMatheus, contaTahiane, 2500);
        sistema.transferir(contaTahiane, contaMatheus, 2500);

        contaMatheus.visualizarSaldo();
        contaTahiane.visualizarSaldo();
    }
}
