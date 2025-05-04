public class Main {

    public static void main(String[] args) {

        Cliente matheus  = new Cliente("Matheus", "063.189.135-80");
        Cliente tahiane = new Cliente("Tahiane", "063.189.135-82");

        Conta contaMatheus = new Conta(matheus, 1, 1500);
        Conta contaTahiane = new Conta(tahiane, 2, 20000);

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
