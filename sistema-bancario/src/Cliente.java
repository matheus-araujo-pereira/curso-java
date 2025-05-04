public class Cliente {

    String cpf;
    String nome;

    Cliente() {
        this.cpf = "Cliente sem CPF";
        this.nome = "Cliente sem nome";
    }

    Cliente(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }
}
