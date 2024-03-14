import java.util.ArrayList;
import java.util.List;

// Classe que representa um banco
class Banco {
    private String nome; // Nome do banco
    private List<Cliente> clientes; // Lista de clientes do banco

    // Construtor que recebe o nome do banco e inicializa a lista de clientes
    public Banco(String nome) {
        this.nome = nome; // Define o nome do banco
        this.clientes = new ArrayList<>(); // Inicializa a lista de clientes como um ArrayList vazio
    }

    // Método para adicionar um cliente à lista de clientes do banco
    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente); // Adiciona o cliente à lista de clientes
    }

    // Método para obter a lista de clientes do banco
    public List<Cliente> getClientes() {
        return clientes; // Retorna a lista de clientes do banco
    }

    // Método para obter o nome do banco
    public String getNome() {
        return nome; // Retorna o nome do banco
    }
}