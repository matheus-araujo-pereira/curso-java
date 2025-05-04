public class Cliente {

    public static int QUANTIDADE_DE_CLIENTES;

    private String cpf;
    private String nome;

    Cliente(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
        incrementarClientes();
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public static void incrementarClientes() {
        Cliente.QUANTIDADE_DE_CLIENTES++;
    }
}
