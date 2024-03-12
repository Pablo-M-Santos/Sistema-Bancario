 class Cliente {
    private String nome; // Nome do cliente
    private Banco banco; // Banco em que o cliente possui conta
    private Conta conta; // Conta do cliente no banco

    // Construtor que recebe o nome do cliente, o banco e a conta
    public Cliente(String nome, Banco banco, Conta conta) {
        this.nome = nome;
        this.banco = banco;
        this.conta = conta;
    }

    // Método para obter o nome do cliente
    public String getNome() {
        return nome;
    }

    // Método para obter o banco do cliente
    public Banco getBanco() {
        return banco;
    }

    // Método para obter a conta do cliente
    public Conta getConta() {
        return conta;
    }
}
